package com.json.streaming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class JSonStreamingTest {
	public static void main(String[] args) throws FileNotFoundException {
		JsonParser jsonParser = Json.createParser(new FileInputStream(
				new File("D:\\work\\master\\webservices\\20180125\\Restful\\JSon\\resource\\person.json")));
		
		while(jsonParser.hasNext()) {
			Event event = jsonParser.next();
			switch(event.name()) {
			case "KEY_NAME":
				System.out.print(jsonParser.getString() + " : ");
				break;
			case "VALUE_STRING":
				System.out.println(jsonParser.getString());
				break;
			}
		}
		
	}
}























