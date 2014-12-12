package com.vroozi.api.services;

import java.io.Serializable;
import java.util.List;

/**
 * This class contains the generic methods required for CRUD operations
 * 
 * @param <T> Domain object of type <T>
 * @param <Pk> Primary Key of the Domain object
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 */
public interface CrudService<T extends Serializable, Pk extends Serializable> {

  /**
   * Adds new record of type T
   * 
   * @param t instance of model type T
   * 
   * @return T returns the added model
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public T addNew(T t);

  /**
   * Add list of records
   *
   * @param list
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public List<T> addAll(List<T> list);

  /**
   * Update record with given data
   *
   * @param t
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public T update(T t);

  /**
   * remove given record
   *
   * @param t
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public void remove(T t);

  /**
   * remove by given ID/Code .
   *
   * @param id which must be unique
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public void removeBy(Pk id);

  /**
   * Find record with given id
   *
   * @param id
   * 
   * @return record if found otherwise return null
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public T find(Pk id);

  /**
   * Find all records
   *
   * @return
   * 
   * @author anishmanandhar<anishmanandhar@lftechnology.com>
   */
  public List<T> findAll();
}
