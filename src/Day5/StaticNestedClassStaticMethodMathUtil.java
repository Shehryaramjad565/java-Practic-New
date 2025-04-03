package Day5;

public class StaticNestedClassStaticMethodMathUtil {
	
	static class Calculator{
		
		public static int add(int a, int b) {
			return a+b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calculator.add(3, 5));
		
	}

}
