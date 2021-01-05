import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.MainPage;
import com.formy.sample.pages.SwitchWindowPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class SwitchWindowTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
    }

    @Test
    public void isPossibleToSwitchWindow() throws ValidationExceptions.WrongElementStateException {
        SwitchWindowPage switchWindowPage = new SwitchWindowPage();
        switchWindowPage
                .open()
                .clickOpenNewTabButtonAndSwitchToIt()
                .checkSwitchedTab(MainPage.URL);
    }

    @Test
    public void isPossibleToSwitchOnAlert() {
        SwitchWindowPage switchWindowPage = new SwitchWindowPage();
        switchWindowPage
                .open()
                .clickAlertButtonAndSwitchToIt();
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}
