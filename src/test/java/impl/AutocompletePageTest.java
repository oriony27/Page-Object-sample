package impl;

import api.BaseTest;
import com.formy.sample.pages.AutocompletePage;
import org.junit.Test;

public class AutocompletePageTest extends BaseTest {

    @Test
    public void isAutocompleteWorking() {
        AutocompletePage autocompletePage = new AutocompletePage();
        autocompletePage
                .open()
                .autocomplete("Sumska Street, Kharkiv, Kharkiv Oblast, Ukraine");
    }
}