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

import com.vroozi.api.model.Supplier;
import com.vroozi.api.services.SupplierService;

@Controller
@RequestMapping(value = "/suppliers")
public class SupplierController {

  @Autowired
  private SupplierService supplierService;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<Supplier> listOfSuppliers() {
    return supplierService.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<Supplier> getSuppliersByUnitId(@PathVariable("unitId") String unitId) {
    return supplierService.findAllByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public Supplier getSupplier(@PathVariable("id") String id) {
    return supplierService.find(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public Supplier createSupplier(@RequestBody Supplier supplier) {
    return supplierService.addNew(supplier);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public Supplier updateSupplier(@PathVariable("id") String id, @RequestBody Supplier supplier) {
    supplier.setId(id);
    return supplierService.update(supplier);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public Supplier deleteSupplier(@PathVariable("id") String id) {
    Supplier supplier = supplierService.find(id);
    if (supplier != null) {
      supplierService.remove(supplier);
    }
    return supplierService.update(supplier);
  }

}
