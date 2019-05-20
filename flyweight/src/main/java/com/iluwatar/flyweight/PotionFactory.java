package com.iluwatar.flyweight;

import java.util.EnumMap;
import java.util.function.Function;
import java.util.function.Supplier;

public class PotionFactory {
	private final EnumMap<PotionType, Potion> potions = new EnumMap<>(PotionType.class);
	private final Function<PotionType, Potion> computer = PotionType::create;

	Potion createPotion(PotionType type) {
		return potions.computeIfAbsent(type, computer);
	}

	public static enum PotionType {
		HEALING(HealingPotion::new), INVISIBILITY(InvisibilityPotion::new), STRENGTH(StrengthPotion::new), HOLY_WATER(HolyWaterPotion::new), POISON(PoisonPotion::new);

		private Supplier<? extends Potion> creater;

		private PotionType(Supplier<? extends Potion> creater) {
			this.creater = creater;
		}

		private Potion create() {
			return creater.get();
		}

	}
}
