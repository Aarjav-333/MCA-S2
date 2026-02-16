import java.util.Scanner;

 public class StringManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Length: " + str.length());

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);

        System.out.print("Enter another string to compare: ");
        String str2 = sc.nextLine();

        if (str.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        System.out.print("Enter substring to check: ");
        String sub = sc.nextLine();

        if (str.contains(sub)) {
            System.out.println("Substring exists in the string.");
        } else {
            System.out.println("Substring does not exist.");
        }


        sc.close();
    }
}
