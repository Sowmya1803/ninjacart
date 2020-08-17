package com.ninjacart.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ninjacart.entities.CompanyEntity;
import com.ninjacart.entities.StockEntity;
import com.ninjacart.entities.VegtableEntity;
import com.ninjacart.entities.YieldEntity;
import com.ninjacart.models.CompanyModel;
import com.ninjacart.models.InspectionModel;
import com.ninjacart.models.ScatteringModel;
import com.ninjacart.models.SiteModel;
import com.ninjacart.models.SitecultivationModel;
import com.ninjacart.models.StockModel;
import com.ninjacart.models.UserModel;
import com.ninjacart.models.VegtableModel;
import com.ninjacart.models.YieldModel;
import com.ninjacart.service.WebService;

@RestController
public class CompanyController {
	
	@Autowired
	private WebService webService;
	
	@Autowired 
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//index mapping
	@GetMapping("/hello")
	public String HelloMethod() {
		return "Hello";
	}
	
	@PostMapping("/saveCompany")
	public String saveCompany(@RequestBody CompanyModel model) {
		//WebService w=new WebService();
		String companyentity=webService.saveCompany(model);
	    return companyentity;
	}
	
	@GetMapping("/Company")
   	public List<CompanyModel> getCompany() {
	   List<CompanyModel> companymodellist=webService.getCompany();
   	   return companymodellist;
	}
	
	@GetMapping("/CompanyById/{id}")
	   public CompanyModel getCompanyById(@PathVariable(value="id")int id) {
		   CompanyModel companyModel=webService.getCompanyById(id);
		   return companyModel;
	}
	
	@PutMapping("/updateCompany")
	public String updateCompany(@RequestBody CompanyModel model) {
		String companyEntity=webService.updateCompany(model);
		return companyEntity;
	}

	@PostMapping("/saveInspection")
	   public String saveInspection(@RequestBody InspectionModel model) {
		   String inspectionEntity=webService.saveInspection(model);
	       return inspectionEntity;
   }

   @GetMapping("/Inspection")
		public List<InspectionModel> getAllInspection() {
		   List<InspectionModel> inspectionModel=webService.getAllInspection();
		   return inspectionModel;
		   }
	   
   @GetMapping("/InspectionById/{inspectId}")
	   public InspectionModel getByInspectId(@PathVariable(value="inspectId")int inspectId) {
		   InspectionModel inspectionModel=webService.getByInspectId(inspectId);
		   return inspectionModel;
	   }
   
   @PutMapping("/updateInspection")
   public String updateInspection(@RequestBody InspectionModel model) {
	   String inspectionEntity=webService.updateInspection(model);
	   System.out.println(model.toString());
	   return inspectionEntity;
   }


    @PostMapping("/saveScattering")
    public String saveScattering(@RequestBody ScatteringModel model) {
    	String scatteringEntity=webService.saveScattering(model);
    	return scatteringEntity;
    }
    
    @GetMapping("/Scattering")
    public List<ScatteringModel> getAllScattering() {
 	   List<ScatteringModel> scatteringModel=webService.getAllScattering();
 	   return scatteringModel;
    }
    
    @GetMapping("/ScatteringByScatteringId/{scatteringId}")
    public ScatteringModel getScatteringById(@PathVariable(value="scatteringId")int scatteringId) {
 	   ScatteringModel scatteringModel=webService.getScatteringById(scatteringId);
 	   return scatteringModel;
    }
    
    @PutMapping("/updateScattering")
    public String updateScattering(@RequestBody ScatteringModel model) {
    	String scatteringEntity=webService.updateScattering(model);
    	return scatteringEntity;
    }
    
    @PostMapping("/saveVegtable")
    public String saveVegable(@RequestBody VegtableModel model) {
    	String vegtableEntity=webService.saveVegtable(model);
    	return vegtableEntity;
    }
    
    @GetMapping("/Vegtable")
    public List<VegtableModel> getAllVegtable(VegtableEntity entity) {
 	   List<VegtableModel> vegtableModel=webService.getAllVegetables();
 	   return vegtableModel;
    }
    
    @GetMapping("/VegtableById/{id}")
    public VegtableModel getVegtableById(@PathVariable(value="id")int id) {
 	   VegtableModel vegtableModel=webService.getVegtableById(id);
 	   return vegtableModel;
    }
    
