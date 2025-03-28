package day3;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shehryar";
		String vovels = "aeiou";
		String newstr = "";
		for (int i=0; str.length()>i; i++) {
			for(int j=0; vovels.length()>j; j++) {
				if (str.charAt(i)==vovels.charAt(j)) {
//					System.out.println();
//					newstr.add(i);
					newstr +=str.charAt(i);
				}
				
			}
		}
		System.out.println(newstr);
		
	}

}
