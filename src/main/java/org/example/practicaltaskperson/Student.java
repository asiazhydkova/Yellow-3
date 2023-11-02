package org.example.practicaltaskperson;

public class Student extends Person {
	static final String TYPE_PERSON = "Student";

	public Student(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}
}