import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.Components;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import com.formy.sample.pages.DropdownPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class DropdownPageTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
    }

    @Test
    public void isDropdownWorking() throws ValidationExceptions.WrongPageOpenedException {
        DropdownPage dropdownPage = new DropdownPage();
        dropdownPage
                .open()
                .clickAndSelectButtonsFromDropdown();

        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage.isPageOpen();
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}
