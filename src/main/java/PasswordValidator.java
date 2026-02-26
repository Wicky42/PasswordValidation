public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min) {
        return password.length() >= min;
    }

    public static boolean containsDigit(String password) {
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

}
