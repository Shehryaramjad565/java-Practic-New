package day2;

public class ExtractFirstPartString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "firstSecond";
//		String[] get = str.split("t");
//		System.out.println(get.);
		String substr = str.substring(0, str.length()/2);
		System.out.println(substr);
	}

}
