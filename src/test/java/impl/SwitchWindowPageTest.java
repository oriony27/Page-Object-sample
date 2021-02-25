package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.MainPage;
import com.formy.sample.pages.SwitchWindowPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SwitchWindowPageTest extends BaseTest {

    @Test
    @DisplayName("Switch window handling example.")
    public void isPossibleToSwitchWindow() throws ValidationExceptions.WrongElementStateException {
        storage
                .getPage(SwitchWindowPage.class)
                .open()
                .clickOpenNewTabButtonAndSwitchToIt()
                .checkSwitchedTab(new MainPage().getUrl());
    }

    @Test
    @DisplayName("Alert handling example.")
    public void isPossibleToSwitchOnAlert() {
        storage
                .getPage(SwitchWindowPage.class)
                .open()
                .clickAlertButtonAndSwitchToIt();
    }
}
