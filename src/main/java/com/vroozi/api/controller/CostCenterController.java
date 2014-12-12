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

import com.vroozi.api.model.CostCenter;
import com.vroozi.api.services.CostCenterService;

@Controller
@RequestMapping(value = "/costCenters")
public class CostCenterController {

  private static final Logger LOG = LoggerFactory.getLogger(CostCenterController.class);

  @Autowired
  private CostCenterService costCenterService;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<CostCenter> listCostCenters() {
    return costCenterService.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<CostCenter> getCostCentersByUnitId(@PathVariable("unitId") String unitId) {
    return costCenterService.findAllByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public CostCenter getCostCenter(@PathVariable("id") String id) {
    return costCenterService.find(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public CostCenter createCostCenter(@RequestBody CostCenter costCenter) {
    LOG.info("Getting Cost center from external api => {}", costCenter.toString());
    return costCenterService.addNew(costCenter);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public CostCenter updateCostCenter(@PathVariable("id") String id, @RequestBody CostCenter costCenter) {
    costCenter.setId(id);
    return costCenterService.update(costCenter);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public CostCenter deleteCostCenter(@PathVariable("id") String id) {
    CostCenter costCenter = costCenterService.find(id);
    if (costCenter != null) {
      costCenterService.remove(costCenter);
    }
    return costCenterService.addNew(costCenter);
  }

}
