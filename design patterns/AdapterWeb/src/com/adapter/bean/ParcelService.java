package com.adapter.bean;

import java.util.Date;
import java.util.UUID;

import com.adapter.businessobject.ParcelBo;
import com.adapter.businessobject.ReceiptBo;

public class ParcelService {

	public ReceiptBo newParcel(ParcelBo parcel) {
		ReceiptBo bo = null;

		bo = new ReceiptBo();
		bo.setAwbNo(UUID.randomUUID().toString());
		bo.setAmount(398);
		bo.setEstimatedDateOfDelivery(new Date());

		return bo;
	}
}
