package com.ninjacart.facadelayer;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.entities.YieldEntity;
import com.ninjacart.models.YieldModel;
import com.ninjacart.repository.VegtableRepository;
import com.ninjacart.repository.YieldRepository;

@Service
public class YieldFacade {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private VegtableRepository vegtableRepository;
	@Autowired
	private YieldRepository yieldRepository;
	
	public String saveYield(YieldModel model) {
		YieldEntity yieldEntity=modelMapper.map(model,YieldEntity.class);
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getVegId());
		if(vegtableEntity==null) {
			return "vegtableRecord not found";
		}
		yieldEntity.setVegtableEntity(vegtableEntity);
		YieldEntity entity=yieldRepository.save(yieldEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}

	public List<YieldModel> getAllYield() {
		List<YieldModel> yieldModel=yieldRepository.getAllYield();
		return yieldModel;
	}
	
	public YieldModel getYieldById(int yieldId) {
		YieldModel yieldModel=yieldRepository.getByYieldId(yieldId);
		return yieldModel;
	}
	
	public String updateYield(YieldModel model) {
		YieldEntity yieldentity=modelMapper.map(model,YieldEntity.class);
		YieldEntity yieldEntity=yieldRepository.findByYieldId(model.getYieldId());
		if(yieldEntity==null) {
			return "yieldrecord not found";
		}
		VegtableEntity vegtableEntity=vegtableRepository.findById(model.getVegId());
		if(vegtableEntity==null) {
			return "vegtablerecord not found";
		}
		yieldentity.setVegtableEntity(vegtableEntity);
		YieldEntity entity=yieldRepository.save(yieldentity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
		
		
	}
}
