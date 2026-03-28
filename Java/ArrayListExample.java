import java.util.*;

 class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List: " + list);

        System.out.println("First element: " + list.get(0));

        list.remove("Banana");

        System.out.println("After removal: " + list);
    }
}