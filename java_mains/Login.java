import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Login {
    public static void main(String [] a){


        boolean UsernameOk = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username to check");
        String User = sc.nextLine();
        try {
            for(int i = 0; i < User.length(); i++){
                if(Character.isLetterOrDigit(User.charAt(i))){
                    UsernameOk = true;
                }
                else {
                    throw new UserNameException("Invalid Username");
                }
            }
            if(UsernameOk){
                System.out.println("Username OK");
            }
            boolean specialChar = false;
            boolean whiteSpace = false;
            System.out.println("Enter the Password to check");
            String pass = sc.nextLine();
            for(int i = 0; i < pass.length(); i++){
                if((!Character.isLetterOrDigit(pass.charAt(i)))){
                        specialChar = true;
                } if (Character.isWhitespace(pass.charAt(i))) {
                    whiteSpace = true;
                    throw new PasswordException("Password should not contain whitespace ");
                }
            }
            if(specialChar && !whiteSpace){
                System.out.println("Password OK");
            }
            Credientials cred = new Credientials(User,pass);

            System.out.println("---Login---");
            System.out.println("Enter the Username to Login");
            String user_login = sc.nextLine();
            System.out.println("Enter the password");
            String pass_login = sc.nextLine();

            boolean isValid = cred.credentialsCheck(user_login, pass_login);
            if(isValid){
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Username or Password");
            }






        } catch (Exception e){
            System.out.println(e.getMessage());
        }
            
        
        

    }
}
class Credientials{
    String Username;
    String Password;

    Credientials(String User, String Pass){
        this.Username = User;
        this.Password = Pass;
    }

    boolean credentialsCheck(String user, String Pass){
        if(this.Username == user && this.Password == Pass){
            return true;
        } else {
            return false;
        }
    }
}

class UserNameException extends Exception{
    UserNameException(String s){
        super(s);
    }
}


class PasswordException extends Exception{
    PasswordException(String s){
        super(s);
    }
}


