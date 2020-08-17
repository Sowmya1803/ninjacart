package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninjacart.entities.SiteEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.models.VegtableModel;

public interface VegtableRepository extends JpaRepository<VegtableEntity, Long> {
	public List<VegtableEntity> findAll();
	public VegtableEntity findById(int id);
	
	
	@Query(value="select New com.ninjacart.models.VegtableModel (e.id,e.name,e.paddyStartedDate,e.vegetableBatchId,e.stockName,e.siteEntity.siteId,e.stockEntity.id,e.companyEntity.id) from VegtableEntity e")
	public List<VegtableModel> getAllVegtables();
	
	@Query(value="select New com.ninjacart.models.VegtableModel(e.id,e.name,e.paddyStartedDate,e.vegetableBatchId,e.stockName,e.siteEntity.siteId,e.stockEntity.id,e.companyEntity.id)from VegtableEntity e where e.id=:id")
	public VegtableModel getVegtableById(@Param("id")int id);
}
