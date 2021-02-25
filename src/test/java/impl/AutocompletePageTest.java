package impl;

import api.BaseTest;
import com.formy.sample.pages.AutocompletePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AutocompletePageTest extends BaseTest {

    @Test
    @DisplayName("Fill autocomplete")
    public void isAutocompleteWorking() {
        storage
                .getPage(AutocompletePage.class)
                .open()
                .autocomplete("Sumska Street, Kharkiv, Kharkiv Oblast, Ukraine");
    }
}