package com.formy.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(css = "body > div > div > li >a")
    private List<WebElement> links;

    @Override
    public MainPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return "https://formy-project.herokuapp.com/";
    }

    public MainPage goToPage(String name) {
        links.stream().filter(item -> item.getText().contains(name)).findFirst().ifPresent(WebElement::click);
        return this;
    }
}
