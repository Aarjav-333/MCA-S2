public class RunnableExample {
    public static void main(String a[]){
        Thread t1 = new Thread(new Fibonacci(10));
        t1.start();
        Thread t2 = new Thread(new EvenUptoN(100));
        t2.start();
    }
}
class Fibonacci implements Runnable{
    int n;
    Fibonacci(int n){
        this.n = n;
    }
    int a = 0;
    int b = 1;
    int c;


    public void run(){

        for(int i = 1; i <= n ; i++){
            System.out.println(a + " ");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}


class EvenUptoN implements Runnable{
    int n;
    EvenUptoN(int n){
        this.n = n;
    }



    public void run(){

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i + " ");
                try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            }
        }

    }
}


