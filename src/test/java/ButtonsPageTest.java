import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class ButtonsPageTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
    }

    @Test
    public void isButtonClickable() {
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .clickPrimaryButton();
    }

    @Test
    public void isLinkClickable() {
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .clickLink();
    }

    @Test
    public void isPossibleClickItemFromDropdown() {
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .clickDropdownAndSelectOption("Dropdown link 1");
    }

    @Test
    public void isDropdownContainsAllValues() throws ValidationExceptions.WrongElementStateException {
        List<String> expectedValues = Arrays.asList("Dropdown link 1", "Dropdown link 2");
        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage
                .open()
                .isDropdownContainsAllValues(expectedValues);
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}