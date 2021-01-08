package impl;

import api.BaseTest;
import com.formy.sample.enumeration.Components;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import com.formy.sample.pages.MainPage;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void isPossibleToNavigateByLinks() throws ValidationExceptions.WrongPageOpenedException {
        storage
                .getPage(MainPage.class)
                .open()
                .goToPage(Components.BUTTONS_LINK.getLinkName());

        storage
                .getPage(ButtonsPage.class)
                .isPageOpen();
    }
}
