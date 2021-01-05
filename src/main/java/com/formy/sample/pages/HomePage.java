package com.formy.sample.pages;

import com.codeborne.selenide.SelenideElement;
import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.enumeration.Components;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }


//    @FindBy(xpath = "//a[@id='logo']")
//    private SelenideElement logo;

//    @FindBy(xpath = "//a[.='Form']")
//    private SelenideElement form;
//
//    @FindBy(css = "#navbarDropdownMenuLink")
//    private SelenideElement components;
//
//    @FindBy(css = ".dropdown-menu.show")
//    private SelenideElement dropdownMenu;

    public void clickLogo() {
//        logo.click();
    }

    public void goToForm() {
//        form.click();
    }

    protected void navigateToComponent(Components components) {

    }


    @Override
    public HomePage open() {
        return null;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {

    }
}
