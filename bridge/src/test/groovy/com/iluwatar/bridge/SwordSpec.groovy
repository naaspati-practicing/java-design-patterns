package com.iluwatar.bridge

import java.lang.reflect.Constructor

import spock.lang.Specification

class SwordSpec extends Specification {
	Sword sword
	Enchantment enchantment
	
	def setup() {
		sword = Spy(Sword, constructorArgs: [Mock(FlyingEnchantment)])
		enchantment = sword.enchantment
		
		assert sword.enchantment != null 
	}
	def 'test sword is swing working'() {
		when:
		sword.swing()
		
		then:
		1 * enchantment.apply()
	}
	
	def 'test sword is wield working'() {
		when: 
		sword.wield()
		
		then: 
		1 * enchantment.onActivate()
	}
	def 'test sword is unwield working'() {
		when:
		sword.unwield()
		
		then:
		1 * enchantment.onDeactivate()
	}
}