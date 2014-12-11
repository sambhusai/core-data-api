package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.CompanyCode;

@Repository
public interface CompanyCodeRepository extends MongoRepository<CompanyCode, String>{

	public List<CompanyCode> findByUnitId(String unitId);
	
}
