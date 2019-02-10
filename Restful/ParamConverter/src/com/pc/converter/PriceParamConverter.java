package com.pc.converter;

import javax.ws.rs.ext.ParamConverter;

import com.pc.dto.Price;

public class PriceParamConverter implements ParamConverter<Price> {

	@Override
	public Price fromString(String param) {
		Price price = null;
		String[] tokens = null;

		tokens = param.split(":");
		price = new Price();
		price.setCurrencyType(tokens[0]);
		price.setValue(Float.parseFloat(tokens[1]));
		return price;
	}

	@Override
	public String toString(Price price) {
		return price.getCurrencyType() + ":" + price.getValue();
	}

}
