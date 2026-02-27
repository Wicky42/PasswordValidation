public final class PasswordValidator {

    public static void requireNotNullNorEmpty(String password){
        if( password == null || password.isEmpty()){
            throw new IllegalArgumentException("Passwort darf nicht leer sein");
        }
    }

    public static String[] getCommonPasswords(){
        return new String[]{"PassWort1", "meinPasswort", "Passwort123", "PassWord1", "1234PassWort"};
    }

    public static String getSpecialCharacter(){
        return "!@#$%^&*()-_=+[]{};:,.?/";
    }

    public static boolean hasMinLength(String password, int min) {
        requireNotNullNorEmpty(password);
        return password.length() >= min;
    }

    public static boolean containsDigit(String password) {
        requireNotNullNorEmpty(password);

        for(char c : password.toCharArray()){
            if(isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLower(String password) {
        requireNotNullNorEmpty(password);

        return containsLower(password) && containsUpper(password);
    }

    public static boolean isCommonPassword(String password) // kleine interne Liste
    {
        requireNotNullNorEmpty(password);

        for(String commonPassword : getCommonPasswords()){
            if(password.equals(commonPassword)){
                return true;
            }
        }
        return false;
    }

    // Bonus:
    public static boolean containsSpecialChar(String password) {
        requireNotNullNorEmpty(password);

        for(char c : password.toCharArray()){
            if(getSpecialCharacter().contains(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }

    // Optionale Gesamtsicht:
    public static boolean isValid(String password) // nutzt die obenstehenden Checks
    {
        requireNotNullNorEmpty(password);
        return containsUpperAndLower(password) && containsDigit(password) && containsSpecialChar(password) && hasMinLength(password, 8) ;
    }


    public static boolean isDigit(char c){
        return ("1234567890").contains(String.valueOf(c));
    }

    public static boolean containsLower(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpper(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static void validateOrThrow(String password) {
        if(!hasMinLength(password, 8)){
            throw new IllegalArgumentException("Password muss min. 8 Zeichen haben");
        }
        else if(!containsLower(password)){
            throw new IllegalArgumentException("Passwort muss min einen Kleinbuchstaben haben");
        }
        else if(!containsUpper(password)){
            throw new IllegalArgumentException("Passwort muss min einen Großbuchstaben haben");
        }
        else if(!containsSpecialChar(password)){
            throw new IllegalArgumentException("Passwort muss min ein Sonderzeichen haben");
        }
        else if(isCommonPassword(password)){
            throw new IllegalArgumentException("Passwort ist zu unsicher");
        }
    }
}
