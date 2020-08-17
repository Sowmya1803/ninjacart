package com.ninjacart.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="scattering")
public class ScatteringEntity {
	@Id
	@Column(name="scattering_id")
	private int scatteringId;
	
	@Column(name="scattering_date")
	private String scatteringDate;
	
	@Column(name="setimages")
	private String setImages;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "crop_id")
	private VegtableEntity vegtableEntity;

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

	public VegtableEntity getVegtableEntity() {
		return vegtableEntity;
	}

	public void setVegtableEntity(VegtableEntity vegtableEntity) {
		this.vegtableEntity = vegtableEntity;
	}

}
