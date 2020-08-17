package com.ninjacart.facadelayer;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ninjacart.entities.AddressEntity;
import com.ninjacart.entities.CompanyEntity;
import com.ninjacart.entities.SiteEntity;
import com.ninjacart.entities.StockEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.models.AddressModel;
import com.ninjacart.models.CompanyModel;
import com.ninjacart.models.SiteModel;
import com.ninjacart.models.StockModel;
import com.ninjacart.models.VegtableModel;
import com.ninjacart.repository.CompanyRepository;
import com.ninjacart.repository.SiteRepository;
import com.ninjacart.repository.StockRepository;
import com.ninjacart.repository.VegtableRepository;

@Service
public class VegtableFacade {
	@Autowired 
	private VegtableRepository vegtableRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private SiteRepository siteRepository;
	
	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public String saveVegtable(VegtableModel model) {
		SiteEntity siteEntity=siteRepository.findBySiteId(model.getSiteId());
		if(siteEntity==null) {
			return "siterecord not found";
		}
		StockEntity stockEntity=stockRepository.findById(model.getStockId());
		if(stockEntity==null) {
			return "stockrecord not found";
		}
		CompanyEntity companyEntity=companyRepository.findById(model.getCompanyId());
		if(companyEntity==null) {
			return "companyrecord not found";
		}
		VegtableEntity vegtableEntity=modelMapper.map(model,VegtableEntity.class);
		vegtableEntity.setSiteEntity(siteEntity);
		vegtableEntity.setStockEntity(stockEntity);
		vegtableEntity.setCompanyEntity(companyEntity);
		VegtableEntity entity=vegtableRepository.save(vegtableEntity);
		if(entity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}
	
	public List<VegtableModel> getAllVegtable(){	
		List<VegtableModel> vegtableModel=vegtableRepository.getAllVegtables();
		return vegtableModel;
	}

		
	public VegtableModel getVegtableById(int id) {
		VegtableModel vegtableModel=vegtableRepository.getVegtableById(id);
		return vegtableModel;
		
	}
	
	public String updateVegtable(VegtableModel model) {
		VegtableEntity vegtableEntity=modelMapper.map(model,VegtableEntity.class);
		VegtableEntity entity=vegtableRepository.findById(model.getId());
		if(entity==null) {
			return "vegtableRecord not found";
		}
		SiteEntity siteEntity=siteRepository.findBySiteId(model.getSiteId());
		if(siteEntity==null) {
			return "siterecord not found";
		}
		StockEntity stockEntity=stockRepository.findById(model.getStockId());
		if(stockEntity==null) {
			return "stockrecord not found";
		}
		CompanyEntity companyEntity=companyRepository.findById(model.getCompanyId());
		if(companyEntity==null) {
			return "companyrecord not found";
		}
		vegtableEntity.setSiteEntity(siteEntity);
		vegtableEntity.setStockEntity(stockEntity);
		vegtableEntity.setCompanyEntity(companyEntity);
		VegtableEntity vegtableentity=vegtableRepository.save(vegtableEntity);
		if(vegtableentity!=null) {
			return "success";
		}else {
			return "failed";
		}
		
		
	}
		
}


