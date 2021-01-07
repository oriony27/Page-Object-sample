package com.formy.sample.pages;

import com.formy.sample.utils.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutocompletePage extends HomePage {

    public AutocompletePage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "autocomplete")
    private WebElement autocompleteInput;

    @FindBy(className = "pac-item")
    private WebElement autocompleteData;

    @Override
    public AutocompletePage open() {
         super.open();
         return this;
    }

    @Override
    public String getUrl() {
        return "https://formy-project.herokuapp.com/autocomplete";
    }

    public AutocompletePage autocomplete(String text) {
        autocompleteInput.sendKeys(text);
        WaitUtils.explicitWait(getWebDriver(), ExpectedConditions.visibilityOfAllElements(autocompleteData));
        autocompleteData.click();
        return this;
    }
}