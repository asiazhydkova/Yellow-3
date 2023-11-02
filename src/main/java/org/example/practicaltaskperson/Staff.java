package org.example.practicaltaskperson;

public class Staff extends Person {
	static final String TYPE_PERSON = "Staff";

	public Staff(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}
	public void salary() {
		
	}
}