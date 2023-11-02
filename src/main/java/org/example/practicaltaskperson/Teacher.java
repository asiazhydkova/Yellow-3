package org.example.practicaltaskperson;

public class Teacher extends Staff {
	static final String TYPE_PERSON = "Teacher";

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}

	@Override
	
	public void salary() {
		System.out.println("Calculating salary for " + TYPE_PERSON + " " + name);
	}
}