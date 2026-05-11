import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class OddEvenFile {
    public static void main(String a[]) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("G:\\MCA-S2\\java_mains\\testfile.txt"));
        BufferedWriter evenWrite = new BufferedWriter(new FileWriter("G:\\MCA-S2\\java_mains\\evenfile.txt"));
        BufferedWriter oddWrite = new BufferedWriter(new FileWriter("G:\\MCA-S2\\java_mains\\oddfile.txt"));
        
       String line = "";
        while((line = reader.readLine()) != null){
            
            String []split_arr = line.split("[,\\s]+");
            for(int i = 0; i < split_arr.length; i++){
                int numbertoIntConvert = Integer.parseInt(split_arr[i]);
                if(numbertoIntConvert % 2 == 0){
                    evenWrite.write(split_arr[i] + " ");
                } else {
                    oddWrite.write(split_arr[i] + " ");
                }
            }
            
        }

            reader.close();
            evenWrite.close();
            oddWrite.close();


        System.out.println("Success");
    }
}