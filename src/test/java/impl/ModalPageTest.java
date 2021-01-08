package impl;

import api.BaseTest;
import com.formy.sample.pages.ModalPage;
import org.junit.Test;

public class ModalPageTest extends BaseTest {

    @Test
    public void isPossibleToCloseModal() {
        storage
                .getPage(ModalPage.class)
                .open()
                .openModal()
                .checkCloseModal();
    }
}