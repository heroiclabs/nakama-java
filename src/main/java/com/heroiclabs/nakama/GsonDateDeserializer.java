/*
* Copyright 2020 Heroic Labs
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.heroiclabs.nakama;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/*
* A custom Date serializer to indicate to GSON that it is receiving UTC timestamps.
*/
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
			throw new JsonParseException("Could not deserialize Date.");
		}
	}
}
