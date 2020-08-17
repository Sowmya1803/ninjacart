package com.ninjacart.models;

public class StockModel {
	private int id;
	private String batchNo;
	private String stockOwner;
	private AddressModel addressModel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getStockOwner() {
		return stockOwner;
	}
	public void setStockOwner(String stockOwner) {
		this.stockOwner = stockOwner;
	}
	public AddressModel getAddressModel() {
		return addressModel;
	}
	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}
	@Override
	public String toString() {
		return "StockModel [id=" + id + ", batchNo=" + batchNo + ", stockOwner=" + stockOwner+ ", addressModel="
				+ addressModel + ", getId()=" + getId() + ", getBatchNo()=" + getBatchNo() + ", getStockOwner()="
				+ getStockOwner() + ", getAddressModel()=" + getAddressModel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}