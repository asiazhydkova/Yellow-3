package  org.example.homeworktaskemployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		

        employees.add(new SalariedEmployee("1", "John", "123456789", 5000.0));
        employees.add(new ContractEmployee("2", "Alice","", 20.0, 160.0));
        employees.add(new ContractEmployee("3", "Bob"," ", 15.0,  180.0));
        employees.add(new SalariedEmployee("4", "Eva", "987654321", 10000.0));

        Collections.sort(employees, Comparator.comparingDouble(employee -> ((Payable) employee).calculatePay()).reversed());

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Name: " + employee.name);
            System.out.println("Average Monthly Wage: $" + ((Payable) employee).calculatePay());
            System.out.println();
        }

	}

}
