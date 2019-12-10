package com.vroozi.api.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vroozi.api.model.Supplier;
import com.vroozi.api.repositories.SupplierRepository;
import com.vroozi.api.services.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

  @Autowired
  private SupplierRepository supplierRepository;

  @Override
  public Supplier addNew(Supplier t) {
    t.setActive(true);
    t.setDateCreated(new Date());
    t.setDeleted(false);
    if (t.getUnitId() != null) {
      return this.supplierRepository.save(t);
    }
    return null;
  }

  @Override
  public List<Supplier> addAll(List<Supplier> list) {
    return this.supplierRepository.save(list);
  }

  @Override
  public Supplier update(Supplier t) {
    return this.supplierRepository.save(t);
  }

  @Override
  public void remove(Supplier t) {
    this.supplierRepository.delete(t);
  }

  @Override
  public void removeBy(String id) {
    this.supplierRepository.delete(id);
  }

  @Override
  public Supplier find(String id) {
    return this.supplierRepository.findOne(id);
  }

  @Override
  public List<Supplier> findAll() {
    return this.supplierRepository.findAll();
  }

  @Override
  public List<Supplier> findAllByUnitId(String unitId) {
    return this.supplierRepository.findByUnitId(unitId);
  }

}
