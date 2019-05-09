package com.iluwatar.abstractdocument.domain;

import java.util.stream.Stream;

import com.iluwatar.abstractdocument.Document;

public interface Properties {

	public static interface HasModel extends Document {
		String PROPERTY = "model";

		default String getModel() {
			return (String) get(PROPERTY);
		}
	}

	public interface HasPrice extends Document {
		String PROPERTY = "price";

		default Number getPrice() {
			return (Number) get(PROPERTY);
		}
	}

	public interface HasParts extends Document {

		String PROPERTY = "parts";

		default Stream<Part> getParts() {
			return children(PROPERTY, Part::new);
		}
	}
	public interface HasType extends Document {
		String PROPERTY = "type";

		default String getType() {
			return (String) get(PROPERTY);
		}
	}


}
