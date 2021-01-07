package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.FileUploadPage;
import org.junit.Test;

public class FileUploadPageTest extends BaseTest {
    private static final String PATH_TO_FILE = "./resources/SuperFile.txt";

    @Test
    public void isPossibleToUploadFile() {
        FileUploadPage fileUploadPage = new FileUploadPage();
        fileUploadPage
                .open()
                .uploadFile(PATH_TO_FILE);
    }

    @Test
    public void isPossibleToResetUpload() throws ValidationExceptions.WrongElementStateException {
        FileUploadPage fileUploadPage = new FileUploadPage();
        fileUploadPage
                .open()
                .uploadFile(PATH_TO_FILE)
                .resetUploadedFile();
    }
}
