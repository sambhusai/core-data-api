package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.InternalOrder;

@Repository
public interface InternalOrderRepository extends MongoRepository<InternalOrder, String> {

  public List<InternalOrder> findByUnitId(String unitId);
}
