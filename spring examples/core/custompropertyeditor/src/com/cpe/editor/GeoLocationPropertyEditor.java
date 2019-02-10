package com.cpe.editor;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.GeoLocation;

public class GeoLocationPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] splits = null;
		GeoLocation geoLocation = null;

		splits = text.split(":");
		int xCoordinate = Integer.parseInt(splits[0]);
		int yCoordinate = Integer.parseInt(splits[1]);
		geoLocation = new GeoLocation(xCoordinate, yCoordinate);
		setValue(geoLocation);
	}
}
