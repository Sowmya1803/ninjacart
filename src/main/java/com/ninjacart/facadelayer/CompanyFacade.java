package com.ninjacart.facadelayer;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.AddressEntity;
import com.ninjacart.entities.CompanyEntity;
import com.ninjacart.entities.InspectionEntity;
import com.ninjacart.models.AddressModel;
import com.ninjacart.models.CompanyModel;
import com.ninjacart.repository.CompanyRepository;

@Service
public class CompanyFacade {
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private ModelMapper modelMapper;
	

	public String saveCompany(CompanyModel model) {
		CompanyModel companyModel=model;
	
		CompanyEntity companyEntity=new CompanyEntity();
		companyEntity.setId(companyModel.getId());
		companyEntity.setNumber(companyModel.getNumber());
		companyEntity.setOwnerName(companyModel.getOwnerName());
		companyEntity.setEmail(companyModel.getEmail());
		AddressEntity addressentity=getAddressentity(companyModel.getAddressModel());
		companyEntity.setAddressEntity(addressentity);
		CompanyEntity entity=companyRepository.save(companyEntity);
		if(entity!=null) {
			return "Success";
		}else {
			return "Failed";
		}
	}
		
	public AddressEntity getAddressentity(AddressModel addressModel) {
		
		AddressEntity addressentity=new AddressEntity();
		addressentity.setAddressId(addressModel.getAddressId());
		addressentity.setFlatNo(addressModel.getFlatNo());
		addressentity.setStreet(addressModel.getStreet());
		addressentity.setCity(addressModel.getCity());
		addressentity.setTown(addressModel.getTown());
		addressentity.setCountry(addressModel.getCountry());
		addressentity.setPostalCode(addressModel.getPostalcode());
		System.out.println(addressentity.toString());
		return addressentity;
	}

	public CompanyModel getCompanyById(int id) {
			CompanyEntity companyEntity=companyRepository.findById(id);
			
			CompanyModel companyModel=new CompanyModel();
			companyModel.setId(companyEntity.getId());
			companyModel.setNumber(companyEntity.getNumber());
		    companyModel.setOwnerName(companyEntity.getOwnerName());
		    companyModel.setEmail(companyEntity.getEmail());
			AddressModel addressModel=getAddressModel(companyEntity.getAddressEntity());
		    companyModel.setAddressModel(addressModel);
		    return companyModel;	
		}
	
		public AddressModel getAddressModel(AddressEntity addressentity) {
			AddressModel addressModel=new AddressModel();
			addressModel.setAddressId(addressentity.getAddressId());
			addressModel.setFlatNo(addressentity.getFlatNo());
			addressModel.setStreet(addressentity.getStreet());
			addressModel.setCity(addressentity.getCity());
			addressModel.setTown(addressentity.getTown());
			addressModel.setCountry(addressentity.getCountry());
			addressModel.setPostalcode(addressentity.getPostalCode());
			return addressModel;
			
			
		}
		
		public List<CompanyModel> getCompany() {
			
		   List<CompanyModel> companymodellist=new ArrayList<CompanyModel>();
           List<CompanyEntity> companyentity=companyRepository.findAll();
           for(CompanyEntity x:companyentity) {
        	   CompanyModel companyModel=new CompanyModel();
        		AddressModel addressModel=new AddressModel();
        	   companyModel.setId(x.getId());
        	   companyModel.setNumber(x.getNumber());
        	   companyModel.setOwnerName(x.getOwnerName());
        	   companyModel.setEmail(x.getEmail());
        	   AddressModel addressmodel=getaddressmodel(x.getAddressEntity());
        	   companyModel.setAddressModel(addressmodel);
        	   companymodellist.add(companyModel);
           } 
		   return companymodellist;
		}
      public AddressModel getaddressmodel(AddressEntity addressEntity) {
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
      
      public String updateCompany(CompanyModel model) {
    	  CompanyEntity companyentity=companyRepository.findById(model.getId());
    	  if(companyentity==null) {
    		  return "companyrecord not found";
    	  }
    	  CompanyEntity companyEntity=new CompanyEntity();
    	  companyEntity.setId(model.getId());
    	  companyEntity.setNumber(model.getNumber());
    	  companyEntity.setOwnerName(model.getOwnerName());
    	  companyEntity.setEmail(model.getEmail());	 
    	  AddressEntity addressEntity=getAddressEntity(model.getAddressModel());
    	  companyEntity.setAddressEntity(addressEntity);
    	  CompanyEntity entity=companyRepository.save(companyEntity);  
    	  if(entity!=null) {
    		  return "success";
    	  }else
    		  return "failed";
      }
      
      public AddressEntity getAddressEntity(AddressModel model) {
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