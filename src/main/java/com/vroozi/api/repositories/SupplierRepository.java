package com.vroozi.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vroozi.api.model.Supplier;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Repository
public interface SupplierRepository extends MongoRepository<Supplier, String> {

  public List<Supplier> findByUnitId(String unitId);
}
