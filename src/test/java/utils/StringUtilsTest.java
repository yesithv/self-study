package utils;

import org.junit.Test;
import yesithv.utils.StringUtils;

import static org.junit.Assert.assertEquals;


public class StringUtilsTest {

    @Test
    public void givenNullInput_WhenIsInvalidWord_ThenWordIsInvalid() {
        String input = null;
        boolean expected = true;
        boolean result = StringUtils.isInvalidWord(input);
        assertEquals("The method should return true because null is invalid word", expected, result);
    }

    @Test
    public void givenEmptyInput_WhenIsInvalidWord_ThenWordIsInvalid() {
        String input = "";
        boolean expected = true;
        boolean result = StringUtils.isInvalidWord(input);
        assertEquals("The method should return true because empty is invalid word", expected, result);
    }

    @Test
    public void givenBlankInput_WhenIsInvalidWord_ThenWordIsInvalid() {
        String input = "  ";
        boolean expected = true;
        boolean result = StringUtils.isInvalidWord(input);
        assertEquals("The method should return true because blank is invalid word", expected, result);
    }

    @Test
    public void givenValidInput_WhenRemoveDuplicates_ThenSuccess() {
        String input = "banana";
        String expected = "ban";
        String result = StringUtils.removeDuplicates(input);
        assertEquals("The method should remove duplicates and maintain order.", expected, result);
    }

    @Test
    public void givenValidMayusInput_WhenRemoveDuplicates_ThenSuccess() {
        String input = "aaaAAAZZZzz";
        String expected = "aAZz";
        String result = StringUtils.removeDuplicates(input);
        assertEquals("The method should remove duplicates and maintain order.", expected, result);
    }

    @Test
    public void givenSpecialCharacterInput_WhenRemoveDuplicates_ThenSuccess() {
        String input = "h##oo===WW";
        String expected = "h#o=W";
        String result = StringUtils.removeDuplicates(input);
        assertEquals("The method should remove duplicates and maintain order.", expected, result);
    }
}