    @PutMapping("/updateVegtable")
    public String updateVegtable(@RequestBody VegtableModel model) {
    	String vegtableEntity=webService.updateVegtable(model);
    	return vegtableEntity;
    }
    
    
   @PostMapping("/saveSiteCultivation")
   public String saveSiteCultivation(@RequestBody SitecultivationModel model) {
	  String siteCultivationEntity= webService.saveSiteCultivation(model);
	  return siteCultivationEntity;
	 }
   
   @GetMapping("/SiteCultivation")
   public List<SitecultivationModel> getAllSiteCultivation() {
	   List<SitecultivationModel> siteCultivationModel=webService.getAllSiteCultivation();
	   return siteCultivationModel;
   }
   
   @GetMapping("/SiteCultivationById/{id}")
   public SitecultivationModel getSiteCultivationById(@PathVariable(value="id")int id) {
	   SitecultivationModel siteCultivationModel=webService.getSiteCultivationById(id);
	   return siteCultivationModel;
   }
   
   @PutMapping("/updateSiteCultivation")
   public String updateSiteCultivation(@RequestBody SitecultivationModel model) {
	   String siteCultivationEntity=webService.updateSiteCultivation(model);
	   return siteCultivationEntity;
   }
   
   @PostMapping("/saveSite")
   public String saveSite(@RequestBody SiteModel model) {
	   String siteEntity=webService.saveSite(model);
	   return siteEntity; 
   }
   
   @GetMapping("/Site")
   public List<SiteModel> getSiteDetails() {
	   List<SiteModel> siteModellist=webService.getSiteDetails();
	   return siteModellist;
   }
   
   @GetMapping("/SiteDetailsBySiteId/{siteId}")
   public SiteModel getSiteDetailsBySiteId(@PathVariable(value="siteId")int siteId) {
	   SiteModel siteModel=webService.getSiteDetailsBySiteId(siteId);
	   return siteModel;
   }
   
   @PutMapping("/updateSite")
   public String updateSite(@RequestBody SiteModel model) {
	   String siteEntity=webService.updateSite(model);
	   return siteEntity;
   }
   
   @PostMapping("/saveStock")
   public String saveStock(@RequestBody StockModel model) {
	   String stockentity=webService.SaveStock(model);
       return stockentity;
   }

   @GetMapping("/Stock")
   public List<StockModel> getallStock() {
	   List<StockModel> stockModellist=webService.getallStock();
	   return stockModellist;
   }
   
   @GetMapping("/StockById/{id}")
   public StockModel getStockById(@PathVariable(value="id")int id) {
	   StockModel stockModel=webService.getStockById(id);
	   return stockModel;
   }
   
   @PutMapping("/updateStock")
   public String updateStock(@RequestBody StockModel model) {
	   String stockEntity=webService.updateStock(model);
	   return stockEntity;
   }
   
   @PostMapping("/saveYield")
   public String saveYield(@RequestBody YieldModel model) {
	   String yieldEntity=webService.saveYield(model);
	   return yieldEntity;
   }
  
   @GetMapping("/Yield")
   public List<YieldModel> getAllYield() {
	   List<YieldModel> yieldModel=webService.getAllYield();
	   return yieldModel;
   }
   
   @GetMapping("/YieldById/{yieldId}")
   public YieldModel getYieldById(@PathVariable(value="yieldId")int yieldId) {
	   YieldModel yieldModel=webService.getYieldById(yieldId);
	   return yieldModel;
   }
   
   @PutMapping("/updateYield")
   public String updateYield(@RequestBody YieldModel model) {
	   String yieldEntity=webService.updateyield(model);
	   return yieldEntity;
   }
   
   @PostMapping("/saveUser")
   public String saveUser(@RequestBody UserModel model) {
	   String encodedPassword = bCryptPasswordEncoder.encode(model.getPassword());
	   model.setPassword(encodedPassword);
	   String userEntity=webService.saveUser(model);
	   return userEntity;
   }
   
   @GetMapping("/User")
   public List<UserModel> getAllUserDetails() {
	   List<UserModel> userModel=webService.getAllUser();
	   return userModel;
   }
   
   @GetMapping("/UserByUserId/{userId}")
   public UserModel getUserById(@PathVariable(value="userId") int userId) {
	   UserModel userModel=webService.getUserById(userId);
	   return userModel;
   }
   
   @PutMapping("/updateUser")
   public String updateUser(@RequestBody UserModel model) {
	   String userEntity=webService.updateUser(model);
	   return userEntity;
   }

   @PostMapping("/login")
   public String UserDetails(@RequestBody UserModel model) {
	   String userModel=webService.UserDetails(model);
	   System.out.println(model.toString());
	   return userModel;
	   }
	   
	   
}

