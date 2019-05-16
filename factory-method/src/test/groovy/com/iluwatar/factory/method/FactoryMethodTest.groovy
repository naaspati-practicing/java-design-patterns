package com.iluwatar.factory.method

import spock.lang.Specification

class FactoryMethodTest extends Specification {
	
	def 'test OrcBlackSmith' () {
		given: 'a orc blacksmith' 
		def b = new OrcBlacksmith()
		def w = b.create(type)
		
		expect: 'create a OrcWeapon of given type'
		w instanceof OrcWeapon
		type == w.getType()
		
		where: 'type is from WeaponTypeArray'
		type << WeaponType.values()
	}
	
	def 'test ElfBlackSmith' () {
		given: 'a elf blacksmith'
		def b = new ElfBlacksmith()
		def w = b.create(type)
		
		expect: 'create a ElfWeapon of given type'
		w instanceof ElfWeapon
		type == w.getType()
		
		where: 'type is from WeaponType Array'
		type << WeaponType.values()
	}
}
