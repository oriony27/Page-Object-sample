package com.formy.sample.pages;

import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatepickerPage extends HomePage {
    private static final String URL = "https://formy-project.herokuapp.com/datepicker";
    private WebDriver driver;

    public DatepickerPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "datepicker")
    private WebElement datePicker;

    @Override
    public DatepickerPage open() {
        driver.get(URL);
        return this;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {

    }

    public DatepickerPage selectDateInDatepicker(String date) {
        datePicker.sendKeys(date);
        datePicker.sendKeys(Keys.RETURN);
        return this;
    }

    public DatepickerPage isRightDateSelected(String expectedDate) throws ValidationExceptions.WrongElementStateException {
        String text = datePicker.getText();

        if (!expectedDate.equals(text)) {
            throw new ValidationExceptions.WrongElementStateException("Wrong date selected!");
        }

        return this;
    }
}
