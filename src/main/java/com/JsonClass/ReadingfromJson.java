package com.JsonClass;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class ReadingfromJson
{
    public String  read(String attribute) throws Exception {
        JsonParser jsonParser = new JsonParser();
        FileReader reader = new FileReader(System.getProperty("C:\\Users\\Kavya reddy\\CucumberTask\\src\\TestDataFromJson\\TestData.json"));
        Object obj = jsonParser.parse(reader);
        JsonObject jsonObject = (JsonObject) obj;
        String value = jsonObject.get(attribute).getAsString();
        return value;
    }
}
