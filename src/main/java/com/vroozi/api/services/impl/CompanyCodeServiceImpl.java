package com.vroozi.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vroozi.api.model.CompanyCode;
import com.vroozi.api.repositories.CompanyCodeRepository;
import com.vroozi.api.services.CompanyCodeService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Service
@Transactional(readOnly = true)
public class CompanyCodeServiceImpl implements CompanyCodeService {

  @Autowired
  private CompanyCodeRepository companyCodeRepository;

  @Override
  @Transactional
  public CompanyCode addNew(CompanyCode t) {
    return this.companyCodeRepository.save(t);
  }

  @Override
  @Transactional
  public List<CompanyCode> addAll(List<CompanyCode> list) {
    return this.companyCodeRepository.save(list);
  }

  @Override
  @Transactional
  public CompanyCode update(CompanyCode t) {
    return this.companyCodeRepository.save(t);
  }

  @Override
  @Transactional
  public void remove(CompanyCode t) {
    this.companyCodeRepository.delete(t);
  }

  @Override
  @Transactional
  public void removeBy(String id) {
    this.companyCodeRepository.delete(id);
  }

  @Override
  public CompanyCode find(String id) {
    return this.companyCodeRepository.findOne(id);
  }

  @Override
  public List<CompanyCode> findAll() {
    return this.companyCodeRepository.findAll();
  }

}
