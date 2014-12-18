package com.vroozi.api.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * @Getter
 * 
 * @Setter
 * 
 * @EqualsAndHashCode(exclude={"id", "lastUpdated"})
 * 
 * @ToString
 */
@Document(collection = "wbs_elements")
public class WBSElement implements Serializable {

  private static final long serialVersionUID = -5048621302155595980L;

  @Id
  private String id;
  private String unitId;
  private String code;
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

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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
    result = prime * result + ((code == null) ? 0 : code.hashCode());
    result = prime * result + ((companyCode == null) ? 0 : companyCode.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
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
    WBSElement other = (WBSElement) obj;
    if (active == null) {
      if (other.active != null)
        return false;
    } else if (!active.equals(other.active))
      return false;
    if (code == null) {
      if (other.code != null)
        return false;
    } else if (!code.equals(other.code))
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
    return "WBSElement [id=" + id + ", unitId=" + unitId + ", code=" + code + ", description=" + description + ", companyCode="
        + companyCode + ", profitCenter=" + profitCenter + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", deleted="
        + deleted + ", active=" + active + "]";
  }

}
