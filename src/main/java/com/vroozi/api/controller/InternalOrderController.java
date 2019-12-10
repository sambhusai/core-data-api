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

import com.vroozi.api.model.InternalOrder;
import com.vroozi.api.services.InternalOrderService;

@Controller
@RequestMapping(value = "/internalOrders")
public class InternalOrderController {

  @Autowired
  private InternalOrderService internalOrderService;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<InternalOrder> listOfInternalOrders() {
    return internalOrderService.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<InternalOrder> getInternalOrdersByUnitId(@PathVariable("unitId") String unitId) {
    return internalOrderService.findAllByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public InternalOrder getInternalOrder(@PathVariable("id") String id) {
    return internalOrderService.find(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public InternalOrder createInternalOrder(@RequestBody InternalOrder internalOrder) {
    return internalOrderService.addNew(internalOrder);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public InternalOrder updateInternalOrder(@PathVariable("id") String id, @RequestBody InternalOrder internalOrder) {
    internalOrder.setId(id);
    return internalOrderService.update(internalOrder);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public InternalOrder deleteInternalOrder(@PathVariable("id") String id) {
    InternalOrder internalOrder = internalOrderService.find(id);
    if (internalOrder != null) {
      internalOrderService.remove(internalOrder);
    }
    return internalOrderService.update(internalOrder);
  }

}
