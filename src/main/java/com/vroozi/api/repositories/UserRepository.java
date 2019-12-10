package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  public List<User> findByUnitId(String unitId);
}
