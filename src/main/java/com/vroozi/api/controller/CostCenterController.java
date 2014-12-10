package com.vroozi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mangofactory.swagger.annotations.ApiIgnore;
import com.vroozi.api.model.ChartOfAccount;
import com.vroozi.api.model.CostCenter;
import com.vroozi.api.repositories.ChartOfAccountRepository;
import com.vroozi.api.repositories.CostCenterRepository;

@ApiIgnore
@Controller
public class CostCenterController {

	@Autowired
	private CostCenterRepository costCenterRepository;
	
	@Autowired
	private ChartOfAccountRepository chartOfAccountRepository;
	
	@RequestMapping(value="/test", produces="application/json")
	@ResponseBody
	public CostCenter getTest(){
		ChartOfAccount chartOfAccount = new ChartOfAccount();
		chartOfAccount.setName("tst");
		chartOfAccount.setUnitId("11111");
		chartOfAccountRepository.save(chartOfAccount);
		
		CostCenter costCenter = new CostCenter();
		costCenter.setName("Sambhu Cost Center");
		costCenter.setDescription("Sambhu Cost Center Description");
		costCenter.setChartOfAccount(chartOfAccount);
		
		costCenterRepository.save(costCenter);
		return costCenter;
	}
}
