package org.example.practicaltaskperson;

public class Main {

	public static void main(String[] args) {
		Person[] people = new Person[6];
		people[0] = new Teacher("John");
		people[1] = new Cleaner("Alice");
		people[2] = new Student("Bob");
		people[3] = new Teacher("Eva");
		people[4] = new Cleaner("Mike");
		people[5] = new Student("Sophia");

		for (Person person : people) {
			person.print();
		}

		for (Person person : people) {
				if (person instanceof Teacher) {
					Teacher new_name = (Teacher) person;
					new_name.salary();
				}
				else if(person instanceof Cleaner) {
					Cleaner newvariable=(Cleaner)person;
					newvariable.salary();
				}
				
				System.out.println();
		}

	}

}
