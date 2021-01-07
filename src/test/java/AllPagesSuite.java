import impl.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutocompletePageTest.class,
        ButtonsPageTest.class,
        CheckboxPageTest.class,
        CompleteWebFormPageTest.class,
        DatePickerPageTest.class,
        DragAndDropPageTest.class,
        DropdownPageTest.class,
        EnabledAndDisabledPageTest.class,
        FileUploadPageTest.class,
        HomePageTest.class,
        KeyAndMousePressPageTest.class,
        ModalPageTest.class,
        ScrollPageTest.class,
        SwitchWindowPageTest.class

})
public class AllPagesSuite {
}
