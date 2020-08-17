package com.ninjacart.models;

public class CompanyModel {
	private int id;
	private int number;
	private String ownerName;
	private String password;
	private String email;
	private AddressModel addressModel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressModel getAddressModel() {
		return addressModel;
	}
	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}
	@Override
	public String toString() {
		return "CompanyModel [id=" + id + ", number=" + number + ", ownerName=" + ownerName + ", password=" + password
				+ ", email=" + email + ", addressModel=" + addressModel + ", getId()=" + getId() + ", getNumber()="
				+ getNumber() + ", getOwnerName()=" + getOwnerName() + ", getPassword()=" + getPassword()
				+ ", getEmail()=" + getEmail() + ", getAddressModel()=" + getAddressModel() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	}
