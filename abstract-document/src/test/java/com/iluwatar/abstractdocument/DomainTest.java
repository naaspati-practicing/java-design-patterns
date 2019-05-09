package com.iluwatar.abstractdocument;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.iluwatar.abstractdocument.domain.Car;
import com.iluwatar.abstractdocument.domain.Part;
import com.iluwatar.abstractdocument.domain.Properties.HasModel;
import com.iluwatar.abstractdocument.domain.Properties.HasParts;
import com.iluwatar.abstractdocument.domain.Properties.HasPrice;
import com.iluwatar.abstractdocument.domain.Properties.HasType;

public class DomainTest {

	  private static final String TEST_PART_TYPE = "test-part-type";
	  private static final String TEST_PART_MODEL = "test-part-model";
	  private static final long TEST_PART_PRICE = 0L;

	  private static final String TEST_CAR_MODEL = "test-car-model";
	  private static final long TEST_CAR_PRICE = 1L;
	  
	  @Test
	  public void checkProperties() {
		  assertSame("model", HasModel.PROPERTY);
		  assertSame("type",  HasType.PROPERTY);
		  assertSame("parts", HasParts.PROPERTY);
		  assertSame("price", HasPrice.PROPERTY);
	  }

	  @Test
	  public void shouldConstructPart() {
	    Map<String, Object> map = new HashMap<>();
	    map.put(HasType.PROPERTY, TEST_PART_TYPE);
	    map.put(HasModel.PROPERTY, TEST_PART_MODEL);
	    map.put(HasPrice.PROPERTY, TEST_PART_PRICE);
	    Part part = new Part(map);

	    assertSame(TEST_PART_TYPE, part.getType());
	    assertSame(TEST_PART_MODEL, part.getModel());
	    assertSame(TEST_PART_PRICE, part.getPrice());
	  }

	  @Test
	  public void shouldConstructCar() {
	    Map<String, Object> map = new HashMap<>();
	    map.put(HasModel.PROPERTY, TEST_CAR_MODEL);
	    map.put(HasPrice.PROPERTY, TEST_CAR_PRICE);
	    map.put(HasParts.PROPERTY, Arrays.asList(new HashMap<>(), new HashMap<>()));
	    Car car = new Car(map);

	    assertSame(TEST_CAR_MODEL, car.getModel());
	    assertSame(TEST_CAR_PRICE, car.getPrice());
	    assertEquals(2, car.getParts().count());
	  }
}
