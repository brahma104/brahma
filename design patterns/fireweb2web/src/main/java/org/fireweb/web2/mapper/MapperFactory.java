package org.fireweb.web2.mapper;

public class MapperFactory {
	public static Mapper<?> createMapper(String transport) {
		Mapper<?> mapper = null;

		if (transport.equals("http")) {
			mapper = new HttpMapper();
		}
		return mapper;
	}
}
