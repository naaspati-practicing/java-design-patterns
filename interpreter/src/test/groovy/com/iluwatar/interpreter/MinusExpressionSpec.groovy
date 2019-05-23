package com.iluwatar.interpreter

class MinusExpressionSpec extends ExpressionSpec {
	
	def 'check MinusExpression'() {
		given: 
		def expression = new MinusExpression(new IntExpression(left), new IntExpression(right))
		
		when:
		def result = expression.interpret()
		
		then: 
		result == left - right
		
		where: 
		[left, right] << data()
	}
}
