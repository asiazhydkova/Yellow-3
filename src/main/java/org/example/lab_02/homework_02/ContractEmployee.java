package org.example.lab_02.homework_02;

public class ContractEmployee extends Employee {
    String federalTaxIdMember;
    double monthlyPayment;

    public ContractEmployee(String name, String federalTaxIdMember, double monthlyPayment) {
        super(name);
        setFederalTaxIdMember(federalTaxIdMember);
        this.monthlyPayment = monthlyPayment;
    }

    public ContractEmployee(String name, String federalTaxIdMember) {
        this(name, federalTaxIdMember, 0);
    }

    @Override
    public double calculatePay() {
        return monthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) throws IllegalArgumentException {
        if (Validator.isTrueEIN(federalTaxIdMember)) {
            this.federalTaxIdMember = federalTaxIdMember;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee {" +
                "employeeld = " + employeeld +
                ", name = '" + name + "'," + " average monthly wage : " + calculatePay() +
                "}";
    }

}
