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

import com.vroozi.api.model.CostCenter;
import com.vroozi.api.repositories.CostCenterRepository;

@Controller
@RequestMapping(value="/costCenters")
public class CostCenterController {

	@Autowired
	private CostCenterRepository costCenterRepository;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<CostCenter> listCostCenters(){
		return costCenterRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value="/unitId/{unitId}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<CostCenter> getCostCentersByUnitId(@PathVariable("unitId") String unitId){
		return costCenterRepository.findByUnitId(unitId);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public CostCenter getCostCenter(@PathVariable("id") String id){
		return costCenterRepository.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_JSON_VALUE})
	public CostCenter createCostCenter(@RequestBody CostCenter costCenter){
		return costCenterRepository.save(costCenter);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.PUT, produces={MediaType.APPLICATION_JSON_VALUE})
	public CostCenter updateCostCenter(@PathVariable("id") String id, @RequestBody CostCenter costCenter){
		costCenter.setId(id);
		return costCenterRepository.save(costCenter);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE})
	public CostCenter deleteCostCenter(@PathVariable("id") String id){
		CostCenter costCenter = costCenterRepository.findOne(id);
		if(costCenter != null){
			costCenterRepository.delete(costCenter);
		}
		return costCenterRepository.save(costCenter);
	}
	
}
