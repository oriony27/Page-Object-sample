package com.formy.sample.pages;

import com.formy.sample.enumeration.Components;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.formy.sample.enumeration.PageUrls.DROPDOWN_PAGE;

public class DropdownPage extends MainPage {

    public DropdownPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "dropdownMenuButton")
    private WebElement dropdown;

    @FindBy(css = "div[aria-labelledby='dropdownMenuButton'] > [href='/buttons']")
    private WebElement buttonsOption;

    @Override
    public DropdownPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return DROPDOWN_PAGE.getPageUrl();
    }

    public DropdownPage clickAndSelectButtonsFromDropdown() {
        dropdown.click();
        buttonsOption.click();
        return this;
    }
}