package day2;

import java.lang.*;

public class insertString {
    public static void main(String[] args) {

        String main_string = "Python 3.0";
        String word = "Tutorial";

        
        String result = main_string.substring(0, 7) + word + main_string.substring(6);

        
        System.out.println(result);
    }
}
