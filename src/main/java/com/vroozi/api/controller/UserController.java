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

import com.vroozi.api.model.User;
import com.vroozi.api.services.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  private UserService userService;

  @ResponseBody
  @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<User> listOfInternalOrders() {
    return userService.findAll();
  }

  @ResponseBody
  @RequestMapping(value = "/unitId/{unitId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<User> getInternalOrdersByUnitId(@PathVariable("unitId") String unitId) {
    return userService.findAllByUnitId(unitId);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
  public User getInternalOrder(@PathVariable("id") String id) {
    return userService.find(id);
  }

  @ResponseBody
  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public User createInternalOrder(@RequestBody User user) {
    return userService.addNew(user);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
  public User updateInternalOrder(@PathVariable("id") String id, @RequestBody User user) {
    user.setId(id);
    return userService.update(user);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
  public User deleteInternalOrder(@PathVariable("id") String id) {
    User user = userService.find(id);
    if (user != null) {
      userService.remove(user);
    }
    return userService.update(user);
  }

}
