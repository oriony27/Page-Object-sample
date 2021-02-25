package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.utils.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

import static com.formy.sample.enumeration.PageUrls.BUTTONS_PAGE;

public class ButtonsPage extends MainPage {

    public ButtonsPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(css = "form .col-sm-8 > .btn-primary")
    private WebElement primaryButton;

    @FindBy(css = ".btn-link")
    private WebElement link;

    @FindBy(css = "button.dropdown-toggle")
    private WebElement dropdown;

    @FindBy(css = "div[aria-labelledby='btnGroupDrop1'] > a")
    private List<WebElement> dropdownData;

    @Override
    public ButtonsPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return BUTTONS_PAGE.getPageUrl();
    }

    public ButtonsPage clickPrimaryButton() {
        primaryButton.click();
        return this;
    }

    public ButtonsPage clickLink() {
        link.click();
        return this;
    }

    public ButtonsPage clickDropdownAndSelectOption(String option) {
        dropdown.click();
        WaitUtils.implicitWait(getWebDriver());
        dropdownData.stream().filter(item -> item.getText().contains(option)).findFirst().ifPresent(WebElement::click);
        return this;
    }

    public ButtonsPage isDropdownContainsAllValues(List<String> values) throws ValidationExceptions.WrongElementStateException {
        dropdown.click();
        WaitUtils.implicitWait(getWebDriver());
        List<String> dropdownValues = dropdownData.stream().map(WebElement::getText).collect(Collectors.toList());

        if (!values.containsAll(dropdownValues)) {
            throw new ValidationExceptions.WrongElementStateException("Dropdown contains not all expected elements!");
        }
        return this;
    }
}