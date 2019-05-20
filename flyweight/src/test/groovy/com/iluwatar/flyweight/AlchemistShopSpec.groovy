package com.iluwatar.flyweight

import static org.junit.Assert.*

import org.junit.Test

import spock.lang.Specification

class AlchemistShopSpec extends Specification {
	
	def 'base test'() {
		given: 
		def shop = new AlchemistShop()
		def top = shop.topShelf
		def bottom = shop.bottomShelf
		
		and:
		def all = top + bottom
		def distinct = Collections.newSetFromMap(new IdentityHashMap())
		distinct.addAll(all)
		
		expect:
		top != null
		bottom != null
		
		5 == bottom.size()
		8 == top.size()
		
		13 ==  all.size()
		5 == distinct.size()
	}
}
