package org.example.lab_02.homework_02;

public class SalariedEmployee extends Employee {
    String socialSecurityNumber;
    double hourlyRate;
    double hoursWorked;

    public SalariedEmployee(String name, String socialSecurityNumber, double hourlyRate, double hoursWorked) {
        super(name);

        if (socialSecurityNumber.isBlank() || socialSecurityNumber.isEmpty()) throw new IllegalArgumentException();
        if (hourlyRate < 0 || hoursWorked < 0) throw new IllegalArgumentException();

        setSocialSecurityNumber(socialSecurityNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public SalariedEmployee(String name, String socialSecurityNumber, double hourlyRate) {
        this(name, socialSecurityNumber, hourlyRate, 0);
    }

    public SalariedEmployee(String name, String socialSecurityNumber) {
        this(name, socialSecurityNumber, 0, 0);
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) throws IllegalArgumentException {
        if (Validator.isTrueSSN(socialSecurityNumber)) {
            this.socialSecurityNumber = socialSecurityNumber;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee {" +
                "employeeld = " + employeeld +
                ", name = '" + name + "'," + " average monthly wage : " + calculatePay() +
                "}";
    }
}
