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
import com.vroozi.api.repositories.GLAccountRepository;

@Controller
@RequestMapping(value = "/glAccounts")
public class GLAccountController {

  @Autowired
  private GLAccountRepository glAccountRepository;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<GLAccount> listGLAccounts() {
    return glAccountRepository.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<GLAccount> getGLAccountsByUnitId(@PathVariable("unitId") String unitId) {
    return glAccountRepository.findByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount getGLAccount(@PathVariable("id") String id) {
    return glAccountRepository.findOne(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount createGLAccount(@RequestBody GLAccount glAccount) {
    return glAccountRepository.save(glAccount);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount updateGLAccount(@PathVariable("id") String id, @RequestBody GLAccount glAccount) {
    // glAccount.setId(id);
    return glAccountRepository.save(glAccount);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public GLAccount deleteGLAccount(@PathVariable("id") String id) {
    GLAccount glAccount = glAccountRepository.findOne(id);
    if (glAccount != null) {
      glAccountRepository.delete(glAccount);
    }
    return glAccountRepository.save(glAccount);
  }

}
