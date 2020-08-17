package com.ninjacart.models;

public class YieldModel {
	private int yieldId;
	private int yieldQuantity;
	private String yieldDate;
	private int vegId;
	public YieldModel(int yieldId, int yieldQuantity, String yieldDate, int vegId) {
		super();
		this.yieldId = yieldId;
		this.yieldQuantity = yieldQuantity;
		this.yieldDate = yieldDate;
		this.vegId = vegId;
	}
	public int getYieldId() {
		return yieldId;
	}
	public void setYieldId(int yieldId) {
		this.yieldId = yieldId;
	}
	public int getYieldQuantity() {
		return yieldQuantity;
	}
	public void setYieldQuantity(int yieldQuantity) {
		this.yieldQuantity = yieldQuantity;
	}
	public String getYieldDate() {
		return yieldDate;
	}
	public void setYieldDate(String yieldDate) {
		this.yieldDate = yieldDate;
	}
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	@Override
	public String toString() {
		return "YieldModel [yieldId=" + yieldId + ", yieldQuantity=" + yieldQuantity + ", yieldDate=" + yieldDate
				+ ", vegId=" + vegId + ", getYieldId()=" + getYieldId() + ", getYieldQuantity()=" + getYieldQuantity()
				+ ", getYieldDate()=" + getYieldDate() + ", getVegId()=" + getVegId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}