package com.vroozi.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vroozi.api.model.ChartOfAccount;
import com.vroozi.api.services.ChartOfAccountService;

@Controller
@RequestMapping(value = "/chartOfAccounts")
public class ChartOfAccountController {

  private static final Logger LOG = LoggerFactory.getLogger(ChartOfAccountController.class);

  @Autowired
  private ChartOfAccountService chartOfAccountService;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<ChartOfAccount> listChartOfAccounts() {
    LOG.info("Inside list of charts of accounts");
    return chartOfAccountService.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<ChartOfAccount> getChartOfAccountsByUnitId(@PathVariable("unitId") String unitId) {
    return chartOfAccountService.findAllByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ChartOfAccount getChartOfAccount(@PathVariable("id") String id) {
    return chartOfAccountService.find(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ChartOfAccount createChartOfAccount(@RequestBody ChartOfAccount chartOfAccount) {
    return chartOfAccountService.addNew(chartOfAccount);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ChartOfAccount updateChartOfAccount(@PathVariable("id") String id, @RequestBody ChartOfAccount chartOfAccount) {
    chartOfAccount.setId(id);
    return chartOfAccountService.update(chartOfAccount);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ChartOfAccount deleteChartOfAccount(@PathVariable("id") String id) {
    ChartOfAccount chartOfAccount = chartOfAccountService.find(id);
    if (chartOfAccount != null) {
      chartOfAccountService.remove(chartOfAccount);
    }
    return chartOfAccountService.update(chartOfAccount);
  }

}
