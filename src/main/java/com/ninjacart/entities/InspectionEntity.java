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
@Table(name="inspection")

public class InspectionEntity {
	
	@Id
	@Column(name="inspect_id")
	private int inspectId;
	
	@Column(name="Inspection_type")
	private String inspectionType;
	
	@Column(name="date")
	private String date;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "veg_id")
	private VegtableEntity vegtableEntity;

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

	public VegtableEntity getVegtableEntity() {
		return vegtableEntity;
	}

	public void setVegtableEntity(VegtableEntity vegtableEntity) {
		this.vegtableEntity = vegtableEntity;
	}

}
