package com.edu.spring;

public class Ant {

	private String firstName;
	private String lastName;
	private String c;

	Ant() {

	}

	Ant(String a, String b) {
		firstName = a;
		lastName = b;
	}

	Ant(String a, String b, String c) {
		firstName = a;
		lastName = b;
		this.c = c;
	}

	public String display() {
		return firstName + lastName +c;
	}

}
