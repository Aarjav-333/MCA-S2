import java.io.*;

public class EvenOddLines {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    evenWriter.write(line + "\n");
                } else {
                    oddWriter.write(line + "\n");
                }
                lineNumber++;
            }

            br.close();
            evenWriter.close();
            oddWriter.close();

            System.out.println("Lines copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}