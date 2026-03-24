import java.util.Scanner;
import java.util.Arrays;

public class SortStringsInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string: ");
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        System.out.println("\nSorted Strings:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}