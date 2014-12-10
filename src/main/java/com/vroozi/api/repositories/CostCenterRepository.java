package com.vroozi.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.CostCenter;

@Repository
public interface CostCenterRepository extends MongoRepository<CostCenter, String>{

}
