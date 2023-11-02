package  org.example.homeworktaskemployee;

public class SalariedEmployee extends Employee implements Payable {
    String socialSecurityNumber;
    double fixedMonthlyPayment;
    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(name, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment=fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
    	return fixedMonthlyPayment;
    }
}
