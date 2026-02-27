import java.util.Scanner;

public class Main {

    static void main(String[] args){

        final String SUCCSESS_MESSAGE = "Danke, ihr Passwort wurde gespeichert.";
        final String EXIT_Message = "Es wurde kein Passwort gespeichert.";

        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.println("Hallo, bitte wählen Sie Ihr Passwort.");
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
                System.out.println("q für Beenden");
            }
        }while(!PasswordValidator.isValid(password));

        String message = PasswordValidator.isValid(password) ? SUCCSESS_MESSAGE : EXIT_Message;
        System.out.println(message);
    }

    public static void getText(){
        System.out.println("""
        Anforderungen:
        - Mindestens 8 Zeichen
        - Mindestens einen Großbuchstaben
        - Mindestens einen Kleinbuchstaben
        - Mindestens eine Ziffer
        - Mindestens ein Sonderzeichen
        
        - q für Beenden
        >""");
    }

}
