package com.iluwatar.abstractdocument.domain;

import java.util.Map;

import com.iluwatar.abstractdocument.AbstractDocument;
import com.iluwatar.abstractdocument.domain.Properties.HasModel;
import com.iluwatar.abstractdocument.domain.Properties.HasParts;
import com.iluwatar.abstractdocument.domain.Properties.HasPrice;
import com.iluwatar.abstractdocument.domain.Properties.HasType;

public class Car extends AbstractDocument implements HasType, HasModel, HasPrice, HasParts {
	public Car(Map<String, Object> properties) {
		super(properties);
	}
}
