package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.Supplier;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
public interface SupplierService extends MasterDataService<Supplier, String> {

  public List<Supplier> findAllByUnitId(String unitId);
}
