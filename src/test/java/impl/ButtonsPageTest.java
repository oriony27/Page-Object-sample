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
        storage
                .getPage(ButtonsPage.class)
                .open()
                .clickPrimaryButton();
    }

    @Test
    public void isLinkClickable() {
        storage.
                getPage(ButtonsPage.class)
                .open()
                .clickLink();
    }

    @Test
    public void isPossibleClickItemFromDropdown() {
        storage
                .getPage(ButtonsPage.class)
                .open()
                .clickDropdownAndSelectOption("Dropdown link 1");
    }

    @Test
    public void isDropdownContainsAllValues() throws ValidationExceptions.WrongElementStateException {
        List<String> expectedValues = Arrays.asList("Dropdown link 1", "Dropdown link 2");
        storage
                .getPage(ButtonsPage.class)
                .open()
                .isDropdownContainsAllValues(expectedValues);
    }
}