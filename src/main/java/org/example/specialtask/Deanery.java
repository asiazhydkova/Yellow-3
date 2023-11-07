package org.example.specialtask;

import org.example.specialtask.model.*;

import java.time.LocalDate;
import java.util.List;

import org.example.specialtask.repository.GradeBookRepository;
import org.example.specialtask.repository.GroupRepository;
import org.example.specialtask.repository.StudentRepository;
import org.example.specialtask.repository.SubjectRepository;

public class Deanery {
	StudentRepository studentRepository;
	GroupRepository groupRepository;
	SubjectRepository subRepository;
	GradeBookRepository grRepository;
	
	public Deanery() {
		studentRepository=new StudentRepository();
		groupRepository=new GroupRepository();
		subRepository=new SubjectRepository();
		grRepository=new GradeBookRepository();
		
	}
	 public void createGroup(String name, String number, int yearOfCreation) {
	    	Group g=new Group(name,number,yearOfCreation);
	    	groupRepository.add(g);
	    }
	 public void createStudent(String firstName, String secondName, String lastName, Group group) {
		 	GradeBook gb = createGradeBook();
	    	Student st = new Student(firstName,secondName,lastName,group,gb);
	    	studentRepository.add(st);
	    }
	 public  void  createSubject(String name, String type, LocalDate date) {
		 Subject sub=new Subject(name,new Examination(type, date));
		 subRepository.add(sub);
	 }

	 public GradeBook createGradeBook() {
		 GradeBook gb=new GradeBook();
		 grRepository.add(gb);
		return gb;
	 }
	 public void deleteStudent(Student st) {
		 studentRepository.delete(st);
	 }
	 public void deleteGroup(Group gr) {

		 for(Student st:studentRepository.getAll()) {
			 if(st.getGroup().equals(gr)) {
				 st.setGroup(null);
				 groupRepository.delete(gr);
			 }
		 }

	 }
	 public void deleteSubject(Subject sub) {
		 subRepository.delete(sub);
	 }
	 public void deleteGradeBook(Student st) {
		 grRepository.delete(st.getGradeBook());
		 st.setGradeBook(null);

	 }
	 public void setListExamenToGroup(Group gr, List<Subject> examList) {
		 for(Student st:studentRepository.getAll()) {
			 if(st.getGroup().equals(gr)) {
				 st.getGradeBook().setSubjects(examList);
			 }
		 }
	 }
	 public void addSubjectToGroup(Group gr, Subject sb) {
		 for(Student st:studentRepository.getAll()) {
			 if(st.getGroup().equals(gr)) {
				 st.getGradeBook().getSubjects().add(sb);
			 }
		 }
	 }
	 public void setSubjectStudent(Student st, Subject sb) {

		 for(Student student:studentRepository.getAll()) {
			 if(student.getGradeBook().getId()==st.getGradeBook().getId()) {
				 student.getGradeBook().getSubjects().add(sb);
			 }
		 }

	 }
	 public void setGrade (Student student, Subject subject,int grade){
		 for (Student st : studentRepository.getAll()) {

			 if(st.getGradeBook().getId()==student.getGradeBook().getId()){
				 for (Subject s : student.getGradeBook().getSubjects()) {
					 if (s.getName().equals(subject.getName())) {
						 subject.getTypeEximnation().setActualDate(LocalDate.now());
						 Exam  a = (Exam) subject.getTypeEximnation().getType();
						 a.setGrade(grade);
						 return;
					 }
				 }
			 }
		 }
	 }




}
