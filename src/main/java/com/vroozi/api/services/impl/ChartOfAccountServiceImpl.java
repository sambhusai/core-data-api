package com.vroozi.api.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vroozi.api.model.ChartOfAccount;
import com.vroozi.api.repositories.ChartOfAccountRepository;
import com.vroozi.api.services.ChartOfAccountService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
@Transactional(readOnly = true)
public class ChartOfAccountServiceImpl implements ChartOfAccountService {

  private static final Logger LOG = LoggerFactory.getLogger(ChartOfAccountService.class);
  @Autowired
  private ChartOfAccountRepository chartOfAccountRepository;

  @Override
  @Transactional
  public ChartOfAccount addNew(ChartOfAccount t) {
    LOG.info("Adding new chart of account, {}", t.toString());
    return chartOfAccountRepository.save(t);
  }

  @Override
  @Transactional
  public List<ChartOfAccount> addAll(List<ChartOfAccount> list) {
    return chartOfAccountRepository.save(list);
  }

  @Override
  @Transactional
  public ChartOfAccount update(ChartOfAccount t) {
    return chartOfAccountRepository.save(t);
  }

  @Override
  @Transactional
  public void remove(ChartOfAccount t) {
    chartOfAccountRepository.delete(t);
  }

  @Override
  @Transactional
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
