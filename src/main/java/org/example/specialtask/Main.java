package org.example.specialtask;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Deanery dekanat=new Deanery();
		dekanat.createGroup("IT", "11-1", 2020);

		dekanat.createStudent("Misha", "dsa", "Asd", dekanat.groupRepository.getByNameAndNumber("IT", "11-1"));
		dekanat.createStudent("Sasha", "dsa", "Asd", dekanat.groupRepository.getByNameAndNumber("IT", "11-1"));
		dekanat.createStudent("Oleg", "dsa", "Asd", dekanat.groupRepository.getByNameAndNumber("IT", "11-1"));
		dekanat.createSubject("Math","Exam", LocalDate.now());
		dekanat.addSubjectToGroup(dekanat.groupRepository.getByNameAndNumber("IT", "11-1"), dekanat.subRepository.getAll().get(0));

		for(Object o: dekanat.studentRepository.getAll()) {
			System.out.println(o.toString());
		}

	}

}
