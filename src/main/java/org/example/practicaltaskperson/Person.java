package org.example.practicaltaskperson;

public abstract class Person {
	String name;
	static final String TYPE_PERSON = "Person";

	public Person(String name) {
		this.name = name;
		System.out.println("Creating a " + TYPE_PERSON + " named " + name);
	}

	public abstract void print();
}