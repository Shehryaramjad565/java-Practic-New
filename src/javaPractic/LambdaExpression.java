package javaPractic;

//public class LambdaExpression {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Zara", "Bilal");
        
        names.forEach(n -> System.out.println(n));
    }
}

