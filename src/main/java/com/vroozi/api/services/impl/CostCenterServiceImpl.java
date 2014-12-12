package com.vroozi.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vroozi.api.model.CostCenter;
import com.vroozi.api.repositories.CostCenterRepository;
import com.vroozi.api.services.CostCenterService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
public class CostCenterServiceImpl implements CostCenterService {

  @Autowired
  private CostCenterRepository costCenterRepository;

  @Override
  public CostCenter addNew(CostCenter t) {
    return this.costCenterRepository.save(t);
  }

  @Override
  public List<CostCenter> addAll(List<CostCenter> list) {
    return this.costCenterRepository.save(list);
  }

  @Override
  public CostCenter update(CostCenter t) {
    return this.costCenterRepository.save(t);
  }

  @Override
  public void remove(CostCenter t) {
    this.costCenterRepository.delete(t);
  }

  @Override
  public void removeBy(String id) {
    this.costCenterRepository.delete(id);
  }

  @Override
  public CostCenter find(String id) {
    return this.costCenterRepository.findOne(id);
  }

  @Override
  public List<CostCenter> findAll() {
    return this.costCenterRepository.findAll();
  }

  @Override
  public List<CostCenter> findAllByUnitId(String unitId) {
    return this.costCenterRepository.findByUnitId(unitId);
  }

}
