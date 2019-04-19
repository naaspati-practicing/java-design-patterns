package com.iluwatar.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {
	void put(String key, Object value);
	Object get(String key);
	
	/**
	 * Gets the stream of child documents
	 * @param key
	 * @param constructor constructor of child class
	 * @return child documents
	 */
	<T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);

}
