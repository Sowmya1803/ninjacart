package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninjacart.entities.ScatteringEntity;
import com.ninjacart.models.ScatteringModel;

public interface ScatteringRepository extends JpaRepository<ScatteringEntity, Long> {
	public List<ScatteringEntity> findAll();
	public ScatteringEntity findByScatteringId(int scatteringId);
	
	@Query("select New com.ninjacart.models.ScatteringModel(e.scatteringId,e.scatteringDate,e.setImages,e.vegtableEntity.id) from ScatteringEntity e")
	public List<ScatteringModel> getAllScattering();
	
	@Query("select New com.ninjacart.models.ScatteringModel(e.scatteringId,e.scatteringDate,e.setImages,e.vegtableEntity.id)  from ScatteringEntity e where e.id=:id")
	public ScatteringModel getScatteringById(@Param("id")int scatteringId);
	
}
