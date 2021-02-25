package impl;

import api.BaseTest;
import com.formy.sample.pages.CompleteWebFormPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompleteWebFormPageTest extends BaseTest {

    @Test
    @DisplayName("Complete web form.")
    public void isPossibleToCompleteWebForm() {
        storage
                .getPage(CompleteWebFormPage.class)
                .open()
                .fillFirstNameInput("First Name")
                .fillLastNameInput("Last Name")
                .fillJobTitleInput("Senior Title")
                .selectHighSchoolRadio()
                .clickPreferNotToSayCheckbox()
                .selectYearsOfExperienceDropdownValue("5-9")
                .chooseDateInDatepicker("12/10/2001")
                .clickCompleteButton();
    }
}
