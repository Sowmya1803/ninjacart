package com.ninjacart.config;

import java.util.Properties;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
	@EnableTransactionManagement
	@EnableJpaRepositories("com")
	@PropertySource("classpath:application.properties")
	public class DataConfig {

		private final String PROPERTY_SHOW_SQL = "hibernate.show_sql";
		private final String PROPERTY_DIALECT = "hibernate.dialect";

		@Autowired
		Environment env;

		@Bean
		LocalContainerEntityManagerFactoryBean entityManagerFactory() {
			LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
			lfb.setDataSource(dataSource1());
			lfb.setPersistenceProviderClass(HibernatePersistenceProvider.class);
			lfb.setPackagesToScan("com");
			lfb.setJpaProperties(hibernateProps());
			return lfb;
		}

		Properties hibernateProps() {
			Properties properties = new Properties();
			properties.setProperty(PROPERTY_DIALECT, env.getProperty(PROPERTY_DIALECT));
			properties.setProperty(PROPERTY_SHOW_SQL, env.getProperty(PROPERTY_SHOW_SQL));
			properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
			properties.setProperty("hibernate.show_sql", "true");
			return properties;
		}

		@Bean
		JpaTransactionManager transactionManager() {
			JpaTransactionManager transactionManager = new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
			return transactionManager;
		}

		@Bean
		public DataSource dataSource1() {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName(env.getRequiredProperty("mysql.driverClassName"));
			dataSource.setUrl(env.getRequiredProperty("mysql.url"));
			dataSource.setUsername(env.getRequiredProperty("mysql.username"));
			dataSource.setPassword(env.getRequiredProperty("mysql.password"));
			dataSource.setInitialSize(5);
			dataSource.setMaxTotal(20);
			dataSource.setMaxIdle(5);
			dataSource.setMinIdle(3);
			return dataSource;
		}

		@Bean
		public JdbcTemplate jdbcTemplate() {
			
			return new JdbcTemplate(dataSource1());
		}	
		@Bean
		public ModelMapper modelMapper() {
		    return new ModelMapper();
		}
		
		@Bean
		public BCryptPasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
}
