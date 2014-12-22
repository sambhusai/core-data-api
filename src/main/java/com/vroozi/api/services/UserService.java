package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.User;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
public interface UserService extends MasterDataService<User, String> {

  public List<User> findAllByUnitId(String unitId);
}
