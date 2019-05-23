package com.iluwatar.interpreter;

public class IntExpression implements Expression {
	private int n;
	

	public IntExpression(int n) {
		this.n = n;
	}

	@Override
	public int interpret() {
		return n;
	}
	
	@Override
	public String toString() {
		return "int("+n+")";
	}

}
