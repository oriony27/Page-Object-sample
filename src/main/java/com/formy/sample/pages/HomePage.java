package com.formy.sample.pages;

import com.formy.sample.enumeration.Components;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//a[@id='logo']")
    private WebElement logo;

    @FindBy(xpath = "//a[.='Form']")
    private WebElement form;

    @FindBy(css = "#navbarDropdownMenuLink")
    private WebElement components;

    @FindBy(css = ".dropdown-menu.show a")
    private List<WebElement> dropdownMenu;

    @Override
    public HomePage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        throw new NotImplementedException();
    }

    public void clickLogo() {
        logo.click();
    }

    public void goToForm() {
        form.click();
    }

    protected void navigateToComponent(Components compName) {
        String component = compName.getLinkName();
        components.click();

        dropdownMenu.stream().filter(item -> item.equals(component)).findFirst().ifPresent(WebElement::click);
    }
}
