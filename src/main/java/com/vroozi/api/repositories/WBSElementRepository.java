package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.WBSElement;

@Repository
public interface WBSElementRepository extends MongoRepository<WBSElement, String>{

	public List<WBSElement> findByUnitId(String unitId);
	
}
