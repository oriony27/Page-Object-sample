package impl;

import api.BaseTest;
import com.formy.sample.pages.PageScrollPage;
import org.junit.Test;

public class ScrollPageTest extends BaseTest {

    @Test
    public void isPossibleToScrollToElement() {
        storage
                .getPage(PageScrollPage.class)
                .open()
                .scrollToFullNameInput();
    }
}
