package org.example.specialtask.Model;

public class Subject {

	private String name;
	
	private Examination Examination;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Examination getTypeEximnation() {
		return Examination;
	}
	public void setTypeEximnation(Examination typeEximnation) {
		this.Examination = typeEximnation;
	}
}
