package com.ninjacart.models;

public class ScatteringModel {
	private int scatteringId;
	private String scatteringDate;
	private String setImages;
	private int cropId;
	
	
	public ScatteringModel(int scatteringId, String scatteringDate, String setImages, int cropId) {
		super();
		this.scatteringId = scatteringId;
		this.scatteringDate = scatteringDate;
		this.setImages = setImages;
		this.cropId = cropId;
	}
	public int getScatteringId() {
		return scatteringId;
	}
	public void setScatteringId(int scatteringId) {
		this.scatteringId = scatteringId;
	}
	public String getScatteringDate() {
		return scatteringDate;
	}
	public void setScatteringDate(String scatteringDate) {
		this.scatteringDate = scatteringDate;
	}
	public String getSetImages() {
		return setImages;
	}
	public void setSetImages(String setImages) {
		this.setImages = setImages;
	}
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	@Override
	public String toString() {
		return "ScatteringModel [scatteringId=" + scatteringId + ", scatteringDate=" + scatteringDate + ", setImages="
				+ setImages + ", cropId=" + cropId + ", getScatteringId()=" + getScatteringId()
				+ ", getScatteringDate()=" + getScatteringDate() + ", getSetImages()=" + getSetImages()
				+ ", getCropId()=" + getCropId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}