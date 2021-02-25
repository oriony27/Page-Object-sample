package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.FileUploadPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileUploadPageTest extends BaseTest {
    private static final String PATH_TO_FILE = "./resources/SuperFile.txt";

    @Test
    @DisplayName("File upload usage.")
    public void isPossibleToUploadFile() {
        storage
                .getPage(FileUploadPage.class)
                .open()
                .uploadFile(PATH_TO_FILE);
    }

    @Test
    @DisplayName("Reset file upload.")
    public void isPossibleToResetUpload() throws ValidationExceptions.WrongElementStateException {
        storage
                .getPage(FileUploadPage.class)
                .open()
                .uploadFile(PATH_TO_FILE)
                .resetUploadedFile();
    }
}
