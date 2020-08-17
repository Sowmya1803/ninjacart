package com.ninjacart.models;

public class SiteModel {
	private int siteId;
	private String location;
	private String documentId;
	private String latitude;
	private String longitude;
	private AddressModel addressModel;
	
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public AddressModel getAddressModel() {
		return addressModel;
	}
	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}
	@Override
	public String toString() {
		return "SiteModel [siteId=" + siteId + ", location=" + location + ", documentId=" + documentId + ", latitude="
				+ latitude + ", longitude=" + longitude + ", addressModel=" + addressModel + ", getSiteId()="
				+ getSiteId() + ", getLocation()=" + getLocation() + ", getDocumentId()=" + getDocumentId()
				+ ", getLatitude()=" + getLatitude() + ", getLongitude()=" + getLongitude() + ", getAddressModel()="
				+ getAddressModel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
