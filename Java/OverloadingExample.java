class Demo {
    
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}




public class OverloadingExample {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.display(10);        
        obj.display(5.5);       
        obj.display(3, 4);      
    }
}