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
@Table(name="site_cultivation")
public class SiteCultivationEntity {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="compost")
	private String compost;
	
	@Column(name="compost_quantity")
	private int compostQuantity;
	

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "veg_id")
	private VegtableEntity vegtableEntity;


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


	public VegtableEntity getVegtableEntity() {
		return vegtableEntity;
	}


	public void setVegtableEntity(VegtableEntity vegtableEntity) {
		this.vegtableEntity = vegtableEntity;
	}

}
