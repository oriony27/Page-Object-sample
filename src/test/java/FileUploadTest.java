import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.SupportedDrivers;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.FileUploadPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class FileUploadTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
    }

    @Test
    public void isPossibleToUploadFile() {
        String pathToFile = "resources/SuperFile.txt";
        FileUploadPage fileUploadPage = new FileUploadPage();
        fileUploadPage
                .open()
                .uploadFile(pathToFile);
    }

    @Test
    public void isPossibleToResetUpload() throws ValidationExceptions.WrongElementStateException {
        String pathToFile = "resources/SuperFile.txt";
        FileUploadPage fileUploadPage = new FileUploadPage();
        fileUploadPage
                .open()
                .uploadFile(pathToFile)
                .resetUploadedFile();
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }
}
