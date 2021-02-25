package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.ENABLED_AND_DISABLED_PAGE;

public class EnabledAndDisabledPage extends MainPage {

    public EnabledAndDisabledPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "disabledInput")
    private WebElement disabledInput;

    @FindBy(id = "input")
    private WebElement enabledInput;

    @Override
    public EnabledAndDisabledPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return ENABLED_AND_DISABLED_PAGE.getPageUrl();
    }

    public EnabledAndDisabledPage isInputDisabled() throws ValidationExceptions.WrongElementStateException {
        if (disabledInput.isEnabled()) {
            throw new ValidationExceptions.WrongElementStateException("Element is enabled but should be disabled!");
        }

        return this;
    }

    public EnabledAndDisabledPage isInputEnabled() throws ValidationExceptions.WrongElementStateException {
        if (!enabledInput.isEnabled()) {
            throw new ValidationExceptions.WrongElementStateException("Element is disabled but should be enabled!");
        }

        return this;
    }
}