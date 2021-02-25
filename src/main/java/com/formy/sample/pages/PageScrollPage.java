package com.formy.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.SCROLL_PAGE;

public class PageScrollPage extends MainPage {

    public PageScrollPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "name")
    private WebElement fullNameInput;

    @FindBy(id = "date")
    private WebElement dateInput;

    @Override
    public PageScrollPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return SCROLL_PAGE.getPageUrl();
    }

    public PageScrollPage scrollToFullNameInput() {
        Actions action = new Actions(getWebDriver());
        action.moveToElement(fullNameInput);

        return this;
    }
}
