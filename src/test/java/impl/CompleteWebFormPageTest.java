package impl;

import api.BaseTest;
import com.formy.sample.pages.CompleteWebFormPage;
import org.junit.Test;

public class CompleteWebFormPageTest extends BaseTest {

    @Test
    public void isPossibleToCompleteWebForm() {
        CompleteWebFormPage completeWebFormPage = new CompleteWebFormPage();
        completeWebFormPage
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
