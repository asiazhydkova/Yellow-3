package org.example.specialtask.Model;


public class Group {
	private String name;
	private String number;
	private int yearOfCreation;

	public Group(String groupName, String groupNumber, int yearOfCreation) {
		setName(groupName);
		setNumber(groupNumber);
		setYearOfCreation(yearOfCreation);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
}
