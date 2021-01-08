package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.CheckboxPage;
import org.junit.Test;

public class CheckboxPageTest extends BaseTest {

    @Test
    public void isPossibleToSelectCheckbox() throws ValidationExceptions.WrongElementStateException {
        storage
                .getPage(CheckboxPage.class)
                .open()
                .selectCheckboxAndCheckThatItSelected();
    }
}
