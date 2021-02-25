package impl;

import api.BaseTest;
import com.formy.sample.pages.KeyAndMousePressPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KeyAndMousePressPageTest extends BaseTest {

    @Test
    @DisplayName("Send keys and click usage.")
    public void isPossibleToTypeTextAndClickButton() {
        storage
                .getPage(KeyAndMousePressPage.class)
                .open()
                .typeTextToInput("Rick Sanchez")
                .clickButton();
    }
}
