package com.vroozi.api.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Document(collection = "internal_order")
public class InternalOrder implements Serializable {

  private static final long serialVersionUID = -4982629947930237562L;

  private String id;
  private String unitId;
  private String orderNumber;
  private String description;
  private String companyCode;
  private String profitCenter;
  private Date dateCreated;
  private Date lastUpdated;
  private Boolean deleted;
  private Boolean active;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public String getProfitCenter() {
    return profitCenter;
  }

  public void setProfitCenter(String profitCenter) {
    this.profitCenter = profitCenter;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((active == null) ? 0 : active.hashCode());
    result = prime * result + ((companyCode == null) ? 0 : companyCode.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
    result = prime * result + ((profitCenter == null) ? 0 : profitCenter.hashCode());
    result = prime * result + ((unitId == null) ? 0 : unitId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    InternalOrder other = (InternalOrder) obj;
    if (active == null) {
      if (other.active != null)
        return false;
    } else if (!active.equals(other.active))
      return false;
    if (companyCode == null) {
      if (other.companyCode != null)
        return false;
    } else if (!companyCode.equals(other.companyCode))
      return false;
    if (dateCreated == null) {
      if (other.dateCreated != null)
        return false;
    } else if (!dateCreated.equals(other.dateCreated))
      return false;
    if (deleted == null) {
      if (other.deleted != null)
        return false;
    } else if (!deleted.equals(other.deleted))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (orderNumber == null) {
      if (other.orderNumber != null)
        return false;
    } else if (!orderNumber.equals(other.orderNumber))
      return false;
    if (profitCenter == null) {
      if (other.profitCenter != null)
        return false;
    } else if (!profitCenter.equals(other.profitCenter))
      return false;
    if (unitId == null) {
      if (other.unitId != null)
        return false;
    } else if (!unitId.equals(other.unitId))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "InternalOrder [id=" + id + ", unitId=" + unitId + ", orderNumber=" + orderNumber + ", description=" + description
        + ", companyCode=" + companyCode + ", profitCenter=" + profitCenter + ", dateCreated=" + dateCreated + ", lastUpdated="
        + lastUpdated + ", deleted=" + deleted + ", active=" + active + "]";
  }

}