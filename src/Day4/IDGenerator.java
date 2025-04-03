package Day4;

public class IDGenerator {
    private static int myid = 1; // Static variable for ID generation

    public static int generateID() {
        return myid++;
    }

    public static void main(String[] args) {
        System.out.println("Generated ID: " + generateID());
        System.out.println("Generated ID: " + generateID());
    }
}
