//package Day1;
//
//public class CountCharacter {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String str= "Aa kiu I swd skieo 236587 GH kiu sieo 25 33";
//		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String number = "123456789";
//		for( int i = 0; i<str.length(); i++) {
//			str.charAt(i)==str.charAt(i);
//		}
//
//	}
//
//}




package Day1;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Aa kiu I swd skieo 236587 GH kiu sieo 25 33";
        
        int alphabets = 0, digits = 0, spaces = 0, others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Characters: " + others);
    }
}
