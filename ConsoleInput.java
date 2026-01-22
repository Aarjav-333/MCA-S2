import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
        Console c = System.console();
        String user = c.readLine("Enter username: ");
        char[] pass = c.readPassword("Enter password: ");
        
        System.out.println(user);

        for (char car : pass) {
        System.out.print(car);
    }

        System.out.println();
    }
}
