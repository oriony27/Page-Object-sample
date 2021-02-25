package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ButtonsPageTest extends BaseTest {

    @Test
    @DisplayName("Click on a button.")
    public void isButtonClickable() {
        storage
                .getPage(ButtonsPage.class)
                .open()
                .clickPrimaryButton();
    }

    @Test
    @DisplayName("Click on a link.")
    public void isLinkClickable() {
        storage.
                getPage(ButtonsPage.class)
                .open()
                .clickLink();
    }

    @Test
    @DisplayName("Click on item in dropdown.")
    public void isPossibleClickItemFromDropdown() {
        storage
                .getPage(ButtonsPage.class)
                .open()
                .clickDropdownAndSelectOption("Dropdown link 1");
    }

    @Test
    @DisplayName("Check that dropdown contains right values.")
    public void isDropdownContainsAllValues() throws ValidationExceptions.WrongElementStateException {
        List<String> expectedValues = Arrays.asList("Dropdown link 1", "Dropdown link 2");
        storage
                .getPage(ButtonsPage.class)
                .open()
                .isDropdownContainsAllValues(expectedValues);
    }
}