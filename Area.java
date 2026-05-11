package Graphics;
// rectangle, triangle, square, cricle
 interface Shapes {
    void rectangle(double l, double b);
    void triangle(double b, double h);
    void square(double a);
    void circle(double r);
}

public class Area implements Shapes{
    public void rectangle(double l, double b){
        System.out.println("Rectangle Area : " + (l * b));
    }
    public void triangle(double b, double h){
        System.out.println("Triangle Area : " + (0.5 * b * h));
    }
    public void square(double a){
        System.out.println("Square Area : " + (a * a));
    }
    public void circle(double r){
        System.out.println("Circle Area : " + (Math.PI * Math.pow(r, 2)));
    }

}