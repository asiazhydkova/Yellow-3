package  org.example.homeworktaskemployee;

public class ContractEmployee extends Employee implements Payable {
	double hourlyRate;
	double workedHours;
    String federalTaxIdNumber;

    public ContractEmployee(String employeeId, String name,  String federalTaxIdNumber, double hourlyRate, double workedHourse) {
        super(name, employeeId);
        this.federalTaxIdNumber = federalTaxIdNumber;
        this.hourlyRate=hourlyRate;
        this.workedHours=workedHourse;
    }

	@Override
	public double calculatePay() {
		 return hourlyRate * workedHours;
	}
}