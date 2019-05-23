package com.iluwatar.interpreter

class MultiplyExpressionSpec extends ExpressionSpec {
	
	def 'check MinusExpression'() {
		given: 
		def expression = new MultiplyExpression(new IntExpression(left), new IntExpression(right))
		
		when:
		def result = expression.interpret()
		
		then: 
		result == left * right
		
		where: 
		[left, right] << data()
	}
}
