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

import com.vroozi.api.model.ChartOfAccount;
import com.vroozi.api.repositories.ChartOfAccountRepository;

@Controller
@RequestMapping(value="/chartOfAccounts")
public class ChartOfAccountController {

	@Autowired
	private ChartOfAccountRepository chartOfAccountRepository;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<ChartOfAccount> listChartOfAccounts(){
		return chartOfAccountRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value="/unitId/{unitId}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<ChartOfAccount> getChartOfAccountsByUnitId(@PathVariable("unitId") String unitId){
		return chartOfAccountRepository.findByUnitId(unitId);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public ChartOfAccount getChartOfAccount(@PathVariable("id") String id){
		return chartOfAccountRepository.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_JSON_VALUE})
	public ChartOfAccount createChartOfAccount(@RequestBody ChartOfAccount chartOfAccount){
		return chartOfAccountRepository.save(chartOfAccount);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.PUT, produces={MediaType.APPLICATION_JSON_VALUE})
	public ChartOfAccount updateChartOfAccount(@PathVariable("id") String id, @RequestBody ChartOfAccount chartOfAccount){
		chartOfAccount.setId(id);
		return chartOfAccountRepository.save(chartOfAccount);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE})
	public ChartOfAccount deleteChartOfAccount(@PathVariable("id") String id){
		ChartOfAccount chartOfAccount = chartOfAccountRepository.findOne(id);
		if(chartOfAccount != null){
			chartOfAccountRepository.delete(chartOfAccount);
		}
		return chartOfAccountRepository.save(chartOfAccount);
	}
	
}
