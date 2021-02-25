package impl;

import api.BaseTest;
import com.formy.sample.pages.ModalPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModalPageTest extends BaseTest {

    @Test
    @DisplayName("Handle modal example.")
    public void isPossibleToCloseModal() {
        storage
                .getPage(ModalPage.class)
                .open()
                .openModal()
                .checkCloseModal();
    }
}