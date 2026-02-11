import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1) 
                break;

            list.add(num);
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found");

        sc.close();
    }
}
