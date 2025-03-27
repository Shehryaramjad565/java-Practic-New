

package day2;

public class SumOf100PrimeNumber {

    public static void main(String[] args) {
        
        for (int i = 2; i < 100; i++) {  
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int j = 2; j <= Math.sqrt(num); j++) {  
            if (num % j == 0) {
                return false;  
            }
        }
        return true;  
    }
}
