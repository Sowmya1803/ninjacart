package com.ninjacart.facadelayer;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ninjacart.entities.InspectionEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.models.InspectionModel;
import com.ninjacart.models.VegtableModel;
import com.ninjacart.repository.InspectionRepository;
import com.ninjacart.repository.VegtableRepository;

@Service
public class InspectionFacade {
	
	@Autowired
	private InspectionRepository inspectionRepository;
	
	@Autowired
	private VegtableRepository vegtableRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public String saveInspection(InspectionModel model) {
		InspectionEntity inspectionEntity=modelMapper.map(model,InspectionEntity.class);
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getVegId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		inspectionEntity.setVegtableEntity(vegtableEntity);
		InspectionEntity entity=inspectionRepository.save(inspectionEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
			
		}
	}
	
	public List<InspectionModel> getAllInspection() {
		List<InspectionModel> inspectionModel=inspectionRepository.getAllInspection();
		return inspectionModel;
	}
	
	public InspectionModel getByInspectId(int inspectId) {
		InspectionModel inspectionModel=inspectionRepository.getByInspectId(inspectId);
		return inspectionModel;
	}
	
	public String updateInspection(InspectionModel model) {
		InspectionEntity inspectionEntity=modelMapper.map(model,InspectionEntity.class);
		InspectionEntity entity=inspectionRepository.findByInspectId(model.getInspectId());
		if(entity==null) {
			return "inspectionrecord not found";
		}
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getVegId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		inspectionEntity.setVegtableEntity(vegtableEntity);
		InspectionEntity inspectionentity=inspectionRepository.save(inspectionEntity);
		if(inspectionentity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}
}

