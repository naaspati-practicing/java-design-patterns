package com.iluwatar.interpreter;

import java.util.Objects;

public class MultiplyExpression implements Expression {
	private final Expression right;
	private final Expression left;

	public MultiplyExpression(Expression left, Expression right) {
		this.right = Objects.requireNonNull(right);
		this.left = Objects.requireNonNull(left);
	}

	@Override
	public int interpret() {
		return left.interpret() * right.interpret();
	}
	
	@Override
	public String toString() {
		return "*";
	}

}
