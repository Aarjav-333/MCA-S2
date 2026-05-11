import java.util.*;

class Product {
    int productId;
    String itemName;
    double price;
    int availableQuantity;

    Product(int productId, String itemName, double price, int availableQuantity) {
        this.productId = productId;
        this.itemName = itemName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    void displayProduct() {
        System.out.println(productId + "\t\t" + itemName + "\t\t" + price + "\t\t" + availableQuantity);
    }
}

class CartItem {
    int productId;
    String itemName;
    double price;
    int quantity;
    double total;

    CartItem(int productId, String itemName, double price, int quantity) {
        this.productId = productId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }

    void displayCartItem() {
        System.out.println(productId + "\t\t" + itemName + "\t\t" + price + "\t\t" + quantity + "\t\t" + total);
    }
}

public class ShoppingCartProgram {

    static void addDefaultProducts(ArrayList<Product> products) {
        products.add(new Product(101, "Pen", 10, 50));
        products.add(new Product(102, "Book", 60, 30));
        products.add(new Product(103, "Pencil", 5, 100));
        products.add(new Product(104, "Bag", 500, 10));
        products.add(new Product(105, "Scale", 20, 40));
    }

    static void displayProducts(ArrayList<Product> products) {
        System.out.println("\n------ Available Products ------");
        System.out.println("Product ID\tItem Name\tPrice\t\tAvailable Quantity");
        System.out.println("-------------------------------------------------------------");

        for (Product p : products) {
            p.displayProduct();
        }
    }

    static boolean isNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static Product findProduct(ArrayList<Product> products, String input) {
        if (isNumber(input)) {
            int productId = Integer.parseInt(input);

            for (Product p : products) {
                if (p.productId == productId) {
                    return p;
                }
            }
        } else {
            for (Product p : products) {
                if (p.itemName.equalsIgnoreCase(input)) {
                    return p;
                }
            }
        }

        return null;
    }

    static CartItem findCartItem(ArrayList<CartItem> cart, String input) {
        if (isNumber(input)) {
            int productId = Integer.parseInt(input);

            for (CartItem item : cart) {
                if (item.productId == productId) {
                    return item;
                }
            }
        } else {
            for (CartItem item : cart) {
                if (item.itemName.equalsIgnoreCase(input)) {
                    return item;
                }
            }
        }

        return null;
    }

    static void addToCart(ArrayList<Product> products, ArrayList<CartItem> cart, Scanner sc) {
        System.out.println("Enter Product ID or Item Name:");
        String input = sc.next();

        Product product = findProduct(products, input);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        if (quantity > product.availableQuantity) {
            System.out.println("Not enough stock available.");
            return;
        }

        CartItem existingItem = findCartItem(cart, String.valueOf(product.productId));

        if (existingItem != null) {
            existingItem.quantity += quantity;
            existingItem.total = existingItem.price * existingItem.quantity;
        } else {
            cart.add(new CartItem(product.productId, product.itemName, product.price, quantity));
        }

        product.availableQuantity -= quantity;

        System.out.println("Item added to cart successfully.");
    }

    static void displayCart(ArrayList<CartItem> cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n------ Cart Items ------");
        System.out.println("Product ID\tItem Name\tPrice\t\tQuantity\tTotal");
        System.out.println("-------------------------------------------------------------");

        for (CartItem item : cart) {
            item.displayCartItem();
        }
    }

    static void removeFromCart(ArrayList<Product> products, ArrayList<CartItem> cart, Scanner sc) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Enter Product ID or Item Name to remove:");
        String input = sc.next();

        CartItem cartItem = findCartItem(cart, input);

        if (cartItem == null) {
            System.out.println("Item not found in cart.");
            return;
        }

        System.out.println("Enter quantity to remove:");
        int removeQuantity = sc.nextInt();

        if (removeQuantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        if (removeQuantity > cartItem.quantity) {
            System.out.println("Remove quantity is greater than cart quantity.");
            return;
        }

        Product product = findProduct(products, String.valueOf(cartItem.productId));

        if (product != null) {
            product.availableQuantity += removeQuantity;
        }

        cartItem.quantity -= removeQuantity;
        cartItem.total = cartItem.price * cartItem.quantity;

        if (cartItem.quantity == 0) {
            cart.remove(cartItem);
        }

        System.out.println("Item removed from cart successfully.");
    }

    static void displayTotalBill(ArrayList<CartItem> cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double totalBill = 0;

        for (CartItem item : cart) {
            totalBill += item.total;
        }

        System.out.println("Total Bill Amount: " + totalBill);
    }

    static void displayMenu() {
        System.out.println("\n------ Shopping Cart Menu ------");
        System.out.println("1. Display All Products");
        System.out.println("2. Add Item to Cart");
        System.out.println("3. Display Cart Items");
        System.out.println("4. Remove Item from Cart");
        System.out.println("5. Display Total Bill Amount");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<CartItem> cart = new ArrayList<>();

        addDefaultProducts(products);

        boolean running = true;

        while (running) {
            displayMenu();

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayProducts(products);
                    break;

                case 2:
                    addToCart(products, cart, sc);
                    break;

                case 3:
                    displayCart(cart);
                    break;

                case 4:
                    removeFromCart(products, cart, sc);
                    break;

                case 5:
                    displayTotalBill(cart);
                    break;

                case 6:
                    running = false;
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}