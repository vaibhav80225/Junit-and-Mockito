package com.wcisw.junit;

public class GreetingImp implements Greeting {

	@Override
	public String greet(String name) {

		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "hello " + name;
	}

}
