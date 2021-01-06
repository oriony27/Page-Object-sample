import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.pages.CompleteWebFormPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class CompleteWebFormPageTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
    }

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

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}
