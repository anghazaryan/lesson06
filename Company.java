public class Company {

// Create a Employee class with salary and years of experience
// Create a Company class with Name, moneyInBank and employees
// Create employees 
// Create company and assign the created employees to the company
// Write a method, to calculate whether Company can afford employees

	// պետք ա ունենանք company ու employee class եր, 
	// հետո ստեղծենք կոնկրետ մի հատ company ու մի քանի հատ employee ներից կազմված array, 
	// հետո էդ կոնկրետ company -ում պետք ա հաշվենք իրա բանկի փողը հերիք ա, 
	// էդ array մեջի աշխատողների աշխատավարձը տալու համար թե չէ


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