package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vroozi.api.model.ChartOfAccount;

public interface ChartOfAccountRepository extends MongoRepository<ChartOfAccount, String>{

	public List<ChartOfAccount> findByUnitId(String unitId);
	
}
