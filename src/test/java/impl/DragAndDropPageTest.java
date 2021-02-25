package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.DragAndDropPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DragAndDropPageTest extends BaseTest {

    @Test
    @DisplayName("Drag and drop usage.")
    public void isDragAndDropWorking() throws ValidationExceptions.WrongElementStateException {
        storage
                .getPage(DragAndDropPage.class)
                .open()
                .dragAndDropImage();
    }
}
