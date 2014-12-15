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

import com.vroozi.api.model.GLAccount;
import com.vroozi.api.services.GLAccountService;

@Controller
@RequestMapping(value = "/glAccounts")
public class GLAccountController {

  @Autowired
  private GLAccountService glAccountService;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<GLAccount> listGLAccounts() {
    return glAccountService.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<GLAccount> getGLAccountsByUnitId(@PathVariable("unitId") String unitId) {
    return glAccountService.findByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount getGLAccount(@PathVariable("id") String id) {
    return glAccountService.find(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount createGLAccount(@RequestBody GLAccount glAccount) {
    return glAccountService.addNew(glAccount);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount updateGLAccount(@PathVariable("id") String id, @RequestBody GLAccount glAccount) {
    // glAccount.setId(id);
    return glAccountService.update(glAccount);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount deleteGLAccount(@PathVariable("id") String id) {
    GLAccount glAccount = glAccountService.find(id);
    if (glAccount != null) {
      glAccountService.remove(glAccount);
    }
    return glAccountService.addNew(glAccount);
  }

}
