package com.formy.sample.pages;

import com.codeborne.selenide.SelenideElement;
import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends HomePage {
    private static final String URL = "https://formy-project.herokuapp.com";

    public MainPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body > div > div > li >a")
    private List<SelenideElement> links;

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
        links.stream().filter(item -> item.getText().contains(name)).findFirst().ifPresent(SelenideElement::click);
        return this;
    }
}
