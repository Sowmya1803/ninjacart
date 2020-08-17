package com.ninjacart.facadelayer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.AddressEntity;
import com.ninjacart.entities.StockEntity;
import com.ninjacart.models.AddressModel;
import com.ninjacart.models.StockModel;
import com.ninjacart.repository.StockRepository;

@Service
public class StockFacade {
	@Autowired
	public StockRepository stockRepository;
	
	public List<StockModel> getallStock() {
		List<StockModel> stockModellist=new ArrayList<StockModel>();
		
		List<StockEntity> stockEntity=stockRepository.findAll();
		for(StockEntity x:stockEntity) {
			StockModel stockModel=new StockModel();
			stockModel.setId(x.getId());
			stockModel.setBatchNo(x.getBatchNo());
			stockModel.setStockOwner(x.getStockOwner());
			AddressModel addressModel=getAddressModel(x.getAddressEntity());
			stockModel.setAddressModel(addressModel);
			stockModellist.add(stockModel);		
		}
		return stockModellist;
	}
	
	public AddressModel getAddressModel(AddressEntity addressEntity) {
		AddressModel addressModel=new AddressModel();
		addressModel.setAddressId(addressEntity.getAddressId());
		addressModel.setFlatNo(addressEntity.getFlatNo());
		addressModel.setStreet(addressEntity.getStreet());
		addressModel.setCity(addressEntity.getCity());
		addressModel.setTown(addressEntity.getTown());
		addressModel.setCountry(addressEntity.getCountry());
		addressModel.setPostalcode(addressEntity.getPostalCode());
		return addressModel;
	}
	
	
	public StockModel getStockById(int id) {
		StockEntity stockEntity=stockRepository.findById(id);
		
		StockModel stockModel=new StockModel();
		stockModel.setId(stockEntity.getId());
		stockModel.setBatchNo(stockEntity.getBatchNo());
		stockModel.setStockOwner(stockEntity.getStockOwner());
		AddressModel addressModel=getaddressModel(stockEntity.getAddressEntity());
		stockModel.setAddressModel(addressModel);
		return stockModel;	
	}
	public AddressModel getaddressModel(AddressEntity addressEntity) {
		AddressModel addressModel=new AddressModel();
		addressModel.setAddressId(addressEntity.getAddressId());
		addressModel.setFlatNo(addressEntity.getFlatNo());
		addressModel.setStreet(addressEntity.getStreet());
		addressModel.setCity(addressEntity.getCity());
		addressModel.setTown(addressEntity.getTown());
		addressModel.setCountry(addressEntity.getCountry());
		addressModel.setPostalcode(addressEntity.getPostalCode());
		return addressModel;
	}
	
	public String saveStock(StockModel model) {
		StockEntity stockEntity=new StockEntity();
		stockEntity.setId(model.getId());
		stockEntity.setBatchNo(model.getBatchNo());
		stockEntity.setStockOwner(model.getStockOwner());
		AddressEntity addressentity=getaddressentity(model.getAddressModel());
		stockEntity.setAddressEntity(addressentity);
	    StockEntity entity=stockRepository.save(stockEntity);
	    if(entity!=null) {
	    	return "success";
	    }else {
	    	return "failed";
	    }
		}
	
	public AddressEntity getaddressentity(AddressModel addressmodel) {
		AddressEntity addressEntity=new AddressEntity();
		addressEntity.setAddressId(addressmodel.getAddressId());
		addressEntity.setFlatNo(addressmodel.getFlatNo());
		addressEntity.setStreet(addressmodel.getStreet());
		addressEntity.setCity(addressmodel.getCity());
		addressEntity.setTown(addressmodel.getTown());
		addressEntity.setCountry(addressmodel.getCountry());
		addressEntity.setPostalCode(addressmodel.getPostalcode());
		return addressEntity;	
	}
	
	public String updateStock(StockModel model) {
		StockEntity entity=stockRepository.findById(model.getId());
		if(entity==null) {
			return "stockrecord not found";
		}
		StockEntity stockEntity=new StockEntity();
		stockEntity.setId(model.getId());
		stockEntity.setBatchNo(model.getBatchNo());
		stockEntity.setStockOwner(model.getStockOwner());
		AddressEntity addressEntity=getAddress(model.getAddressModel());
		stockEntity.setAddressEntity(addressEntity);
		StockEntity stockentity=stockRepository.save(stockEntity);
		if(stockEntity!=null) {
			return "success";
		}else {
			return "failed";
		}
	}
	
	public AddressEntity getAddress(AddressModel model) {
		AddressEntity addressEntity=new AddressEntity();
		addressEntity.setAddressId(model.getAddressId());
		addressEntity.setFlatNo(model.getFlatNo());
		addressEntity.setStreet(model.getStreet());
		addressEntity.setCity(model.getCity());
		addressEntity.setTown(model.getTown());
		addressEntity.setCountry(model.getCountry());
		addressEntity.setPostalCode(model.getPostalcode());
		return addressEntity;
	}
}
