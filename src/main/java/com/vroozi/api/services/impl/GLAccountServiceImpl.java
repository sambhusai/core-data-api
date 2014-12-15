package com.vroozi.api.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vroozi.api.model.GLAccount;
import com.vroozi.api.repositories.GLAccountRepository;
import com.vroozi.api.services.GLAccountService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
@Transactional(readOnly = true)
public class GLAccountServiceImpl implements GLAccountService {

  @Autowired
  private GLAccountRepository glAccountRepository;

  @Override
  @Transactional
  public GLAccount addNew(GLAccount t) {
    t.setActive(true);
    t.setDateCreated(new Date());
    t.setDeleted(false);
    if (t.getUnitId() != null) {
      return this.glAccountRepository.save(t);
    }
    return null;
  }

  @Override
  @Transactional
  public List<GLAccount> addAll(List<GLAccount> list) {
    for (GLAccount glAccount : list) {
      glAccount.setActive(true);
      glAccount.setDateCreated(new Date());
      glAccount.setDeleted(false);
    }
    return this.glAccountRepository.save(list);
  }

  @Override
  @Transactional
  public GLAccount update(GLAccount t) {
    t.setLastUpdated(new Date());
    return this.glAccountRepository.save(t);
  }

  @Override
  @Transactional
  public void remove(GLAccount t) {
    this.glAccountRepository.delete(t);
  }

  @Override
  @Transactional
  public void removeBy(String id) {
    this.glAccountRepository.delete(id);
  }

  @Override
  public GLAccount find(String id) {
    return this.glAccountRepository.findOne(id);
  }

  @Override
  public List<GLAccount> findAll() {
    return this.glAccountRepository.findAll();
  }

  @Override
  public List<GLAccount> findByUnitId(String unitId) {
    return this.glAccountRepository.findByUnitId(unitId);
  }
}
