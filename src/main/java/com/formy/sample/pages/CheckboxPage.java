package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends HomePage {

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
        return "https://formy-project.herokuapp.com/checkbox";
    }

    public CheckboxPage selectCheckboxAndCheckThatItSelected() throws ValidationExceptions.WrongElementStateException {
        firsCheckbox.click();

        if (!firstInput.isSelected()) {
            throw new ValidationExceptions.WrongElementStateException("Checbox isn't selected!");
        }

        return this;
    }
}
