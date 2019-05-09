package com.iluwatar.abstractdocument.domain;

import java.util.Map;

import com.iluwatar.abstractdocument.AbstractDocument;
import com.iluwatar.abstractdocument.domain.Properties.HasModel;
import com.iluwatar.abstractdocument.domain.Properties.HasPrice;
import com.iluwatar.abstractdocument.domain.Properties.HasType;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice{
	public Part(Map<String, Object> properties) {
		super(properties);
	}
}
