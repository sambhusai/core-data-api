package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.ChartOfAccount;

/**
 * This interface extends {@link MasterDataService}
 * 
 * Contains all the method required for CRUD operation of {@link ChartOfAccount}
 * 
 * Contains method specific to {@link ChartOfAccountService} implementation
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
public interface ChartOfAccountService extends MasterDataService<ChartOfAccount, String> {

  /**
   * Get list of {@link ChartOfAccount} by unitId
   * 
   * @param unitId
   * 
   * @return list of {@link ChartOfAccount}
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  List<ChartOfAccount> findAllByUnitId(String unitId);
}
