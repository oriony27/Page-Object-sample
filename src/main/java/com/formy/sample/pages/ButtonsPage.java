package com.formy.sample.pages;

import com.codeborne.selenide.SelenideElement;
import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ButtonsPage extends HomePage {
    private static final String URL = "https://formy-project.herokuapp.com/buttons";

    public ButtonsPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "form .col-sm-8 > .btn-primary")
    private SelenideElement primaryButton;

    @FindBy(css = ".btn-link")
    private SelenideElement link;

    @FindBy(css = "button.dropdown-toggle")
    private SelenideElement dropdown;

    @FindBy(className = ".dropdown-menu.show")
    private List<SelenideElement> dropdownData;

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

    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public void clickDropdownAndSelectOption(String option) {
        dropdown.click();
        PageFactory.initElements(driver, this);
        dropdownData.stream().filter(item -> item.getText().contains(option)).findFirst().ifPresent(SelenideElement::click);
    }

    public void isDropdownContainsAllValues(List<String> values) {
        dropdown.click();
        PageFactory.initElements(driver, this);
        //TODO add validation and exception throw
        values.containsAll(dropdownData.stream().map(SelenideElement::getText).collect(Collectors.toList()));
    }
}