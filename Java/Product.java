public class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    void display() {
         System.out.println("Product with lowest price:");
        System.out.println(pcode + " " + pname + " " + price);
    }

    static void lowestPrice(Product p1, Product p2, Product p3) {

        Product lowest = p1;

        if (p2.price < lowest.price)
            lowest = p2;
        if (p3.price < lowest.price)
            lowest = p3;

        lowest.display();
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mouse", 500);
        Product p3 = new Product(103, "Keyboard", 1500);

        lowestPrice(p1, p2, p3);
    }
}
 
