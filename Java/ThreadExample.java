class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); 
        t1.start(); 

        for (int i = 1; i <= 500; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}



class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.printf("Thread running: %d", i);
        }
    }
}

 