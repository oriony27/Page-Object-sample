import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.EnabledAndDisabledPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class EnabledAndDisabledPageTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
    }

    @Test
    public void isElementDisabled() throws ValidationExceptions.WrongElementStateException {
        EnabledAndDisabledPage enabledAndDisabledPage = new EnabledAndDisabledPage();
        enabledAndDisabledPage
                .open()
                .isInputDisabled();
    }

    @Test
    public void isElementEnabled() throws ValidationExceptions.WrongElementStateException {
        EnabledAndDisabledPage enabledAndDisabledPage = new EnabledAndDisabledPage();
        enabledAndDisabledPage
                .open()
                .isInputEnabled();
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}