package com.iluwatar.builder;

import spock.lang.Specification

class HeroTest extends Specification {
	def 'check if builder is working as expected' () {
		given: 'An Hero object created using builder'
		def heroName = "Sir Lancelot"
		
		Hero hero = Hero.builder()
		.profession(Profession.WARRIOR)
		.name(heroName)
		.armor(Armor.CHAIN_MAIL)
		.weapon(Weapon.SWORD)
		.hairType(HairType.LONG_CURLY)
		.hairColor(HairColor.BLOND)
		.build();
		
		expect: 'check if builder passes values properly'
		hero
		with(hero) { 
			profession == Profession.WARRIOR
			name == heroName
			armor == Armor.CHAIN_MAIL
			weapon == Weapon.SWORD
			hairColor == HairColor.BLOND
			hairType == HairType.LONG_CURLY
		}
		
	}

}