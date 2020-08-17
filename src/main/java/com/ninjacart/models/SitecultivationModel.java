package com.ninjacart.models;

public class SitecultivationModel {
	private int id;
	private String compost;
	private int compostQuantity;
	private int vegId;
	
	public SitecultivationModel(int id, String compost, int compostQuantity, int vegId) {
		super();
		this.id = id;
		this.compost = compost;
		this.compostQuantity = compostQuantity;
		this.vegId = vegId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompost() {
		return compost;
	}
	public void setCompost(String compost) {
		this.compost = compost;
	}
	public int getCompostQuantity() {
		return compostQuantity;
	}
	public void setCompostQuantity(int compostQuantity) {
		this.compostQuantity = compostQuantity;
	}
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	@Override
	public String toString() {
		return "SitecultivationModel [id=" + id + ", compost=" + compost + ", compostQuantity=" + compostQuantity
				+ ", vegId=" + vegId + ", getId()=" + getId() + ", getCompost()=" + getCompost()
				+ ", getCompostQuantity()=" + getCompostQuantity() + ", getVegId()=" + getVegId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
