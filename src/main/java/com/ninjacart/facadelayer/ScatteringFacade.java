package com.ninjacart.facadelayer;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.ScatteringEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.models.ScatteringModel;
import com.ninjacart.repository.ScatteringRepository;
import com.ninjacart.repository.VegtableRepository;

@Service
public class ScatteringFacade {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private VegtableRepository vegtableRepository;
	@Autowired
	private ScatteringRepository scatteringRepository;
	
	public String saveScattering(ScatteringModel model) {
		ScatteringEntity scatteringEntity=modelMapper.map(model,ScatteringEntity.class);
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getCropId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		scatteringEntity.setVegtableEntity(vegtableEntity);
		ScatteringEntity entity=scatteringRepository.save(scatteringEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}
	
	public List<ScatteringModel> getAllScattering() {
		List<ScatteringModel> scatteringModel=scatteringRepository.getAllScattering();
		return scatteringModel;
	}

	public ScatteringModel getScatteringById(int scatteringId) {
		ScatteringModel scatteringModel=scatteringRepository.getScatteringById(scatteringId);
		return scatteringModel;
	}
	
	public String updateScattering(ScatteringModel model) {
		ScatteringEntity scatteringEntity=modelMapper.map(model,ScatteringEntity.class);
		ScatteringEntity entity=scatteringRepository.findByScatteringId(model.getScatteringId());
		if(entity==null) {
			return "scatteringrecord not found";
		}
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getCropId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		scatteringEntity.setVegtableEntity(vegtableEntity);
		ScatteringEntity scatteringentity=scatteringRepository.save(scatteringEntity);
		if(scatteringentity!=null) {
			return "success";
		}else {
			return "failed";
		}
		
	}
}
