package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.CHECKBOX_PAGE;

public class CheckboxPage extends MainPage {

    public CheckboxPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "checkbox-1")
    private WebElement firsCheckbox;

    @FindBy(tagName = "input")
    private WebElement firstInput;

    @Override
    public CheckboxPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return CHECKBOX_PAGE.getPageUrl();
    }

    public CheckboxPage selectCheckboxAndCheckThatItSelected() throws ValidationExceptions.WrongElementStateException {
        firsCheckbox.click();

        if (!firstInput.isSelected()) {
            throw new ValidationExceptions.WrongElementStateException("Checbox isn't selected!");
        }

        return this;
    }
}
