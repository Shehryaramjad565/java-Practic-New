package OOPendDay6;

import java.time.LocalDate;
import java.time.Year;

class Employee{
	
	public String name;
	public int salary;
	public int date;
	
	
	public Employee(String name, int salary, int date) {
		
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	
	public int currentDate() {
//		LocalDate myObj = LocalDate.now(); 
		int getYear = Year.now().getValue();
		return getYear;
	}
	
	
}
public class EmployeeMain9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee("ali", 30000, 4);
		int getexperice = obj.currentDate() - obj.date;
		System.out.println("Employee joining date is  " +getexperice);
		
		
	}

}



