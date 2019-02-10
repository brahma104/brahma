package com.json.parsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class JSonParsingTest {
	public static void main(String[] args) throws FileNotFoundException {
		JsonReader jSonReader = Json.createReader(new FileInputStream(
				new File("D:\\work\\master\\webservices\\20180125\\Restful\\JSon\\resource\\person.json")));
		JsonObject personObject = jSonReader.readObject();
		String name = personObject.getString("name");
		System.out.println("name : " + name);
		
		JsonObject addressObject = personObject.getJsonObject("address");
		String addressLine1 = addressObject.getString("addressLine1");
		System.out.println("addressLine1 : " + addressLine1);

	}
}
















