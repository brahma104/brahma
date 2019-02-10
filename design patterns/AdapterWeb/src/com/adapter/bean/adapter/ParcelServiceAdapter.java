package com.adapter.bean.adapter;

import java.text.SimpleDateFormat;

import com.adapter.bean.ParcelService;
import com.adapter.businessobject.Address;
import com.adapter.businessobject.ParcelBo;
import com.adapter.businessobject.ReceiptBo;
import com.adapter.valueobject.ParcelVo;
import com.adapter.valueobject.ReceiptVo;

public class ParcelServiceAdapter {
	public ReceiptVo newParcel(ParcelVo vo) {
		ParcelService parcelService = null;
		ReceiptBo receiptBo = null;
		ReceiptVo receiptVo = null;
		ParcelBo bo = null;

		bo = new ParcelBo();
		bo.setFrom(mapAddressVo(vo.getFrom()));
		bo.setTo(mapAddressVo(vo.getTo()));
		bo.setShippmentType(vo.getShippmentType());
		bo.setWeight(Float.parseFloat(vo.getWeight()));

		parcelService = new ParcelService();
		receiptBo = parcelService.newParcel(bo);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		receiptVo = new ReceiptVo(receiptBo.getAwbNo(), String.valueOf(receiptBo.getAmount()),
				sdf.format(receiptBo.getEstimatedDateOfDelivery()));
		return receiptVo;
	}

	private Address mapAddressVo(com.adapter.valueobject.Address addressVo) {
		Address addressBo = null;

		addressBo = new Address(addressVo.getStreetAddress(), addressVo.getCity(), addressVo.getState(),
				Integer.parseInt(addressVo.getZip()), addressVo.getCountry());
		return addressBo;
	}
}
