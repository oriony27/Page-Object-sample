package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import com.formy.sample.pages.DropdownPage;
import org.junit.Test;

public class DropdownPageTest extends BaseTest {

    @Test
    public void isDropdownWorking() throws ValidationExceptions.WrongPageOpenedException {
        storage
                .getPage(DropdownPage.class)
                .open()
                .clickAndSelectButtonsFromDropdown();

        storage
                .getPage(ButtonsPage.class)
                .isPageOpen();
    }
}
