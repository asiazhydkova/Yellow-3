package org.example.specialtask.model;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
	private static  int idCounter=1;
	private int id;

	private List<Subject> subjects;
	
	
	public GradeBook(){
		GradeBookAdd();
		subjects=new ArrayList<>();
	}
	public GradeBook(List<Subject> sub){
		GradeBookAdd();
		subjects=new ArrayList<>();
		setSubjects(sub);

	}
	public void GradeBookAdd() {
		this.id = idCounter;
        idCounter++; 
	}
	public void GradeBookRemoved() {
        idCounter--;
		this.id = idCounter;
	}
	@Override
	public String toString() {
		return "GradeBook [id=" + id + ", subjects=" + subjects + "]";
	}
	public int getId() {
		return id;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
