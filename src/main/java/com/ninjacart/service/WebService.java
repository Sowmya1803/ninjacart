package com.ninjacart.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.entities.CompanyEntity;
import com.ninjacart.entities.InspectionEntity;
import com.ninjacart.entities.SiteCultivationEntity;
import com.ninjacart.entities.SiteEntity;
import com.ninjacart.entities.StockEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.facadelayer.CompanyFacade;
import com.ninjacart.facadelayer.InspectionFacade;
import com.ninjacart.facadelayer.MainFacade;
import com.ninjacart.facadelayer.ScatteringFacade;
import com.ninjacart.facadelayer.SiteCultivationFacade;
import com.ninjacart.facadelayer.SiteFacade;
import com.ninjacart.facadelayer.StockFacade;
import com.ninjacart.facadelayer.UserFacade;
import com.ninjacart.facadelayer.VegtableFacade;
import com.ninjacart.facadelayer.YieldFacade;
import com.ninjacart.models.CompanyModel;
import com.ninjacart.models.InspectionModel;
import com.ninjacart.models.ScatteringModel;
import com.ninjacart.models.SiteModel;
import com.ninjacart.models.SitecultivationModel;
import com.ninjacart.models.StockModel;
import com.ninjacart.models.UserModel;
import com.ninjacart.models.VegtableModel;
import com.ninjacart.models.YieldModel;

@Service
public class WebService {
	@Autowired
	private ScatteringFacade scatteringFacade;
	
	@Autowired
	private YieldFacade yieldFacade;
	
	@Autowired
	private MainFacade mainFacade;
	
    @Autowired
    private CompanyFacade companyFacade;
    
    @Autowired
    private StockFacade stockFacade;
   
    @Autowired
    private SiteFacade siteFacade;
    
    @Autowired
    private VegtableFacade vegtableFacade;
    
    @Autowired
    private InspectionFacade inspectionFacade;
    
    @Autowired 
    private SiteCultivationFacade siteCultivationFacade;
    
    @Autowired
    private UserFacade userFacade;
    
    public String saveCompany(CompanyModel model) {
    String companyentity=companyFacade.saveCompany(model);
    	return companyentity;
    }
    
	public List<CompanyModel> getCompany() {
	List<CompanyModel> companymodellist=companyFacade.getCompany();
	return companymodellist;
    }
  
    public CompanyModel getCompanyById(int id) {
    	CompanyModel companyModel=companyFacade.getCompanyById(id);
		return companyModel;	
    }
    
    public String updateCompany(CompanyModel model) {
    	String companyEntity=companyFacade.updateCompany(model);
    	return companyEntity;
    }
  
    
    public String SaveStock(StockModel model) {
    	String companyentity=stockFacade.saveStock(model);
    	return companyentity;
    }
    
    public List<StockModel> getallStock() {
    	List<StockModel> stockModellist=stockFacade.getallStock();
    	return stockModellist;
    	
    }
    
    public StockModel getStockById(int id) {
    	StockModel stockModel=stockFacade.getStockById(id);
    	return stockModel;
    }
    
    public String updateStock(StockModel model) {
    	String stockEntity=stockFacade.updateStock(model);
    	return stockEntity;
    }
  
    
   public String saveSite(SiteModel model) {
	    String siteEntity=siteFacade.saveSite(model);
		return siteEntity;
   }
   
   public List<SiteModel> getSiteDetails(){
   List<SiteModel> siteModellist=siteFacade.getSiteDetails();
   return siteModellist;
   }
   
   public SiteModel getSiteDetailsBySiteId(int siteId) {
	 SiteModel siteModel=siteFacade.getSiteDetailsBySiteId(siteId);
	 return siteModel;
   }
   
   public String updateSite(SiteModel model) {
	   String siteEntity=siteFacade.updateSite(model);
	   return siteEntity;
   }
  
   public String saveVegtable(VegtableModel model) {
	   String vegtableEntity=vegtableFacade.saveVegtable(model);
	   return vegtableEntity;
	  }
   public List<VegtableModel> getAllVegetables() {
		  List<VegtableModel> vegtableModel=vegtableFacade.getAllVegtable();
		  return vegtableModel;
		  
	  }
	  public VegtableModel getVegtableById(int id) {
		  VegtableModel vegtableModel=vegtableFacade.getVegtableById(id);
		  return vegtableModel;
	  }
	  
