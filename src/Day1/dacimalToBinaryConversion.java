package Day1;

import java.util.Scanner;

public class dacimalToBinaryConversion {

    public static void main(String[] args) {
    	
    	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");

         int userName = myObj.nextInt(); 
        int num = userName;
        String binary = "";

        while (num > 0) {  // Corrected condition
            if (num % 2 == 0) {
                binary = "0" + binary;  // Corrected string modification
            } else {
                binary = "1" + binary;
            }
            num = num / 2;  // Moved outside the if-else to avoid redundancy
        }

        System.out.println("Binary representation: " + binary);  // Print output
    }
}

