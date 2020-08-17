package com.ninjacart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="vegtable")
public class VegtableEntity {
	
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="paddy_started_date")
	private String paddyStartedDate;
	
	@Column(name="vegetable_batch_id")
	private String vegetableBatchId;
	
	@Column(name="stockname")
	private String stockName;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "site_id")
	private SiteEntity siteEntity;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "stock_id")
	private StockEntity stockEntity;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id")
	private CompanyEntity companyEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaddyStartedDate() {
		return paddyStartedDate;
	}

	public void setPaddyStartedDate(String paddyStartedDate) {
		this.paddyStartedDate = paddyStartedDate;
	}

	public String getVegetableBatchId() {
		return vegetableBatchId;
	}

	public void setVegetableBatchId(String vegetableBatchId) {
		this.vegetableBatchId = vegetableBatchId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public SiteEntity getSiteEntity() {
		return siteEntity;
	}

	public void setSiteEntity(SiteEntity siteEntity) {
		this.siteEntity = siteEntity;
	}

	public StockEntity getStockEntity() {
		return stockEntity;
	}

	public void setStockEntity(StockEntity stockEntity) {
		this.stockEntity = stockEntity;
	}

	public CompanyEntity getCompanyEntity() {
		return companyEntity;
	}

	public void setCompanyEntity(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}

}
