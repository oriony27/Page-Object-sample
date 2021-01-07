package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ButtonsPageTest extends BaseTest {

    @Test
    public void isButtonClickable() {
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .clickPrimaryButton();
    }

    @Test
    public void isLinkClickable() {
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .clickLink();
    }

    @Test
    public void isPossibleClickItemFromDropdown() {
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .clickDropdownAndSelectOption("Dropdown link 1");
    }

    @Test
    public void isDropdownContainsAllValues() throws ValidationExceptions.WrongElementStateException {
        List<String> expectedValues = Arrays.asList("Dropdown link 1", "Dropdown link 2");
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .isDropdownContainsAllValues(expectedValues);
    }
}