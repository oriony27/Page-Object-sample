package com.formy.sample.pages;

import com.codeborne.selenide.SelenideElement;
import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ButtonsPage extends HomePage {
    private static final String URL = "https://formy-project.herokuapp.com/buttons";

    public ButtonsPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
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
        driver.get(URL);
        return this;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {
        if (!driver.getCurrentUrl().equals(URL)) {
            throw new ValidationExceptions.WrongPageOpenedException("Wrong page URL!");
        }
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
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        dropdownData.stream().filter(item -> item.getText().contains(option)).findFirst().ifPresent(WebElement::click);
        return this;
    }

    public ButtonsPage isDropdownContainsAllValues(List<String> values) throws ValidationExceptions.WrongElementStateException {
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        List<String> dropdownValues = dropdownData.stream().map(WebElement::getText).collect(Collectors.toList());

        if (!values.containsAll(dropdownValues)) {
            throw new ValidationExceptions.WrongElementStateException("Dropdown contains not all expected elements!");
        }
        return this;
    }
}