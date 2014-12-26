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
import com.vroozi.api.response.JsonResponse;
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
  public JsonResponse<CostCenter> createCostCenter(@RequestBody CostCenter costCenter) {
    JsonResponse<CostCenter> jsonResponse = new JsonResponse<CostCenter>();
    try {
      CostCenter cc = costCenterService.addNew(costCenter);
      LOG.info("Cost center => {}", cc.toString());
      jsonResponse.getStatus().setCode("201");
      jsonResponse.getStatus().setMessage("Cost Center Created");
      jsonResponse.getStatus().setText("OK");
      jsonResponse.setObject(cc);
    } catch (Exception ex) {
      jsonResponse.getStatus().setCode("500");
      jsonResponse.getStatus().setText("Server Error");
      jsonResponse.getStatus().setMessage(ex.getMessage());
    }
    return jsonResponse;
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
