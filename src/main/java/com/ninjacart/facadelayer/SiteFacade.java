package com.ninjacart.facadelayer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.AddressEntity;
import com.ninjacart.entities.SiteEntity;
import com.ninjacart.models.AddressModel;
import com.ninjacart.models.SiteModel;
import com.ninjacart.repository.SiteRepository;

@Service
public class SiteFacade {
	@Autowired
	private SiteRepository siteRepository;
	
	public List<SiteModel> getSiteDetails() {
		List<SiteModel> siteModellist=new ArrayList<SiteModel>();
		List<SiteEntity> siteEntity=siteRepository.findAll();
		
		for(SiteEntity x:siteEntity) {
			SiteModel siteModel=new SiteModel();
			siteModel.setSiteId(x.getSiteId());
			siteModel.setLocation(x.getLocation());
			siteModel.setDocumentId(x.getDocumentId());
			siteModel.setLatitude(x.getLatitude());
			siteModel.setLongitude(x.getLongitude());
			AddressModel addressModel=getAddressModel(x.getAddressEntity());
			siteModel.setAddressModel(addressModel);
			siteModellist.add(siteModel);
		}
			return siteModellist;	
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
		
	public SiteModel getSiteDetailsBySiteId(int siteId) {
		SiteEntity siteEntity=siteRepository.findBySiteId(siteId);
		System.out.println("getSiteDetailsBySiteId"+siteEntity.toString());
		SiteModel siteModel=new SiteModel();
		siteModel.setSiteId(siteEntity.getSiteId());
		siteModel.setLocation(siteEntity.getLocation());
		siteModel.setDocumentId(siteEntity.getDocumentId());
		siteModel.setLatitude(siteEntity.getLatitude());
		siteModel.setLongitude(siteEntity.getLongitude());
		AddressModel addressmodel=getaddressmodel(siteEntity.getAddressEntity());
		siteModel.setAddressModel(addressmodel);
		return siteModel;
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
	
	public String saveSite(SiteModel model) {
		SiteEntity siteEntity=new SiteEntity();
		siteEntity.setSiteId(model.getSiteId());
		siteEntity.setLocation(model.getLocation());
		siteEntity.setDocumentId(model.getDocumentId());
		siteEntity.setLatitude(model.getLatitude());
		siteEntity.setLongitude(model.getLongitude());
		AddressEntity addressEntity=getaddressentity(model.getAddressModel());
		siteEntity.setAddressEntity(addressEntity);
		SiteEntity entity=siteRepository.save(siteEntity);
		if(entity!=null) {
		  return "success";
		}else {
			return "failed";
		}
	}
		
		public  AddressEntity getaddressentity(AddressModel model) {
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
		
	public String updateSite(SiteModel model) {
		SiteEntity siteEntity=siteRepository.findBySiteId(model.getSiteId());
		if(siteEntity==null) {
			return "siterecord not found";
		}
		SiteEntity siteentity=new SiteEntity();
		siteentity.setSiteId(model.getSiteId());
		siteentity.setLocation(model.getLocation());
		siteentity.setDocumentId(model.getDocumentId());
		siteentity.setLatitude(model.getLatitude());
		siteentity.setLongitude(model.getLongitude());
		AddressEntity addressEntity=getAddress(model.getAddressModel());
		siteentity.setAddressEntity(addressEntity);
		SiteEntity entity=siteRepository.save(siteentity);
		if(entity!=null) {
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
