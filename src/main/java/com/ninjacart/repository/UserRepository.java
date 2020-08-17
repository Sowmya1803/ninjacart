package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninjacart.entities.UserEntity;
import com.ninjacart.models.UserModel;

public interface UserRepository  extends JpaRepository<UserEntity, Long>{
	
	public List<UserEntity> findAll();
	
	public UserEntity findByUserId(int userId);
	
	public UserEntity findByUserName(String userName);

	@Query("select New com.ninjacart.models.UserModel (e.userId,e.userName,e.email,e.password,e.mobileno,e.address) from UserEntity e")
	public List<UserModel> getAllUser();
	
	@Query("select New com.ninjacart.models.UserModel (e.userId,e.userName,e.email,e.password,e.mobileno,e.address) from UserEntity e where e.id=:id")
	public UserModel getByUserId(@Param("id")int userId);

//	@Query("select New com.ninjacart.models.UserModel (e.userId,e.userName,e.email,e.password,e.mobileno,e.address) from UserEntity e where e.userName=:userName")
//	public UserModel getByUserName(@Param("userName")String userName);
//	
//	@Query("select New com.ninjacart.models.UserModel (e.userId,e.userName,e.email,e.password,e.mobileno,e.address) from UserEntity e where e.password=:password")
//	public UserModel getBypassword(@Param("password")String password);
}
