package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.utils.WaitUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.SWITCH_WINDOW_PAGE;

public class SwitchWindowPage extends MainPage {

    public SwitchWindowPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "new-tab-button")
    private WebElement openNewTabButton;

    @FindBy(id = "alert-button")
    private WebElement alertButton;

    @Override
    public SwitchWindowPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return SWITCH_WINDOW_PAGE.getPageUrl();
    }

    public SwitchWindowPage clickOpenNewTabButtonAndSwitchToIt() {
        WaitUtils.waitForPageLoad(getWebDriver());
        openNewTabButton.click();
        getWebDriver().getWindowHandles().forEach(h -> getWebDriver().switchTo().window(h));
        return this;
    }

    public SwitchWindowPage checkSwitchedTab(String expectedUrl) throws ValidationExceptions.WrongElementStateException {
        WaitUtils.waitForPageLoad(getWebDriver());
        String currentUrl = getWebDriver().getCurrentUrl();

        if (!expectedUrl.equals(currentUrl)) {
            throw new ValidationExceptions.WrongElementStateException("Wrong tab switch!");
        }

        return this;
    }

    public SwitchWindowPage clickAlertButtonAndSwitchToIt() {
        alertButton.click();
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
        return this;
    }

}
