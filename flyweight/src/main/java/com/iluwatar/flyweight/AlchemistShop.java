package com.iluwatar.flyweight;

import static com.iluwatar.flyweight.PotionFactory.PotionType.HEALING;
import static com.iluwatar.flyweight.PotionFactory.PotionType.HOLY_WATER;
import static com.iluwatar.flyweight.PotionFactory.PotionType.INVISIBILITY;
import static com.iluwatar.flyweight.PotionFactory.PotionType.POISON;
import static com.iluwatar.flyweight.PotionFactory.PotionType.STRENGTH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import com.iluwatar.flyweight.PotionFactory.PotionType;

public class AlchemistShop {
	private final List<Potion> topShelf;
	private final List<Potion> bottomShelf;
	
	public AlchemistShop() {
	    topShelf = new ArrayList<>();
	    bottomShelf = new ArrayList<>();
	    fillShelves();
	  }

	private void fillShelves() {
		PotionFactory factory = new PotionFactory();
		
		add(topShelf, factory, 
				INVISIBILITY,
			    INVISIBILITY,
			    STRENGTH,
			    HEALING,
			    INVISIBILITY,
			    STRENGTH,
			    HEALING,
			    HEALING);
		
		add(bottomShelf, factory,
				POISON,
			    POISON,
			    POISON,
			    HOLY_WATER,
			    HOLY_WATER
				);
	}

	private void add(List<Potion> sink, PotionFactory factory, PotionType...types) {
		for (PotionType p : types) 
			sink.add(factory.createPotion(p));
	}
	
	public List<Potion> getBottomShelf() {
		return Collections.unmodifiableList(bottomShelf);
	}
	public List<Potion> getTopShelf() {
		return Collections.unmodifiableList(topShelf);
	}
	public void forEachTopShelf(Consumer<Potion> action) {
		topShelf.forEach(action);
	}
	public void forEachBottomShelf(Consumer<Potion> action) {
		bottomShelf.forEach(action);
	}
}
