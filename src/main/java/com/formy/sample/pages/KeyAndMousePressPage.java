package com.formy.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.KEY_AND_MOUSE_PRESS_PAGE;

public class KeyAndMousePressPage extends MainPage {

    public KeyAndMousePressPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "name")
    private WebElement input;

    @FindBy(id = "button")
    private WebElement button;

    @Override
    public KeyAndMousePressPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return KEY_AND_MOUSE_PRESS_PAGE.getPageUrl();
    }

    public KeyAndMousePressPage typeTextToInput(String text) {
        input.sendKeys(text);
        return this;
    }

    public KeyAndMousePressPage clickButton() {
        button.click();
        return this;
    }
}
