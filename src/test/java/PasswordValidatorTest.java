import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "TestPasswort23, 8",
            "Lkksmdnr81+, 8",
            "pldm=82WtH, 4"
    })
    void hasMinLength_shouldReturnTrue_whenStringHasMinLength(String text, int min) {
        assertTrue(PasswordValidator.hasMinLength(text, min));
    }

    @ParameterizedTest
    @CsvSource({
            "ghb0, 8",
            "hb21, 8",
            "0pw, 4"
    })
    void hasMinLength_shouldReturnFalse_whenStringDoesntHaveMinLength(String text, int min) {
        assertFalse(PasswordValidator.hasMinLength(text, min));
    }

    @ParameterizedTest
    @CsvSource({
            "tz678d, true",
            "5ton, true",
            "okn7bnb109, true",
            "18293, true"
    })
    void containsDigit_shouldReturnTrue_whenStringContainsDigit(String text) {
        assertTrue(PasswordValidator.containsDigit(text));
    }

    @Test
    void containsUpperAndLower() {
    }

    @Test
    void isCommonPassword() {
    }

    @Test
    void containsSpecialChar() {
    }

    @Test
    void isValid() {
    }
}