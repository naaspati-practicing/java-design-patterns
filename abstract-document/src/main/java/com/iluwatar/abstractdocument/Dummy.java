package com.iluwatar.abstractdocument;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iluwatar.abstractdocument.domain.Car;
import com.iluwatar.abstractdocument.domain.Properties.HasModel;
import com.iluwatar.abstractdocument.domain.Properties.HasParts;
import com.iluwatar.abstractdocument.domain.Properties.HasPrice;
import com.iluwatar.abstractdocument.domain.Properties.HasType;

public class Dummy {
	private static final Logger logger = LoggerFactory.getLogger(Dummy.class);

	public Car createDummyCar() {
		logger.debug("Constructing parts and car");

		Map<String, Object> wheelProperties = map(
				HasType.PROPERTY, "wheel",
				HasModel.PROPERTY, "15C", 
				HasPrice.PROPERTY, 100L
				);

		Map<String, Object> doorProperties = map(
				HasType.PROPERTY, "door",
				HasModel.PROPERTY, "Lambo", 
				HasPrice.PROPERTY, 300L
				);

		Map<String, Object> carProperties = map(
				HasModel.PROPERTY, "300SL",
				HasPrice.PROPERTY, 10000L,
				HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties)
				);

		Car car = new Car(carProperties);

		if(logger.isDebugEnabled()) {
			StringBuilder sb = new StringBuilder();
			sb.append("\nCar Description: ")
			.append("\n  model: ").append(car.getModel())
			.append("\n  price: ").append(car.getPrice())
			.append("\n  parts: ");
			car.getParts()
			.forEach(p -> sb.append("\n    ").append(p));
			
			logger.debug(sb.toString());
		}
		return car;
	}

	private Map<String, Object> map(Object...key_value_pairs) {
		if(key_value_pairs.length%2 != 0)
			throw new IllegalArgumentException();

		Map<String, Object> map = new HashMap<>();
		int n = 0;
		while(n < key_value_pairs.length) 
			map.put((String)key_value_pairs[n++], key_value_pairs[n++]);

		return map;
	}
}
