package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;

    public abstract HomePage open();
    public abstract void isPageOpen() throws ValidationExceptions.WrongPageOpenedException;

}
