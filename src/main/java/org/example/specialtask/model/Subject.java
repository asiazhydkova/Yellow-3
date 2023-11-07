package org.example.specialtask.model;

public class Subject {

	private String name;
	
	private Examination Examination;
	
	public Subject(String name) {
		setName(name);
	}
	public Subject(String name, Examination ex) {
		setName(name);
		setTypeExamination(ex);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Examination getTypeEximnation() {
		return Examination;
	}



	public void setTypeExamination(Examination typeEximnation) {
		this.Examination = typeEximnation;
	}
	@Override
	public String toString() {
		return "Subject{" +
				"name='" + name + '\'' +
				", Examination=" + Examination +
				'}';
	}
}
