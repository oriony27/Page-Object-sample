package com.formy.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyAndMousePressPage extends HomePage {

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
        return "https://formy-project.herokuapp.com/keypress";
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
