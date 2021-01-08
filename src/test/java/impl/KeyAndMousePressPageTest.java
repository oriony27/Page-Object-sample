package impl;

import api.BaseTest;
import com.formy.sample.pages.KeyAndMousePressPage;
import org.junit.Test;

public class KeyAndMousePressPageTest extends BaseTest {

    @Test
    public void isPossibleToTypeTextAndClickButton() {
        storage
                .getPage(KeyAndMousePressPage.class)
                .open()
                .typeTextToInput("Rick Sanchez")
                .clickButton();
    }
}