	  public String updateVegtable(VegtableModel model) {
		  String vegtableEntity=vegtableFacade.updateVegtable(model);
		  return vegtableEntity;
	  }
	  
   public String saveInspection(InspectionModel model) {
	    String inspectionEntity=inspectionFacade.saveInspection(model);
	    	return inspectionEntity;
   }
   
   public List<InspectionModel> getAllInspection() {
		  List<InspectionModel> inspectionModel=inspectionFacade.getAllInspection();
		  return inspectionModel;
   }
	  
	public InspectionModel getByInspectId(int inspectId) {
		  InspectionModel inspectionModel=inspectionFacade.getByInspectId(inspectId);
		  return inspectionModel;
	 }
	
	public String updateInspection(InspectionModel model) {
		String inspectionEntity=inspectionFacade.updateInspection(model);
		return inspectionEntity;
	}
	  
   public String saveSiteCultivation(SitecultivationModel model) {
	   String siteCultivationEntity=siteCultivationFacade.saveSiteCultivation(model);
	   return siteCultivationEntity;
   }
   public List<SitecultivationModel> getAllSiteCultivation() {
		  List<SitecultivationModel> siteCultivationModel=siteCultivationFacade.getAllSiteCultivation();
		  return  siteCultivationModel;
		  }
	  
	  public SitecultivationModel getSiteCultivationById(int id) {
		  SitecultivationModel siteCultivationModel=siteCultivationFacade.getSiteCultivatioById(id);
		  return siteCultivationModel;
	  }
	  
	  public String updateSiteCultivation(SitecultivationModel model) {
		String  siteCultivationEntity=siteCultivationFacade.updateSiteCultivation(model);
		  return siteCultivationEntity;
	  }
	
   public String saveScattering(ScatteringModel model) {
	   String scatteringEntity=scatteringFacade.saveScattering(model);
	   return scatteringEntity;
   }
   public List<ScatteringModel> getAllScattering() {
		  List<ScatteringModel> scatteringModel=scatteringFacade.getAllScattering();
		  return scatteringModel;
	  }
	  
	  public ScatteringModel getScatteringById(int scatteringId) {
		  ScatteringModel scatteringModel=scatteringFacade.getScatteringById(scatteringId);
		  return scatteringModel; 
	  }
	  
	  public String updateScattering(ScatteringModel model) {
		  String scatteringEntity=scatteringFacade.updateScattering(model);
		  return scatteringEntity;
	  }
	  
	  public String saveYield(YieldModel model) {
		   String yieldEntity=yieldFacade.saveYield(model);
		   return yieldEntity;
	  }
   public List<YieldModel> getAllYield() {
	  List<YieldModel> yieldModel=yieldFacade.getAllYield();
	  return yieldModel;
  }
  
   public YieldModel getYieldById(int yieldId) {
	  YieldModel yieldModel=yieldFacade.getYieldById(yieldId);
	  return yieldModel;
  }
   
   public String updateyield(YieldModel model) {
	   String yieldEntity=yieldFacade.updateYield(model);
	   return yieldEntity;
   }
   
   public String saveUser(UserModel model) {
	   String userEntity=userFacade.saveUser(model);
	   return userEntity;
   }
   
   public List<UserModel> getAllUser() {
	   List<UserModel> userModel=userFacade.getAllUserDetails();
	   return userModel;
   }
   
   public UserModel getUserById(int userId) {
	   UserModel userModel=userFacade.getUserById(userId);
	   return userModel;
   }
   
   public String updateUser(UserModel model) {
	   String userEntity=userFacade.updateUser(model);
	   return userEntity;
   }
   
//   public String getUserName(String userName) {
//	   String userModel=userFacade.getByUserName(userName);
//	   return userModel;
//   }

public String UserDetails(UserModel model) {
	String userModel=userFacade.UserDetails(model);
	return userModel;
}
  }
