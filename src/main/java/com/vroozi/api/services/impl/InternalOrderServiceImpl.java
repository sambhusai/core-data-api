package com.vroozi.api.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vroozi.api.model.InternalOrder;
import com.vroozi.api.repositories.InternalOrderRepository;
import com.vroozi.api.services.InternalOrderService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
public class InternalOrderServiceImpl implements InternalOrderService {

  @Autowired
  private InternalOrderRepository interalOrderRepository;

  @Override
  public InternalOrder addNew(InternalOrder t) {
    t.setActive(true);
    t.setDateCreated(new Date());
    t.setDeleted(false);
    if (t.getUnitId() != null) {
      return this.interalOrderRepository.save(t);
    }
    return null;
  }

  @Override
  public List<InternalOrder> addAll(List<InternalOrder> list) {
    return this.interalOrderRepository.save(list);
  }

  @Override
  public InternalOrder update(InternalOrder t) {
    return this.interalOrderRepository.save(t);
  }

  @Override
  public void remove(InternalOrder t) {
    this.interalOrderRepository.delete(t);
  }

  @Override
  public void removeBy(String id) {
    this.interalOrderRepository.delete(id);
  }

  @Override
  public InternalOrder find(String id) {
    return this.interalOrderRepository.findOne(id);
  }

  @Override
  public List<InternalOrder> findAll() {
    return this.interalOrderRepository.findAll();
  }

  @Override
  public List<InternalOrder> findAllByUnitId(String unitId) {
    return this.interalOrderRepository.findByUnitId(unitId);
  }

}
