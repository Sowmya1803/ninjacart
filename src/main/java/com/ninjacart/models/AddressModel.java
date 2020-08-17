package com.ninjacart.models;

public class AddressModel {
	private int addressId;
	private String flatNo;
	private String street;
	private String city;
	private String town;
	private String country;
	private String postalcode;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	@Override
	public String toString() {
		return "AddressModel [addressId=" + addressId + ", flatNo=" + flatNo + ", street=" + street + ", city=" + city
				+ ", town=" + town + ", country=" + country + ", postalcode=" + postalcode + ", getAddressId()="
				+ getAddressId() + ", getFlatNo()=" + getFlatNo() + ", getStreet()=" + getStreet() + ", getCity()="
				+ getCity() + ", getTown()=" + getTown() + ", getCountry()=" + getCountry() + ", getPostalcode()="
				+ getPostalcode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
