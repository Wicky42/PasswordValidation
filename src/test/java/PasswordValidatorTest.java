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
            "tz678d",
            "5ton",
            "okn7bnb109",
            "18293"
    })
    void containsDigit_shouldReturnTrue_whenStringContainsDigit(String text) {
        assertTrue(PasswordValidator.containsDigit(text));

    }
    @ParameterizedTest
    @CsvSource({
            "bfnlv",
            "neoplÜlA",
            "Rtwndol"
    })
    void containsDigit_shouldReturnFalse_whenStringDoNotContainsDigit(String text) {
        assertFalse(PasswordValidator.containsDigit(text));
    }
    @ParameterizedTest
    @CsvSource({
            "bfnlv, false",
            "neoplÜlA, false",
            "ionknO9, true",
            "Rtwndol, false",
            "2Zb7mML, true"
    })
    void containsDigit_shouldReturnFCorrectly(String text, boolean contains) {
        assertEquals(contains, PasswordValidator.containsDigit(text));
    }

    @ParameterizedTest
    @CsvSource({
            "TZBOI90, false",
            "zbUNLKm, true",
            "9, false"
    })
    void containsLower_shouldReturnCorrect(String text, boolean contains){
        assertEquals(contains, PasswordValidator.containsLower(text));
    }

    @ParameterizedTest
    @CsvSource({
            "TZBOI90, true",
            "zbUNLKm, true",
            "9, false",
            "hbjfik, false"
    })
    void containsUpper_shouldReturnCorrect(String text, boolean contains){
        assertEquals(contains, PasswordValidator.containsUpper(text));
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