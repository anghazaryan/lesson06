
public class Main {
public static void main (String[] args){

	Computer device = new Computer();
    device.setPrice(500.50);
    device.setBrand("Apple");
    device.setMemorySize(10);

    Employee employee = new Employee();
    employee.setYearsOfExperience(5);
    employee.setSalary(1904.99);

    Rectangle rectangleSurface = new Rectangle();
    rectangleSurface.setHeight(5);
    rectangleSurface.setWidth(5);
    rectangleSurface.calculateRectangleSurface();

    Rectangle newRectangle = new Rectangle();
    newRectangle.setHeight(2);
    newRectangle.setWidth(15);
    newRectangle.calculateRectangleSurface();

    System.out.println(device.getPrice());
    System.out.println(device.getBrand()); 
    System.out.println(device.getMemorySize());    
    System.out.println(employee.getYearsOfExperience());
    System.out.println(employee.getSalary());
    System.out.println("First Rectangle Surface: " + rectangleSurface.calculateRectangleSurface());
    System.out.println("Second Recangle Surface: " + newRectangle.calculateRectangleSurface());


    Employee[] employees = new Employee[3];

    Employee employee1 = new Employee();
    employee1.setYearsOfExperience(5);
    employee1.setSalary(5600.23);
    employees[0] = employee1;

    Employee employee2 = new Employee();
    employee2.setYearsOfExperience(5);
    employee2.setSalary(9600.99);
    employees[1] = employee2;

    Employee employee3 = new Employee();
    employee3.setYearsOfExperience(5);
    employee3.setSalary(4890.99);
    employees[2] = employee3;
    

    Company company = new Company();
    company.setCompanyName("AirBnb");
    company.setMoneyInBank(1500);
    company.setEmployees(employees);

 
 if (company.calculateBalance() <= company.getMoneyInBank()) {
    System.out.println("Hire a new employee");
} else {
    System.out.println("Wait until you get rich");
 }
  }
   }
    
    
    
 