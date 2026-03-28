 class RunnableExample {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();  
        Thread t1 = new Thread(obj);         
        t1.start();                         

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}
