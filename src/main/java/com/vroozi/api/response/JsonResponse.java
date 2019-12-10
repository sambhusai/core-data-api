package com.vroozi.api.response;


public class JsonResponse<T> {

  private Status status = new Status();
  private T object;

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }
}
