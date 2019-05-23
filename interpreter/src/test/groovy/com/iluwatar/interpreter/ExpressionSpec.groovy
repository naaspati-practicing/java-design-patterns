package com.iluwatar.interpreter

import spock.lang.Specification

class ExpressionSpec extends Specification {

	List data() {
		def list = []
		
		for(k in -10..10) 
			for(m in -10..10) 
				list.add([k,m])
		
		return list
	}
}
