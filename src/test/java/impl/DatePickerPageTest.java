package impl;

import api.BaseTest;
import com.formy.sample.pages.DatepickerPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DatePickerPageTest extends BaseTest {

    @Test
    @DisplayName("Datepicker set date.")
    public void isDatePickerSelectDate() {
        String date = "12/10/2001";

        storage
                .getPage(DatepickerPage.class)
                .open()
                .selectDateInDatepicker(date);
    }
}
