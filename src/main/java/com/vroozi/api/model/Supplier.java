package com.vroozi.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@Document(collection = "supplier")
public class Supplier implements Serializable {

  private static final long serialVersionUID = 335007147888039906L;

  @Id
  private String id;
  private String unitId;
  private String companyName;
  private String additionalName1;
  private String additionalName2;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String zip;
  private String country;
  private String dunsNumber;
  private String uniqueSupplierId;
  private String defaultVendorId;
  private String currencyCode;
  private String contactName;
  private String contactRole;
  private String phone;
  private String fax;
  private String email;
  private String language;
  private String timeZone;
  private String decimalNotation;
  private String dateFormat;
  private String logo;
  private String paymentTerms;
  private String minimumOrder;
  private List<String> companyAttribute;
  private String preferred;
  private String minority;
  private String womanOwned;
  private String veteran;
  private String hubZone;
  private String greenCertified;
  private Date dateCreated;
  private Date lastUpdated;
  private Boolean active;
  private Boolean deleted;
  private String companyCode;
  private Boolean grBasedInvoiceVerification;

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

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getAdditionalName1() {
    return additionalName1;
  }

  public void setAdditionalName1(String additionalName1) {
    this.additionalName1 = additionalName1;
  }

  public String getAdditionalName2() {
    return additionalName2;
  }

  public void setAdditionalName2(String additionalName2) {
    this.additionalName2 = additionalName2;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getDunsNumber() {
    return dunsNumber;
  }

  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }

  public String getUniqueSupplierId() {
    return uniqueSupplierId;
  }

  public void setUniqueSupplierId(String uniqueSupplierId) {
    this.uniqueSupplierId = uniqueSupplierId;
  }

  public String getDefaultVendorId() {
    return defaultVendorId;
  }

