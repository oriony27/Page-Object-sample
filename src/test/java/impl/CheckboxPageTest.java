package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.CheckboxPage;
import org.junit.Test;

public class CheckboxPageTest extends BaseTest {

    @Test
    public void isPossibleToSelectCheckbox() throws ValidationExceptions.WrongElementStateException {
        CheckboxPage checkboxPage = new CheckboxPage();
        checkboxPage
                .open()
                .selectCheckboxAndCheckThatItSelected();
    }
}
