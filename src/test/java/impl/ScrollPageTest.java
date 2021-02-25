package impl;

import api.BaseTest;
import com.formy.sample.pages.PageScrollPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScrollPageTest extends BaseTest {

    @Test
    @DisplayName("Scroll page usage.")
    public void isPossibleToScrollToElement() {
        storage
                .getPage(PageScrollPage.class)
                .open()
                .scrollToFullNameInput();
    }
}
