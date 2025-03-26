package Day1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResouses {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

