package com.formy.sample.pages;

import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends HomePage {
    public static final String URL = "https://formy-project.herokuapp.com/";

    public MainPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body > div > div > li >a")
    private List<WebElement> links;

    @Override
    public MainPage open() {
        driver.get(URL);
        return this;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {
        if (!driver.getCurrentUrl().equals(URL)) {
            throw new ValidationExceptions.WrongPageOpenedException("Wrong page URL!");
        }
    }

    public MainPage goToPage(String name) {
        links.stream().filter(item -> item.getText().contains(name)).findFirst().ifPresent(WebElement::click);
        return this;
    }
}
