import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
       



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of C1");
        int r1 = sc.nextInt();
        System.out.println("Enter the imaginary part of C1");
        int c1 = sc.nextInt();


        System.out.println("Enter the real part of C2");
        int r2 = sc.nextInt();
        System.out.println("Enter the imaginary part of C2");
        int c2 = sc.nextInt();



         Complex a = new Complex(r1,c1);
        Complex b = new Complex(r2, c2);



        Complex sum = a.add(b);
        sum.display();

        sc.close();

    }
}
