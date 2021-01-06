package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.utils.WaitUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalPage extends HomePage {

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
        return "https://formy-project.herokuapp.com/modal";
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

    public ModalPage isModalClosed() throws ValidationExceptions.WrongElementStateException {
        WaitUtils.implicitWait(getWebDriver());
        if (!closeModalButton.isDisplayed()) {
            throw new ValidationExceptions.WrongElementStateException("Modal displayed!");
        }

        return this;
    }
}
