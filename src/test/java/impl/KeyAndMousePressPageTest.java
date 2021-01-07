package impl;

import api.BaseTest;
import com.formy.sample.pages.KeyAndMousePressPage;
import org.junit.Test;

public class KeyAndMousePressPageTest extends BaseTest {

    @Test
    public void isPossibleToTypeTextAndClickButton() {
        KeyAndMousePressPage keyAndMousePressPage = new KeyAndMousePressPage();
        keyAndMousePressPage
                .open()
                .typeTextToInput("Rick Sanchez")
                .clickButton();
    }
}
