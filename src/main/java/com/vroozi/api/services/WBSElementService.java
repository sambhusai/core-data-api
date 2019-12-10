package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.WBSElement;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
public interface WBSElementService extends MasterDataService<WBSElement, String> {

  /**
   * 
   * @param unitId
   * @return
   */
  List<WBSElement> findByUnitId(String unitId);
}
