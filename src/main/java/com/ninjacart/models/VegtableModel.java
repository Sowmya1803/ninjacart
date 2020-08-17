package com.ninjacart.models;

public class VegtableModel {
	private int id;
	private String name;
	private String paddyStartedDate;
	private String vegetableBatchId;
	private String stockName;
	private int siteId;
	private int stockId;
	private int companyId;
	
	
	
	public VegtableModel(int id, String name, String paddyStartedDate, String vegetableBatchId, String stockName,
			int siteId, int stockId, int companyId) {
		super();
		this.id = id;
		this.name = name;
		this.paddyStartedDate = paddyStartedDate;
		this.vegetableBatchId = vegetableBatchId;
		this.stockName = stockName;
		this.siteId = siteId;
		this.stockId = stockId;
		this.companyId = companyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPaddyStartedDate() {
		return paddyStartedDate;
	}
	public void setPaddyStartedDate(String paddyStartedDate) {
		this.paddyStartedDate = paddyStartedDate;
	}
	public String getVegetableBatchId() {
		return vegetableBatchId;
	}
	public void setVegetableBatchId(String vegetableBatchId) {
		this.vegetableBatchId = vegetableBatchId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "VegtableModel [id=" + id + ", name=" + name + ", paddyStartedDate=" + paddyStartedDate
				+ ", vegetableBatchId=" + vegetableBatchId + ", stockName=" + stockName + ", siteId=" + siteId
				+ ", stockId=" + stockId + ", companyId=" + companyId + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPaddyStartedDate()=" + getPaddyStartedDate() + ", getVegetableBatchId()="
				+ getVegetableBatchId() + ", getStockName()=" + getStockName() + ", getSiteId()=" + getSiteId()
				+ ", getStockId()=" + getStockId() + ", getCompanyId()=" + getCompanyId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}