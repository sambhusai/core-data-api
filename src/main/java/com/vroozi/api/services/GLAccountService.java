package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.GLAccount;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
public interface GLAccountService extends MasterDataService<GLAccount, String> {

  /**
   * Get list of {@link GLAccount} from unitId
   * 
   * @param unitId
   * 
   * @return
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  List<GLAccount> findByUnitId(String unitId);
}
