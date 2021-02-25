package com.formy.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.formy.sample.enumeration.PageUrls.COMPLETE_WEB_FORM_PAGE;

public class CompleteWebFormPage extends MainPage {

    public CompleteWebFormPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "job-title")
    private WebElement jobTitleInput;

    @FindBy(id = "radio-button-1")
    private WebElement highSchoolRadio;

    @FindBy(id = "checkbox-3")
    private WebElement preferNotToSayCheckbox;

    @FindBy(id = "select-menu")
    private WebElement yearsOfExperienceDropdown;

    @FindBy(id = "datepicker")
    private WebElement datepicker;

    @FindBy(css = ".btn")
    private WebElement submitButton;

    @Override
    public CompleteWebFormPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return COMPLETE_WEB_FORM_PAGE.getPageUrl();
    }

    public CompleteWebFormPage fillFirstNameInput(String text) {
        firstNameInput.sendKeys(text);
        return this;
    }

    public CompleteWebFormPage fillLastNameInput(String text) {
        lastNameInput.sendKeys(text);
        return this;
    }

    public CompleteWebFormPage fillJobTitleInput(String text) {
        jobTitleInput.sendKeys(text);
        return this;
    }

    public CompleteWebFormPage selectHighSchoolRadio() {
        highSchoolRadio.click();
        return this;
    }

    public CompleteWebFormPage clickPreferNotToSayCheckbox() {
        preferNotToSayCheckbox.click();
        return this;
    }

    public CompleteWebFormPage selectYearsOfExperienceDropdownValue(String option) {
        Select options = new Select(yearsOfExperienceDropdown);
        options.selectByVisibleText(option);
        return this;
    }

    public CompleteWebFormPage chooseDateInDatepicker(String date) {
        datepicker.sendKeys(date);
        return this;
    }

    public CompleteWebFormPage clickCompleteButton() {
        submitButton.click();
        return this;
    }
}
