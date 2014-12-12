package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.CostCenter;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
public interface CostCenterService extends CrudService<CostCenter, String> {

  /**
   * 
   * @param unitId
   * @return
   */
  List<CostCenter> findAllByUnitId(String unitId);
}
