package com.iluwatar.decorator

import spock.lang.Specification
import uk.org.lidalia.slf4jtest.TestLogger

class ClubbedTrollSpec extends Specification {
	ClubbedTroll troll;
	SimpleTroll simpleTroll;
	
	def setup() {
		simpleTroll = Spy(SimpleTroll)
		troll = new ClubbedTroll(simpleTroll);
	}
	
	def 'attack power must be 20' () {
		when:
		int power = troll.attackPower 
		
		then:
		power == 20
		1 * simpleTroll.attackPower
	}
	
	def 'check attack is called of decorated' () {
		when: 'attack of decorator is called'
		troll.attack()
		
		then: 'attack of decorated is called'
		1 * simpleTroll.attack()
	}
	
	def 'check fleeBattle is called of decorated' () {
		when: 'fleeBattle of decorator is called'
		troll.fleeBattle()
		
		then: 'fleeBattle of decorated is called'
		1 * simpleTroll.fleeBattle()
	}
}
