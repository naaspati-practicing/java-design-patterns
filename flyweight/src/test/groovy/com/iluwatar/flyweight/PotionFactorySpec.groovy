package com.iluwatar.flyweight


import static com.iluwatar.flyweight.PotionFactory.PotionType.*
import spock.lang.Specification

class PotionFactorySpec extends Specification {

	def 'check valid type returned by PotionType'() {
		given: 
		def fac = new PotionFactory()
		def instance = fac.createPotion(p) 
		
		expect: 
		instance.class == expectedClass
		instance.class.simpleName.toLowerCase() - 'potion' == p.toString().toLowerCase() - '_' 
		
		where:
		p             | expectedClass
		HEALING       | HealingPotion
		INVISIBILITY  | InvisibilityPotion
		STRENGTH      | StrengthPotion
		HOLY_WATER    | HolyWaterPotion
		POISON        | PoisonPotion 
	}
	

}
