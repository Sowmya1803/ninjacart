package com.ninjacart.facadelayer;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.SiteCultivationEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.models.SitecultivationModel;
import com.ninjacart.repository.SiteCultivationRepository;
import com.ninjacart.repository.VegtableRepository;

@Service
public class SiteCultivationFacade {
	
	@Autowired
	private SiteCultivationRepository siteCultivationRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired  
	private VegtableRepository vegtableRepository;
	
	
	public String saveSiteCultivation(SitecultivationModel model) {
		SiteCultivationEntity siteCultivationEntity=modelMapper.map(model,SiteCultivationEntity.class);
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getVegId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		siteCultivationEntity.setVegtableEntity(vegtableEntity);
		SiteCultivationEntity entity=siteCultivationRepository.save(siteCultivationEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
			}
	
	public List<SitecultivationModel> getAllSiteCultivation() {
		List<SitecultivationModel> siteCultivationModel=siteCultivationRepository.getAllSiteCultivation();
		return siteCultivationModel;
		}
	
	public SitecultivationModel getSiteCultivatioById(int id) {
		SitecultivationModel siteCultivationModel=siteCultivationRepository.getSiteCultivationById(id);
		return siteCultivationModel;
	}

	public String updateSiteCultivation(SitecultivationModel model) {
		SiteCultivationEntity siteCultivationEntity=modelMapper.map(model,SiteCultivationEntity.class);
		SiteCultivationEntity entity=siteCultivationRepository.findById(model.getId());
		if(entity==null) {
			return "sitecultivationrecord not found";
		}
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getVegId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		siteCultivationEntity.setVegtableEntity(vegtableEntity);
		SiteCultivationEntity sitecultivationEntity=siteCultivationRepository.save(siteCultivationEntity);
		if(sitecultivationEntity!=null) {
			return "success";
		}else {
			return "failed";
		}
		}
}
