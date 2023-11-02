package org.example.lab_02.homework_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeArray= new ArrayList<>();
        employeeArray.add(new SalariedEmployee("Konovales Sasha", "564-56-1505",6000,12));
        employeeArray.add(new ContractEmployee("Shevchenko Petro", "44-9625585", 2000));
        employeeArray.add(new SalariedEmployee("Melnuk Oleksa", "864-56-1905",3000,5));
        employeeArray.add(new ContractEmployee("Harchenko Oleg", "87-2325445", 4000));
        employeeArray.add(new ContractEmployee("Sereda Ivan", "96-7665481", 3000));
        employeeArray.add(new SalariedEmployee("Loboda Evgen", "782-56-1305",5000,2));
        employeeArray.add(new SalariedEmployee("Roman", "667-82-1555"));

        //Add salary information
        ((SalariedEmployee) employeeArray.get(6)).setHourlyRate(2351.0);
        ((SalariedEmployee) employeeArray.get(6)).setHoursWorked(6.0);

        //Before sorting
        System.out.println("--------------Before sorting----------------");
        for (Employee e:employeeArray) {
            System.out.print(e + " -> ");
            if (e instanceof SalariedEmployee){
                System.out.println("SSN : " + ((SalariedEmployee) e).socialSecurityNumber);
            }
            if (e instanceof ContractEmployee){
                System.out.println("EIN : " + ((ContractEmployee) e).federalTaxIdMember);
            }
        }

        employeeArray.sort((o1, o2) -> Double.compare(o2.calculatePay(), o1.calculatePay()));

        //After sorting
        System.out.println("--------------After sorting----------------");
        for (Employee e:employeeArray) {
            System.out.println(e);
        }
    }
}

