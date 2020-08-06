package com.heroiclabs.nakama;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class GsonDateDeserializer implements JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
		String date = element.getAsString();
		SimpleDateFormat formatter = new SimpleDateFormat("y-M-d'T'H:m:s'Z'");
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

		try {
			return formatter.parse(date);
		}
		catch (ParseException e) {
			throw new JsonParseException("Could not deserialize DateTime.");
		}
	}
}
