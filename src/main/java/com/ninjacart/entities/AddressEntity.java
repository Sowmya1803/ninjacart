package com.ninjacart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {
	@Id
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="flat_no")
	private String flatNo;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="town")
	private String town;
	
	@Column(name="country")
	private String country;
	
	@Column(name="postal_code")
	private String postalCode;

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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "AddressEntity [addressId=" + addressId + ", flatNo=" + flatNo + ", street=" + street + ", city=" + city
				+ ", town=" + town + ", country=" + country + ", postalCode=" + postalCode + ", getAddressId()="
				+ getAddressId() + ", getFlatNo()=" + getFlatNo() + ", getStreet()=" + getStreet() + ", getCity()="
				+ getCity() + ", getTown()=" + getTown() + ", getCountry()=" + getCountry() + ", getPostalCode()="
				+ getPostalCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
