package com.vroozi.api.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vroozi.api.model.CostCenter;
import com.vroozi.api.repositories.CostCenterRepository;
import com.vroozi.api.services.CostCenterService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
@Transactional(readOnly = true)
public class CostCenterServiceImpl implements CostCenterService {

  @Autowired
  private CostCenterRepository costCenterRepository;

  @Override
  @Transactional
  public CostCenter addNew(CostCenter t) {
    t.setDateCreated(new Date());
    t.setDeleted(false);
    t.setActive(true);
    return this.costCenterRepository.save(t);
  }

  @Override
  @Transactional
  public List<CostCenter> addAll(List<CostCenter> list) {
    for (CostCenter costCenter : list) {
      costCenter.setDateCreated(new Date());
      costCenter.setDeleted(false);
      costCenter.setActive(true);
    }
    return this.costCenterRepository.save(list);
  }

  @Override
  @Transactional
  public CostCenter update(CostCenter t) {
    t.setLastUpdated(new Date());
    return this.costCenterRepository.save(t);
  }

  @Override
  @Transactional
  public void remove(CostCenter t) {
    this.costCenterRepository.delete(t);
  }

  @Override
  @Transactional
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
