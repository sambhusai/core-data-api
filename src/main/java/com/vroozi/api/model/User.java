package com.vroozi.api.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User implements Serializable {

  private static final long serialVersionUID = 7604753164573746055L;

  @Id
  private String id;
  private String unitId;
  private String firstName;
  private String lastName;
  private String roles;
  private String username;
  private String Status;
  private String addressName;
  private String attention;
  private String Street;
  private String city;
  private String State;
  private String postalCode;
  private String Country;
  private String Phone;
  private String userId;
  private String timeZone;
  private String decimalNotation;
  private String dateFormat;
  private Date dateCreated;
  private Date lastUpdated;
  private Boolean active;
  private Boolean deleted;

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

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getStatus() {
    return Status;
  }

  public void setStatus(String status) {
    Status = status;
  }

  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public String getAttention() {
    return attention;
  }

  public void setAttention(String attention) {
    this.attention = attention;
  }

  public String getStreet() {
    return Street;
  }

  public void setStreet(String street) {
    Street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return State;
  }

  public void setState(String state) {
    State = state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return Country;
  }

  public void setCountry(String country) {
    Country = country;
  }

  public String getPhone() {
    return Phone;
  }

  public void setPhone(String phone) {
    Phone = phone;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Country == null) ? 0 : Country.hashCode());
    result = prime * result + ((Phone == null) ? 0 : Phone.hashCode());
    result = prime * result + ((State == null) ? 0 : State.hashCode());
    result = prime * result + ((Status == null) ? 0 : Status.hashCode());
    result = prime * result + ((Street == null) ? 0 : Street.hashCode());
    result = prime * result + ((active == null) ? 0 : active.hashCode());
    result = prime * result + ((addressName == null) ? 0 : addressName.hashCode());
    result = prime * result + ((attention == null) ? 0 : attention.hashCode());
    result = prime * result + ((city == null) ? 0 : city.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((dateFormat == null) ? 0 : dateFormat.hashCode());
    result = prime * result + ((decimalNotation == null) ? 0 : decimalNotation.hashCode());
    result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
    result = prime * result + ((roles == null) ? 0 : roles.hashCode());
    result = prime * result + ((timeZone == null) ? 0 : timeZone.hashCode());
    result = prime * result + ((unitId == null) ? 0 : unitId.hashCode());
    result = prime * result + ((userId == null) ? 0 : userId.hashCode());
    result = prime * result + ((username == null) ? 0 : username.hashCode());
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
    User other = (User) obj;
    if (Country == null) {
      if (other.Country != null)
        return false;
    } else if (!Country.equals(other.Country))
      return false;
    if (Phone == null) {
      if (other.Phone != null)
        return false;
    } else if (!Phone.equals(other.Phone))
      return false;
    if (State == null) {
      if (other.State != null)
        return false;
    } else if (!State.equals(other.State))
      return false;
    if (Status == null) {
      if (other.Status != null)
        return false;
    } else if (!Status.equals(other.Status))
      return false;
    if (Street == null) {
      if (other.Street != null)
        return false;
    } else if (!Street.equals(other.Street))
      return false;
    if (active == null) {
      if (other.active != null)
        return false;
    } else if (!active.equals(other.active))
      return false;
    if (addressName == null) {
      if (other.addressName != null)
        return false;
    } else if (!addressName.equals(other.addressName))
      return false;
    if (attention == null) {
      if (other.attention != null)
        return false;
    } else if (!attention.equals(other.attention))
      return false;
    if (city == null) {
      if (other.city != null)
        return false;
    } else if (!city.equals(other.city))
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
    if (deleted == null) {
      if (other.deleted != null)
        return false;
    } else if (!deleted.equals(other.deleted))
      return false;
    if (firstName == null) {
      if (other.firstName != null)
        return false;
    } else if (!firstName.equals(other.firstName))
      return false;
    if (lastName == null) {
      if (other.lastName != null)
        return false;
    } else if (!lastName.equals(other.lastName))
      return false;
    if (postalCode == null) {
      if (other.postalCode != null)
        return false;
    } else if (!postalCode.equals(other.postalCode))
      return false;
    if (roles == null) {
      if (other.roles != null)
        return false;
    } else if (!roles.equals(other.roles))
      return false;
    if (timeZone == null) {
      if (other.timeZone != null)
        return false;
    } else if (!timeZone.equals(other.timeZone))
      return false;
    if (unitId == null) {
      if (other.unitId != null)
        return false;
    } else if (!unitId.equals(other.unitId))
      return false;
    if (userId == null) {
      if (other.userId != null)
        return false;
    } else if (!userId.equals(other.userId))
      return false;
    if (username == null) {
      if (other.username != null)
        return false;
    } else if (!username.equals(other.username))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", unitId=" + unitId + ", firstName=" + firstName + ", lastName=" + lastName + ", roles=" + roles
        + ", username=" + username + ", Status=" + Status + ", addressName=" + addressName + ", attention=" + attention + ", Street="
        + Street + ", city=" + city + ", State=" + State + ", postalCode=" + postalCode + ", Country=" + Country + ", Phone=" + Phone
        + ", userId=" + userId + ", timeZone=" + timeZone + ", decimalNotation=" + decimalNotation + ", dateFormat=" + dateFormat
        + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", active=" + active + ", deleted=" + deleted + "]";
  }

}
