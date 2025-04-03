package Day5;

import Day5.StaticNestedClassUniversity.Department;

public class StaticNestedClassUniversity {
	
	static class Department{
		public String DepartName;
		public int NumberFaculty;
		
		public Department(String DepartName, int NumberFaculty) {
			this.DepartName=DepartName;
			this.NumberFaculty=NumberFaculty;
		}
		
		public void showInfo() {
			System.out.println("department name is " + this.DepartName + " and total faculty there is " + this.NumberFaculty);
		}
	}

	public static void main(String[] args) {
		Department department = new Department("computer science", 100);
		// TODO Auto-generated method stub
		department.showInfo();

	}

}
