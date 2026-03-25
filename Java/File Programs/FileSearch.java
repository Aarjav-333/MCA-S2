import java.io.File;
import java.util.Scanner;

public class FileSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take directory path from user
        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();

        // Take file name to search
        System.out.print("Enter file name to search: ");
        String fileName = sc.nextLine();

        File directory = new File(dirPath);

        searchFile(directory, fileName);

        sc.close();
    }

    public static void searchFile(File dir, String fileName) {
        if (!dir.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }

        File[] files = dir.listFiles();

        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                // Search in subdirectory
                searchFile(file, fileName);
            } else {
                if (file.getName().equalsIgnoreCase(fileName)) {
                    System.out.println("File found: " + file.getAbsolutePath());
                }
            }
        }
    }
}