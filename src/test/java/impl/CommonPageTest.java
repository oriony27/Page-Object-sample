package impl;

import api.BaseTest;
import com.formy.sample.enumeration.Components;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import com.formy.sample.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommonPageTest extends BaseTest {

    @Test
    @DisplayName("Validate that link redirect to right page.")
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
