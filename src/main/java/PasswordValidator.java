public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min) {
        return password.length() >= min;
    }

    public static boolean containsDigit(String password) {
        for(char c : password.toCharArray()){
            if(isDigit(c)){
                return true;
            }
        }
        return false;
    }



    public static boolean containsUpperAndLower(String password) {
        return false;
    }

    public static boolean isCommonPassword(String password) // kleine interne Liste
    {
        return false;
    }

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed) {
        return false;
    }

    // Optionale Gesamtsicht:
    public static boolean isValid(String password) // nutzt die obenstehenden Checks
    {
        return false;
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
}
