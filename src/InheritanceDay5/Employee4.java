package InheritanceDay5;

public class Employee4 {
	
	public int salary;
	
	
	public void work() {
		System.out.println("work");
	}
	public void getSalary() {
		System.out.println("get salary");
	}
	
	public Employee4(int salary) {
		super();
		this.salary = salary;
	}
	
	public int getsalary() {
		return this.salary;
	}

	class HRManager extends Employee4{
		public HRManager(int salary) {
			super(salary);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void work() {
			System.out.println("work under hr manger");
		}
		
		public void addEmployee() {
			System.out.println("add emplyee method");
		}
		public int getsalary() {
			return this.salary;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee4 objemp = new Employee4(30000);
		
		HRManager objmng = objemp.new HRManager(50000);
		
		System.out.println("employee salary is " + objemp.getsalary());
		System.out.println("manager salary is " + objmng.getsalary());
		
		
		

		
	}

}
