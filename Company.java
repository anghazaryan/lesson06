public class Company {

	private String companyName;
	private double moneyInBank;
	private Employee[] employees;

	public String getCompanyName(){
		return companyName;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	public double getMoneyInBank(){
		return moneyInBank;
	}	
	public void setMoneyInBank(double moneyInBank){
		this.moneyInBank = moneyInBank;
	}	
	public Employee[] getEmployees(){
		return employees;
	}
	public void setEmployees(Employee[] employees){
		this.employees = employees;
	}	

public double calculateBalance() {
    double sum = 0;
    for (Employee employee : employees) {
        sum += employee.getSalary();
     }
    
    return sum;
} 

}