package com.formy.sample.pages;

import com.formy.sample.enumeration.Components;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DropdownPage extends HomePage {

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
        return "https://formy-project.herokuapp.com/dropdown";
    }

    public DropdownPage clickAndSelectButtonsFromDropdown() {
        dropdown.click();
        buttonsOption.click();
        return this;
    }
}