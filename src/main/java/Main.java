import java.util.Scanner;

public class Main {

    static void main(String[] args){

        final String SUCCSESS_MESSAGE = "Danke, ihr Passwort wurde gespeichert.";
        final String EXIT_Message = "Es wurde kein Passwort gespeichert.";

        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.println("Hello, please set a password.");
        getText();
        do{
            password = scanner.nextLine();
            if(password.equals("q")){
                break;
            }
            try{
                PasswordValidator.validateOrThrow(password);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.out.println("q for exit");
            }
        }while(!PasswordValidator.isValid(password));

        String message = PasswordValidator.isValid(password) ? SUCCSESS_MESSAGE : EXIT_Message;
        System.out.println(message);
    }

    public static void getText(){
        System.out.println("""
        Password requirements:
        - At least 8 characters long
        - At least one uppercase letter
        - At least one lowercase letter
        - At least one digit
        - At least one special character
        
        - q for exit
        >""");
    }

}
