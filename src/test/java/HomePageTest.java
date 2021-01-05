import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.ButtonsPage;
import com.formy.sample.pages.MainPage;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@RunWith(JUnit4.class)
public class HomePageTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
        PageFactory.initElements(driver, this);
    }

    @Test
    public void isPossibleToNavigateByLinks() throws ValidationExceptions.WrongPageOpenedException {
        MainPage mainPage = new MainPage();
        mainPage
                .open()
                .goToPage("Buttons");

        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage.isPageOpen();
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.tearDown();
    }
}
