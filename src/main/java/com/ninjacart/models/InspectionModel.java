package com.ninjacart.models;

public class InspectionModel {
	private int inspectId;
	private String inspectionType;
	private String date;
	private int vegId;
	
	public InspectionModel(int inspectId, String inspectionType, String date, int vegId) {
		super();
		this.inspectId = inspectId;
		this.inspectionType = inspectionType;
		this.date = date;
		this.vegId = vegId;
	}
	public int getInspectId() {
		return inspectId;
	}
	public void setInspectId(int inspectId) {
		this.inspectId = inspectId;
	}
	public String getInspectionType() {
		return inspectionType;
	}
	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	@Override
	public String toString() {
		return "InspectionModel [inspectId=" + inspectId + ", inspectionType=" + inspectionType + ", date=" + date
				+ ", vegId=" + vegId + ", getInspectId()=" + getInspectId() + ", getInspectionType()="
				+ getInspectionType() + ", getDate()=" + getDate() + ", getVegId()=" + getVegId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
	
	