package com.ninjacart.models;

public class UserModel {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String mobileno;
	private String address;
	
	public UserModel(int userId, String userName, String email, String password, String mobileno, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", mobileno=" + mobileno + ", address=" + address + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getMobileno()=" + getMobileno() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
