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

import com.vroozi.api.model.WBSElement;
import com.vroozi.api.repositories.WBSElementRepository;

@Controller
@RequestMapping(value = "/wbsElements")
public class WBSElementController {

  @Autowired
  private WBSElementRepository wbsElementRepository;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<WBSElement> listWBSElements() {
    return wbsElementRepository.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<WBSElement> getWBSElementsByUnitId(@PathVariable("unitId") String unitId) {
    return wbsElementRepository.findByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public WBSElement getWBSElement(@PathVariable("id") String id) {
    return wbsElementRepository.findOne(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public WBSElement createWBSElement(@RequestBody WBSElement wbsElement) {
    return wbsElementRepository.save(wbsElement);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public WBSElement updateWBSElement(@PathVariable("id") String id, @RequestBody WBSElement wbsElement) {
    // wbsElement.setId(id);
    return wbsElementRepository.save(wbsElement);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public WBSElement deleteWBSElement(@PathVariable("id") String id) {
    WBSElement wbsElement = wbsElementRepository.findOne(id);
    if (wbsElement != null) {
      wbsElementRepository.delete(wbsElement);
    }
    return wbsElementRepository.save(wbsElement);
  }

}
