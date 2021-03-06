package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.CostCenter;

@Repository
public interface CostCenterRepository extends MongoRepository<CostCenter, String>{

	public List<CostCenter> findByUnitId(String unitId);
	
}
