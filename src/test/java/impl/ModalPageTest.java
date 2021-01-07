package impl;

import api.BaseTest;
import com.formy.sample.pages.ModalPage;
import org.junit.Test;

public class ModalPageTest extends BaseTest {

    @Test
    public void isPossibleToCloseModal() {
        ModalPage modalPage = new ModalPage();
        modalPage
                .open()
                .openModal()
                .checkCloseModal();
    }
}