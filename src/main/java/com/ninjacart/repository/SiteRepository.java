package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninjacart.entities.SiteEntity;

public interface SiteRepository extends JpaRepository<SiteEntity, Long>{
	public List<SiteEntity> findAll();
	
	public SiteEntity findBySiteId(int siteId);

}
