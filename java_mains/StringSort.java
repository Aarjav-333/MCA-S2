import java.util.ArrayList;

public class StringSort{
    public static void main(String a[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("arun");
        arr.add("binu");
        arr.add("anu");
        

        for(int i = 0; i < arr.size() - 1; i++){
            for(int j = i + 1; j < arr.size(); j++){
                if((arr.get(i).compareTo(arr.get(j))) > 0 ){

                    String temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        


        for(String i : arr){
            System.out.println(i);
        }
    }
}
