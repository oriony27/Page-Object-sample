package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.EnabledAndDisabledPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnabledAndDisabledPageTest extends BaseTest {

    @Test
    @DisplayName("Check that element disabled.")
    public void isElementDisabled() throws ValidationExceptions.WrongElementStateException {
        storage
                .getPage(EnabledAndDisabledPage.class)
                .open()
                .isInputDisabled();
    }

    @Test
    @DisplayName("Check that element enabled.")
    public void isElementEnabled() throws ValidationExceptions.WrongElementStateException {
        storage
                .getPage(EnabledAndDisabledPage.class)
                .open()
                .isInputEnabled();
    }
}