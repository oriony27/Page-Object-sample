package com.formy.sample.pages;

import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SwitchWindowPage extends BasePage {
    private static final String URL = "https://formy-project.herokuapp.com/switch-window";
    private WebDriver driver;

    public SwitchWindowPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "new-tab-button")
    private WebElement openNewTabButton;

    @FindBy(id = "alert-button")
    private WebElement alertButton;

    @Override
    public SwitchWindowPage open() {
        driver.get(URL);
        return this;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {

    }

    public SwitchWindowPage clickOpenNewTabButtonAndSwitchToIt() {
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        openNewTabButton.click();
        driver.getWindowHandles().forEach(h -> driver.switchTo().window(h));
        return this;
    }

    public SwitchWindowPage checkSwitchedTab(String expectedUrl) throws ValidationExceptions.WrongElementStateException {
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        String currentUrl = driver.getCurrentUrl();

        if (!expectedUrl.equals(currentUrl)) {
            throw new ValidationExceptions.WrongElementStateException("Wrong tab switch!");
        }

        return this;
    }

    public SwitchWindowPage clickAlertButtonAndSwitchToIt() {
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }

}
