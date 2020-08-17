package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninjacart.entities.InspectionEntity;
import com.ninjacart.models.InspectionModel;

public interface InspectionRepository extends JpaRepository<InspectionEntity, Long>{
	
	public List<InspectionEntity> findAll();
	
	public InspectionEntity findByInspectId(int inspectId);

	@Query(value="select New com.ninjacart.models.InspectionModel(e.inspectId,e.inspectionType,e.date,e.vegtableEntity.id) from InspectionEntity e")
	public List<InspectionModel> getAllInspection();
	
	@Query(value="select New com.ninjacart.models.InspectionModel(e.inspectId,e.inspectionType,e.date,e.vegtableEntity.id) from InspectionEntity e where e.id=:id")
	public InspectionModel getByInspectId(@Param("id")int id);
}
