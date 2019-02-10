package com.cpe.registrar;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.beans.GeoLocation;
import com.cpe.editor.GeoLocationPropertyEditor;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(GeoLocation.class, new GeoLocationPropertyEditor());
	}

}
