import java.util.LinkedHashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int add = sc.nextInt();
                    if (set.add(add))
                        System.out.println("Added successfully");
                    else
                        System.out.println("Element already exists");
                    break;

                case 2:
                    System.out.print("Enter element to remove: ");
                    int rem = sc.nextInt();
                    if (set.remove(rem))
                        System.out.println("Removed successfully");
                    else
                        System.out.println("Element not found");
                    break;

                case 3:
                    System.out.println("Set elements: " + set);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();
                    if (set.contains(search))
                        System.out.println("Element found");
                    else
                        System.out.println("Element not found");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}