package com.vroozi.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vroozi.api.model.ChartOfAccount;
import com.vroozi.api.repositories.ChartOfAccountRepository;
import com.vroozi.api.services.ChartOfAccountService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
public class ChartOfAccountServiceImpl implements ChartOfAccountService {

  @Autowired
  private ChartOfAccountRepository chartOfAccountRepository;

  @Override
  public ChartOfAccount addNew(ChartOfAccount t) {
    return chartOfAccountRepository.save(t);
  }

  @Override
  public void addAll(List<ChartOfAccount> list) {
    chartOfAccountRepository.save(list);
  }

  @Override
  public ChartOfAccount update(ChartOfAccount t) {
    return chartOfAccountRepository.save(t);
  }

  @Override
  public void remove(ChartOfAccount t) {
    chartOfAccountRepository.delete(t);
  }

  @Override
  public void removeBy(String id) {
    chartOfAccountRepository.delete(id);
  }

  @Override
  public ChartOfAccount find(String id) {
    return chartOfAccountRepository.findOne(id);
  }

  @Override
  public List<ChartOfAccount> findAll() {
    return chartOfAccountRepository.findAll();
  }

  @Override
  public List<ChartOfAccount> findAllByUnitId(String unitId) {
    return chartOfAccountRepository.findByUnitId(unitId);
  }

}
