package com.vroozi.api.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vroozi.api.model.User;
import com.vroozi.api.repositories.UserRepository;
import com.vroozi.api.services.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User addNew(User t) {
    t.setActive(true);
    t.setDateCreated(new Date());
    t.setDeleted(false);
    if (t.getUnitId() != null) {
      return this.userRepository.save(t);
    }
    return null;
  }

  @Override
  public List<User> addAll(List<User> list) {
    return this.userRepository.save(list);
  }

  @Override
  public User update(User t) {
    return this.userRepository.save(t);
  }

  @Override
  public void remove(User t) {
    this.userRepository.delete(t);
  }

  @Override
  public void removeBy(String id) {
    this.userRepository.delete(id);
  }

  @Override
  public User find(String id) {
    return this.userRepository.findOne(id);
  }

  @Override
  public List<User> findAll() {
    return this.userRepository.findAll();
  }

  @Override
  public List<User> findAllByUnitId(String unitId) {
    return this.userRepository.findByUnitId(unitId);
  }

}
