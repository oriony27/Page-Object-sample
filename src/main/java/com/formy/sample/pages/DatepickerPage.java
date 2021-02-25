package com.formy.sample.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.DATEPICKER_PAGE;

public class DatepickerPage extends MainPage {

    public DatepickerPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "datepicker")
    private WebElement datePicker;

    @Override
    public DatepickerPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return DATEPICKER_PAGE.getPageUrl();
    }

    public DatepickerPage selectDateInDatepicker(String date) {
        datePicker.sendKeys(date);
        datePicker.sendKeys(Keys.RETURN);
        return this;
    }
}
