package impl;

import api.BaseTest;
import com.formy.sample.pages.DatepickerPage;
import org.junit.Test;

public class DatePickerPageTest extends BaseTest {

    @Test
    public void isDatePickerSelectDate() {
        String date = "12/10/2001";

        storage
                .getPage(DatepickerPage.class)
                .open()
                .selectDateInDatepicker(date);
    }
}
