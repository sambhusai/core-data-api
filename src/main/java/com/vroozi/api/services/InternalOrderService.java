package com.vroozi.api.services;

import java.util.List;

import com.vroozi.api.model.InternalOrder;

public interface InternalOrderService extends MasterDataService<InternalOrder, String> {

  List<InternalOrder> findAllByUnitId(String unitId);
}
