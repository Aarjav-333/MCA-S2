import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");

            FileOutputStream fos = new FileOutputStream("destination.txt");

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}