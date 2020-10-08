package com.hsbc.codefury.errorKnights.app.exceptions;

public class CustomerLoginFailedException extends RuntimeException {
	@Override
	public String toString() {
		return "CustomerLoginFailedException";
	}
}
