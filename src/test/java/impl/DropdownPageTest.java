package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import com.formy.sample.pages.DropdownPage;
import org.junit.Test;

public class DropdownPageTest extends BaseTest {

    @Test
    public void isDropdownWorking() throws ValidationExceptions.WrongPageOpenedException {
        DropdownPage dropdownPage = new DropdownPage();
        dropdownPage
                .open()
                .clickAndSelectButtonsFromDropdown();

        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage.isPageOpen();
    }
}
