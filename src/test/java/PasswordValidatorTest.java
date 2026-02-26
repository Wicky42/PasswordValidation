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

    @Test
    void containsDigit() {
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