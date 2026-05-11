import java.util.*;
import java.io.*;

public class FileSearchDir {
    public static void main(String a []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename to search");
        String filename = sc.nextLine();
        System.out.println("Enter the path of the directory");
        String dirpath = sc.nextLine();
        File directory = new File(dirpath);
        if(directory.exists()){
            if(directory.isDirectory()){
                if(fileSearch(directory,filename)){
                    System.out.println("Found");
                } else {
                    System.out.println("Didn't find the file");
                }
            } else {
                System.out.println("Given path is not a directory");
            }
        } else {
            System.out.println("Directory doesn't exist");
        }
    }


    public static boolean fileSearch(File dir, String fileName){
        File[] files = dir.listFiles();
        if(files == null){
            return false;
        } 

        boolean found = false;
        for(File file : files){
            if(file.isDirectory()){
                if(fileSearch(file, fileName)){
                    found = true;
                }
                
            } else if(file.getName().equalsIgnoreCase(fileName)) {
                System.out.println("Found" + file.getAbsolutePath());
                found = true;
            }
        }
        return found;
    }
}