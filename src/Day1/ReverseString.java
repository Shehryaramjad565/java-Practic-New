

package Day1;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        String str = "abcd efgh";
        char[] strArr = str.toCharArray();
        List<String> strUp = new ArrayList<>();

        for (int i = str.length() - 1; i >= 0; i--) { // Fixed loop condition
            strUp.add(String.valueOf(strArr[i])); // Convert char to String
        }

        // Join list elements to form a reversed string
        String reversedStr = String.join("", strUp);
        
        // Print reversed string
        System.out.println("Reversed String: " + reversedStr);
    }
}
