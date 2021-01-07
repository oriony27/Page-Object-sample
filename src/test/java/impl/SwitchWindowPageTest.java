package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.MainPage;
import com.formy.sample.pages.SwitchWindowPage;
import org.junit.Test;

public class SwitchWindowPageTest extends BaseTest {

    @Test
    public void isPossibleToSwitchWindow() throws ValidationExceptions.WrongElementStateException {
        SwitchWindowPage switchWindowPage = new SwitchWindowPage();
        switchWindowPage
                .open()
                .clickOpenNewTabButtonAndSwitchToIt()
                .checkSwitchedTab(new MainPage().getUrl());
    }

    @Test
    public void isPossibleToSwitchOnAlert() {
        SwitchWindowPage switchWindowPage = new SwitchWindowPage();
        switchWindowPage
                .open()
                .clickAlertButtonAndSwitchToIt();
    }
}