  public void setDefaultVendorId(String defaultVendorId) {
    this.defaultVendorId = defaultVendorId;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public String getContactRole() {
    return contactRole;
  }

  public void setContactRole(String contactRole) {
    this.contactRole = contactRole;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getDecimalNotation() {
    return decimalNotation;
  }

  public void setDecimalNotation(String decimalNotation) {
    this.decimalNotation = decimalNotation;
  }

  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public String getMinimumOrder() {
    return minimumOrder;
  }

  public void setMinimumOrder(String minimumOrder) {
    this.minimumOrder = minimumOrder;
  }

  public List<String> getCompanyAttribute() {
    return companyAttribute;
  }

  public void setCompanyAttribute(List<String> companyAttribute) {
    this.companyAttribute = companyAttribute;
  }

  public String getPreferred() {
    return preferred;
  }

  public void setPreferred(String preferred) {
    this.preferred = preferred;
  }

  public String getMinority() {
    return minority;
  }

  public void setMinority(String minority) {
    this.minority = minority;
  }

  public String getWomanOwned() {
    return womanOwned;
  }

  public void setWomanOwned(String womanOwned) {
    this.womanOwned = womanOwned;
  }

  public String getVeteran() {
    return veteran;
  }

  public void setVeteran(String veteran) {
    this.veteran = veteran;
  }

  public String getHubZone() {
    return hubZone;
  }

  public void setHubZone(String hubZone) {
    this.hubZone = hubZone;
  }

  public String getGreenCertified() {
    return greenCertified;
  }

  public void setGreenCertified(String greenCertified) {
    this.greenCertified = greenCertified;
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

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public Boolean getGrBasedInvoiceVerification() {
    return grBasedInvoiceVerification;
  }

  public void setGrBasedInvoiceVerification(Boolean grBasedInvoiceVerification) {
    this.grBasedInvoiceVerification = grBasedInvoiceVerification;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((active == null) ? 0 : active.hashCode());
    result = prime * result + ((additionalName1 == null) ? 0 : additionalName1.hashCode());
    result = prime * result + ((additionalName2 == null) ? 0 : additionalName2.hashCode());
    result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
    result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
    result = prime * result + ((city == null) ? 0 : city.hashCode());
    result = prime * result + ((companyAttribute == null) ? 0 : companyAttribute.hashCode());
    result = prime * result + ((companyCode == null) ? 0 : companyCode.hashCode());
    result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
    result = prime * result + ((contactName == null) ? 0 : contactName.hashCode());
    result = prime * result + ((contactRole == null) ? 0 : contactRole.hashCode());
    result = prime * result + ((country == null) ? 0 : country.hashCode());
    result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((dateFormat == null) ? 0 : dateFormat.hashCode());
    result = prime * result + ((decimalNotation == null) ? 0 : decimalNotation.hashCode());
    result = prime * result + ((defaultVendorId == null) ? 0 : defaultVendorId.hashCode());
    result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
    result = prime * result + ((dunsNumber == null) ? 0 : dunsNumber.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + ((fax == null) ? 0 : fax.hashCode());
    result = prime * result + ((grBasedInvoiceVerification == null) ? 0 : grBasedInvoiceVerification.hashCode());
    result = prime * result + ((greenCertified == null) ? 0 : greenCertified.hashCode());
    result = prime * result + ((hubZone == null) ? 0 : hubZone.hashCode());
    result = prime * result + ((language == null) ? 0 : language.hashCode());
    result = prime * result + ((logo == null) ? 0 : logo.hashCode());
    result = prime * result + ((minimumOrder == null) ? 0 : minimumOrder.hashCode());
    result = prime * result + ((minority == null) ? 0 : minority.hashCode());
    result = prime * result + ((paymentTerms == null) ? 0 : paymentTerms.hashCode());
    result = prime * result + ((phone == null) ? 0 : phone.hashCode());
    result = prime * result + ((preferred == null) ? 0 : preferred.hashCode());
    result = prime * result + ((state == null) ? 0 : state.hashCode());
    result = prime * result + ((timeZone == null) ? 0 : timeZone.hashCode());
    result = prime * result + ((uniqueSupplierId == null) ? 0 : uniqueSupplierId.hashCode());
    result = prime * result + ((unitId == null) ? 0 : unitId.hashCode());
    result = prime * result + ((veteran == null) ? 0 : veteran.hashCode());
    result = prime * result + ((womanOwned == null) ? 0 : womanOwned.hashCode());
    result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
    Supplier other = (Supplier) obj;
    if (active == null) {
      if (other.active != null)
        return false;
    } else if (!active.equals(other.active))
      return false;
    if (additionalName1 == null) {
      if (other.additionalName1 != null)
        return false;
    } else if (!additionalName1.equals(other.additionalName1))
      return false;
    if (additionalName2 == null) {
      if (other.additionalName2 != null)
        return false;
    } else if (!additionalName2.equals(other.additionalName2))
      return false;
    if (address1 == null) {
      if (other.address1 != null)
        return false;
    } else if (!address1.equals(other.address1))
      return false;
    if (address2 == null) {
      if (other.address2 != null)
        return false;
    } else if (!address2.equals(other.address2))
      return false;
    if (city == null) {
      if (other.city != null)
        return false;
    } else if (!city.equals(other.city))
      return false;
    if (companyAttribute == null) {
      if (other.companyAttribute != null)
        return false;
    } else if (!companyAttribute.equals(other.companyAttribute))
      return false;
    if (companyCode == null) {
      if (other.companyCode != null)
        return false;
    } else if (!companyCode.equals(other.companyCode))
      return false;
    if (companyName == null) {
      if (other.companyName != null)
        return false;
    } else if (!companyName.equals(other.companyName))
      return false;
    if (contactName == null) {
      if (other.contactName != null)
        return false;
    } else if (!contactName.equals(other.contactName))
      return false;
    if (contactRole == null) {
      if (other.contactRole != null)
        return false;
    } else if (!contactRole.equals(other.contactRole))
      return false;
    if (country == null) {
      if (other.country != null)
        return false;
    } else if (!country.equals(other.country))
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
    if (dateFormat == null) {
      if (other.dateFormat != null)
        return false;
    } else if (!dateFormat.equals(other.dateFormat))
      return false;
    if (decimalNotation == null) {
      if (other.decimalNotation != null)
        return false;
    } else if (!decimalNotation.equals(other.decimalNotation))
      return false;
    if (defaultVendorId == null) {
      if (other.defaultVendorId != null)
        return false;
    } else if (!defaultVendorId.equals(other.defaultVendorId))
      return false;
    if (deleted == null) {
      if (other.deleted != null)
        return false;
    } else if (!deleted.equals(other.deleted))
      return false;
    if (dunsNumber == null) {
      if (other.dunsNumber != null)
        return false;
    } else if (!dunsNumber.equals(other.dunsNumber))
      return false;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    if (fax == null) {
      if (other.fax != null)
        return false;
    } else if (!fax.equals(other.fax))
      return false;
    if (grBasedInvoiceVerification == null) {
      if (other.grBasedInvoiceVerification != null)
        return false;
    } else if (!grBasedInvoiceVerification.equals(other.grBasedInvoiceVerification))
      return false;
    if (greenCertified == null) {
      if (other.greenCertified != null)
        return false;
    } else if (!greenCertified.equals(other.greenCertified))
      return false;
    if (hubZone == null) {
      if (other.hubZone != null)
        return false;
    } else if (!hubZone.equals(other.hubZone))
      return false;
    if (language == null) {
      if (other.language != null)
        return false;
    } else if (!language.equals(other.language))
      return false;
    if (logo == null) {
      if (other.logo != null)
        return false;
    } else if (!logo.equals(other.logo))
      return false;
    if (minimumOrder == null) {
      if (other.minimumOrder != null)
        return false;
    } else if (!minimumOrder.equals(other.minimumOrder))
      return false;
    if (minority == null) {
      if (other.minority != null)
        return false;
    } else if (!minority.equals(other.minority))
      return false;
    if (paymentTerms == null) {
      if (other.paymentTerms != null)
        return false;
    } else if (!paymentTerms.equals(other.paymentTerms))
      return false;
    if (phone == null) {
      if (other.phone != null)
        return false;
    } else if (!phone.equals(other.phone))
      return false;
    if (preferred == null) {
      if (other.preferred != null)
        return false;
    } else if (!preferred.equals(other.preferred))
      return false;
    if (state == null) {
      if (other.state != null)
        return false;
    } else if (!state.equals(other.state))
      return false;
    if (timeZone == null) {
      if (other.timeZone != null)
        return false;
    } else if (!timeZone.equals(other.timeZone))
      return false;
    if (uniqueSupplierId == null) {
      if (other.uniqueSupplierId != null)
        return false;
    } else if (!uniqueSupplierId.equals(other.uniqueSupplierId))
      return false;
    if (unitId == null) {
      if (other.unitId != null)
        return false;
    } else if (!unitId.equals(other.unitId))
      return false;
    if (veteran == null) {
      if (other.veteran != null)
        return false;
    } else if (!veteran.equals(other.veteran))
      return false;
    if (womanOwned == null) {
      if (other.womanOwned != null)
        return false;
    } else if (!womanOwned.equals(other.womanOwned))
      return false;
    if (zip == null) {
      if (other.zip != null)
        return false;
    } else if (!zip.equals(other.zip))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "Supplier [id=" + id + ", unitId=" + unitId + ", companyName=" + companyName + ", additionalName1=" + additionalName1
        + ", additionalName2=" + additionalName2 + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state="
        + state + ", zip=" + zip + ", country=" + country + ", dunsNumber=" + dunsNumber + ", uniqueSupplierId=" + uniqueSupplierId
        + ", defaultVendorId=" + defaultVendorId + ", currencyCode=" + currencyCode + ", contactName=" + contactName + ", contactRole="
        + contactRole + ", phone=" + phone + ", fax=" + fax + ", email=" + email + ", language=" + language + ", timeZone=" + timeZone
        + ", decimalNotation=" + decimalNotation + ", dateFormat=" + dateFormat + ", logo=" + logo + ", paymentTerms=" + paymentTerms
        + ", minimumOrder=" + minimumOrder + ", companyAttribute=" + companyAttribute + ", preferred=" + preferred + ", minority="
        + minority + ", womanOwned=" + womanOwned + ", veteran=" + veteran + ", hubZone=" + hubZone + ", greenCertified=" + greenCertified
        + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", active=" + active + ", deleted=" + deleted
        + ", companyCode=" + companyCode + ", grBasedInvoiceVerification=" + grBasedInvoiceVerification + "]";
  }


}
