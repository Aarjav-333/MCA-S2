import java.io.*;
import java.util.*;

public class EvenOddFile {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner sc = new Scanner(inputFile);

            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            while (sc.hasNextInt()) {
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    evenWriter.write(num + " ");
                } else {
                    oddWriter.write(num + " ");
                }
            }

            sc.close();
            evenWriter.close();
            oddWriter.close();

            System.out.println("Even and Odd numbers separated successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}