package com.vroozi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vroozi.api.model.CompanyCode;
import com.vroozi.api.repositories.CompanyCodeRepository;

@Controller
@RequestMapping(value="/companyCodes")
public class CompanyCodeController {

	@Autowired
	private CompanyCodeRepository companyCodeRepository;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<CompanyCode> listCompanyCodes(){
		return companyCodeRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value="/unitId/{unitId}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<CompanyCode> getCompanyCodesByUnitId(@PathVariable("unitId") String unitId){
		return companyCodeRepository.findByUnitId(unitId);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public CompanyCode getCompanyCode(@PathVariable("id") String id){
		return companyCodeRepository.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_JSON_VALUE})
	public CompanyCode createCompanyCode(@RequestBody CompanyCode companyCode){
		return companyCodeRepository.save(companyCode);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.PUT, produces={MediaType.APPLICATION_JSON_VALUE})
	public CompanyCode updateCompanyCode(@PathVariable("id") String id, @RequestBody CompanyCode companyCode){
		companyCode.setId(id);
		return companyCodeRepository.save(companyCode);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE})
	public CompanyCode deleteCompanyCode(@PathVariable("id") String id){
		CompanyCode companyCode = companyCodeRepository.findOne(id);
		if(companyCode != null){
			companyCodeRepository.delete(companyCode);
		}
		return companyCodeRepository.save(companyCode);
	}
	
}
