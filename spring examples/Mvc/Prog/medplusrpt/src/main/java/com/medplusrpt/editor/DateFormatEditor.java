package com.medplusrpt.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			super.setValue(sdf.parse(text));
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
	}

}
