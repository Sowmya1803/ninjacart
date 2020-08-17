package com.ninjacart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="yield")
public class YieldEntity {

	@Id
	@Column(name="yield_id")
	private int yieldId;
	
	@Column(name="yield_quantity")
	private int yieldQuantity;
	
	@Column(name="yield_date")
	private String yieldDate;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "veg_id")
	private VegtableEntity vegtableEntity;

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

	public VegtableEntity getVegtableEntity() {
		return vegtableEntity;
	}

	public void setVegtableEntity(VegtableEntity vegtableEntity) {
		this.vegtableEntity = vegtableEntity;
	}

}
