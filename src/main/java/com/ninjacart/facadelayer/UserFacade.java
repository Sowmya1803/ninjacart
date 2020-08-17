package com.ninjacart.facadelayer;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.UserEntity;
import com.ninjacart.models.UserModel;
import com.ninjacart.repository.UserRepository;

@Service
public class UserFacade {
	
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepository userRepository;
	@Autowired 
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public String saveUser(UserModel model) {
		UserEntity userEntity=modelMapper.map(model,UserEntity.class);
		UserEntity entity=userRepository.save(userEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}
	
	public  List<UserModel> getAllUserDetails() {
		List<UserModel> userModel=userRepository.getAllUser();
		return userModel;
	}

	
	public UserModel getUserById(int userId) {
		UserModel userModel=userRepository.getByUserId(userId);
		return userModel;
	}
	
	public String updateUser(UserModel model) {
		UserEntity userEntity=modelMapper.map(model,UserEntity.class);
		UserEntity entity=userRepository.save(userEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}

	public String UserDetails(UserModel model) {
//		BCryptPasswordEncoder b=new BCryptPasswordEncoder();
//		 String encodedPassword = b.encode(model.getPassword());
//		 model.setPassword(encodedPassword);
		 UserEntity entity=userRepository.findByUserName(model.getUserName());
		 if(entity.getUserName().equals(model.getUserName())&& bCryptPasswordEncoder.matches(model.getPassword(),entity.getPassword())) {
			return "valid user";
		}else {
			return "invalid user";
		}
	}
}
