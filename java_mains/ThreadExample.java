import java.util.*;
class Table extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * 5 = " + (i * 5));
            try {
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Prime extends Thread{
    int n;
    Prime(int n){
        this.n = n;
    }
    public void run(){
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                if(i % j == 0){

                    count++;
                }

            }
            if(count == 2){
                System.out.println(i + " ");
                try {
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
            }
            count = 0;
        }
    
    }
}

public class ThreadExample{
    public static void main(String a[]){
        
        Table table = new Table();
        table.start();

        Prime prime = new Prime(100);
        prime.start();


    }

}