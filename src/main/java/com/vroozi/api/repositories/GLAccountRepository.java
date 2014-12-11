package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.GLAccount;

@Repository
public interface GLAccountRepository extends MongoRepository<GLAccount, String>{

	public List<GLAccount> findByUnitId(String unitId);
	
}
