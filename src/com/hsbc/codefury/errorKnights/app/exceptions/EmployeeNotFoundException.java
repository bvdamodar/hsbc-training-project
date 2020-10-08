package com.hsbc.codefury.errorKnights.app.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
	@Override
	public String toString() {
		return "EmployeeNotFoundException";
	}
}
