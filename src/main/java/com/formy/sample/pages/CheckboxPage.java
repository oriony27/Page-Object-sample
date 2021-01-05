package com.formy.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends HomePage {

    public CheckboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Override
    public CheckboxPage open() {
        return this;
    }

    @Override
    public void isPageOpen() {

    }
}
