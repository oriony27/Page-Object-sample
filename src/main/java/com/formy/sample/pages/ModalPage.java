package com.formy.sample.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.MODAL_PAGE;

public class ModalPage extends MainPage {

    public ModalPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "modal-button")
    private WebElement openModalButton;

    @FindBy(css = ".modal-body")
    private WebElement modalText;

    @FindBy(id = "close-button")
    private WebElement closeModalButton;

    @FindBy(id = "ok-button")
    private WebElement okButton;

    @FindBy(id = "span[aria-hidden='true']")
    private WebElement closeModalSpan;


    @Override
    public ModalPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return MODAL_PAGE.getPageUrl();
    }

    public ModalPage openModal() {
        openModalButton.click();
        return this;
    }

    public ModalPage checkCloseModal() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getWebDriver();
        javascriptExecutor.executeScript("arguments[0].click();", closeModalButton);
        return this;
    }
}
