package com.pc.converter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.pc.dto.Price;

@Provider
public class CustomParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> classType, Type rawType, Annotation[] annotations) {
		ParamConverter paramConverter = null;
		System.out.println("ClassType : " + classType.getSimpleName());
		System.out.println("RawType : " + rawType.getTypeName());
		System.out.println("annotations : ");
		for (Annotation annotation : annotations) {
			System.out.println(annotation.annotationType().getName());
		}

		if (classType.isAssignableFrom(Price.class)) {
			paramConverter = new PriceParamConverter();
		}

		return paramConverter;
	}

}
