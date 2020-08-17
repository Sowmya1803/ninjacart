package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninjacart.entities.YieldEntity;
import com.ninjacart.models.YieldModel;

public interface YieldRepository extends JpaRepository<YieldEntity, Long>{
	public List<YieldEntity> findAll();
	
	public YieldEntity findByYieldId(int yieldId);
	
	@Query("select New com.ninjacart.models.YieldModel (e.yieldId,e.yieldQuantity,e.yieldDate,e.vegtableEntity.id)from YieldEntity e")
	public List<YieldModel> getAllYield();
	
	@Query("select New com.ninjacart.models.YieldModel (e.yieldId,e.yieldQuantity,e.yieldDate,e.vegtableEntity.id) from YieldEntity e where e.id=:id")
	public YieldModel getByYieldId(@Param("id")int yieldId);

}
