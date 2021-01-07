package impl;

import api.BaseTest;
import com.formy.sample.pages.PageScrollPage;
import org.junit.Test;

public class ScrollPageTest extends BaseTest {

    @Test
    public void isPossibleToScrollToElement() {
        PageScrollPage pageScrollPage = new PageScrollPage();
        pageScrollPage
                .open()
                .scrollToFullNameInput();
    }
}
