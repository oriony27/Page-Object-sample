package impl;

import api.BaseTest;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.pages.DragAndDropPage;
import org.junit.Test;

public class DragAndDropPageTest extends BaseTest {

    @Test
    public void isDragAndDropWorking() throws ValidationExceptions.WrongElementStateException {
        DragAndDropPage dragAndDropPage = new DragAndDropPage();
        dragAndDropPage
                .open()
                .dragAndDropImage();
    }
}
