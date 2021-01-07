package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.EnabledAndDisabledPage;
import org.junit.Test;

public class EnabledAndDisabledPageTest extends BaseTest {

    @Test
    public void isElementDisabled() throws ValidationExceptions.WrongElementStateException {
        EnabledAndDisabledPage enabledAndDisabledPage = new EnabledAndDisabledPage();
        enabledAndDisabledPage
                .open()
                .isInputDisabled();
    }

    @Test
    public void isElementEnabled() throws ValidationExceptions.WrongElementStateException {
        EnabledAndDisabledPage enabledAndDisabledPage = new EnabledAndDisabledPage();
        enabledAndDisabledPage
                .open()
                .isInputEnabled();
    }
}