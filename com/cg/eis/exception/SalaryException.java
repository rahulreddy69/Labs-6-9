package com.cg.eis.exception;

public class SalaryException extends Exception {
	int salary;

	public SalaryException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SalaryException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SalaryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SalaryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public SalaryException(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryException: Check salary input, [salary=" + salary + "]";
	}
	

}
