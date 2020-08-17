package com.ninjacart.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ninjacart.entities.SiteCultivationEntity;
import com.ninjacart.models.SitecultivationModel;

public interface SiteCultivationRepository extends JpaRepository<SiteCultivationEntity, Long> {
	public  List<SiteCultivationEntity> findAll();
	
	public SiteCultivationEntity findById(int id);
	
	@Query("select New com.ninjacart.models.SitecultivationModel(e.id,e.compost,e.compostQuantity,e.vegtableEntity.id) from SiteCultivationEntity e")
	public List<SitecultivationModel> getAllSiteCultivation();
	
	@Query("select New com.ninjacart.models.SitecultivationModel(e.id,e.compost,e.compostQuantity,e.vegtableEntity.id) from SiteCultivationEntity e where e.id=:id")
	public SitecultivationModel getSiteCultivationById(@Param("id")int id);
}
