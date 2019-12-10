package com.vroozi.api.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vroozi.api.model.WBSElement;
import com.vroozi.api.repositories.WBSElementRepository;
import com.vroozi.api.services.WBSElementService;

@Service
@Transactional(readOnly = true)
public class WBSElementServiceImpl implements WBSElementService {

  @Autowired
  private WBSElementRepository wbsElementRepository;

  @Override
  @Transactional
  public WBSElement addNew(WBSElement t) {
    t.setActive(true);
    t.setDateCreated(new Date());
    t.setDeleted(false);
    if (t.getUnitId() != null) {
      return this.wbsElementRepository.save(t);
    }
    return null;
  }

  @Override
  @Transactional
  public List<WBSElement> addAll(List<WBSElement> list) {
    for (WBSElement wsbElement : list) {
      wsbElement.setActive(true);
      wsbElement.setDateCreated(new Date());
      wsbElement.setDeleted(false);
    }
    return this.wbsElementRepository.save(list);
  }

  @Override
  @Transactional
  public WBSElement update(WBSElement t) {
    return this.wbsElementRepository.save(t);
  }

  @Override
  @Transactional
  public void remove(WBSElement t) {
    this.wbsElementRepository.delete(t);
  }

  @Override
  @Transactional
  public void removeBy(String id) {
    this.wbsElementRepository.delete(id);
  }

  @Override
  public WBSElement find(String id) {
    return this.wbsElementRepository.findOne(id);
  }

  @Override
  public List<WBSElement> findAll() {
    return this.wbsElementRepository.findAll();
  }

  @Override
  public List<WBSElement> findByUnitId(String unitId) {
    return this.wbsElementRepository.findByUnitId(unitId);
  }

}
