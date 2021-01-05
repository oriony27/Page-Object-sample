package com.formy.sample.pages;

import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageScrollPage extends BasePage {
    private static final String URL = "https://formy-project.herokuapp.com/switch-window";
    private WebDriver driver;

    public PageScrollPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    private WebElement fullNameInput;

    @FindBy(id = "date")
    private WebElement dateInput;

    @Override
    public PageScrollPage open() {
        driver.get(URL);
        return this;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {

    }

    public PageScrollPage scrollToFullNameInput() {
        Actions action = new Actions(driver);
        action.moveToElement(fullNameInput);

        return this;
    }
}
