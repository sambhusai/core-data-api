package com.vroozi.api.model;

import java.io.Serializable;
import java.util.Date;

/*
 * import lombok.EqualsAndHashCode; import lombok.Getter; import lombok.Setter; import
 * lombok.ToString;
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * @Getter
 * 
 * @Setter
 * 
 * @EqualsAndHashCode(exclude = {"id", "lastUpdated"})
 * 
 * @ToString
 */
@Document(collection = "company_codes")
public class CompanyCode implements Serializable {

  private static final long serialVersionUID = 8161184275786722261L;

  @Id
  private String id;
  private String unitId;
  private String name;
  private String description;
  private String addressName;
  private String currencyCode;
  private String taxJurisdiction;
  private String vatRegistrationNumber;
  private Date dateCreated;
  private Date lastUpdated;
  private boolean deleted;
  private boolean active;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getTaxJurisdiction() {
    return taxJurisdiction;
  }

  public void setTaxJurisdiction(String taxJurisdiction) {
    this.taxJurisdiction = taxJurisdiction;
  }

  public String getVatRegistrationNumber() {
    return vatRegistrationNumber;
  }

  public void setVatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
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

  public boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (active ? 1231 : 1237);
    result = prime * result + ((addressName == null) ? 0 : addressName.hashCode());
    result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + (deleted ? 1231 : 1237);
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((taxJurisdiction == null) ? 0 : taxJurisdiction.hashCode());
    result = prime * result + ((unitId == null) ? 0 : unitId.hashCode());
    result = prime * result + ((vatRegistrationNumber == null) ? 0 : vatRegistrationNumber.hashCode());
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
    CompanyCode other = (CompanyCode) obj;
    if (active != other.active)
      return false;
    if (addressName == null) {
      if (other.addressName != null)
        return false;
    } else if (!addressName.equals(other.addressName))
      return false;
    if (currencyCode == null) {
      if (other.currencyCode != null)
        return false;
    } else if (!currencyCode.equals(other.currencyCode))
      return false;
    if (dateCreated == null) {
      if (other.dateCreated != null)
        return false;
    } else if (!dateCreated.equals(other.dateCreated))
      return false;
    if (deleted != other.deleted)
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (taxJurisdiction == null) {
      if (other.taxJurisdiction != null)
        return false;
    } else if (!taxJurisdiction.equals(other.taxJurisdiction))
      return false;
    if (unitId == null) {
      if (other.unitId != null)
        return false;
    } else if (!unitId.equals(other.unitId))
      return false;
    if (vatRegistrationNumber == null) {
      if (other.vatRegistrationNumber != null)
        return false;
    } else if (!vatRegistrationNumber.equals(other.vatRegistrationNumber))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "CompanyCode [id=" + id + ", unitId=" + unitId + ", name=" + name + ", description=" + description + ", addressName="
        + addressName + ", currencyCode=" + currencyCode + ", taxJurisdiction=" + taxJurisdiction + ", vatRegistrationNumber="
        + vatRegistrationNumber + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", deleted=" + deleted + ", active="
        + active + "]";
  }



}
