package com.iluwatar.abstractdocument;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class AbstractDocument implements Document {
	private final Map<String, Object> properties;

	public AbstractDocument(Map<String, Object> properties) {
		this.properties = Objects.requireNonNull(properties, "properties map is required");
	}

	@Override
	public void put(String key, Object value) {
		properties.put(key, value);
	}

	@Override
	public Object get(String key) {
		return properties.get(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
		List<Map<String, Object>> doc = (List<Map<String, Object>>) get(key);
		
		if(doc == null)
			return Stream.empty();
		else 
			return doc.stream().map(constructor);
	}
	
	@Override
	public String toString() {
		return properties.toString();
	}
}
