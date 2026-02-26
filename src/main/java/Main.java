import java.util.Scanner;

public class Main {

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.println("Hello, please set a password.");
        do{
            getText();
            password = scanner.nextLine();
        }while(!PasswordValidator.isValid(password));

        System.out.println("Thank, password is set");
        System.out.println("Your password is: " + password);
    }

    public static void getText(){
        System.out.println("""
        Password requirements:
        - At least 8 characters long
        - At least one uppercase letter
        - At least one lowercase letter
        - At least one digit
        - At least one special character
        >""");    }



}
