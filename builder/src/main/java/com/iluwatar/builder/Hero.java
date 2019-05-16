package com.iluwatar.builder;

public class Hero {
	public static class Builder {
		private Profession profession;
		private String name;
		private HairType hairType;
		private HairColor hairColor;
		private Armor armor;
		private Weapon weapon;
		
		private Builder() { }

		public Builder profession(Profession profession) { this.profession = profession; return this;}
		public Builder name(String name) { this.name = name; return this;}
		public Builder hairType(HairType hairType) { this.hairType = hairType; return this;}
		public Builder hairColor(HairColor hairColor) { this.hairColor = hairColor; return this;}
		public Builder armor(Armor armor) { this.armor = armor; return this;}
		public Builder weapon(Weapon weapon) { this.weapon = weapon; return this;}
		
		public Hero build() {
			return new Hero(this);
		}
	}
	
	public static Builder builder() {
		return new Builder();
	}

	private final Profession profession;
	private final String name;
	private final HairType hairType;
	private final HairColor hairColor;
	private final Armor armor;
	private final Weapon weapon;

	private Hero(Builder builder) {
		this.profession = builder.profession;
		this.name = builder.name;
		this.hairType = builder.hairType;
		this.hairColor = builder.hairColor;
		this.armor = builder.armor;
		this.weapon = builder.weapon;
	}
	public Profession getProfession() {
		return profession;
	}
	public String getName() {
		return name;
	}
	public HairType getHairType() {
		return hairType;
	}
	public HairColor getHairColor() {
		return hairColor;
	}
	public Armor getArmor() {
		return armor;
	}
	public Weapon getWeapon() {
		return weapon;
	}

}
