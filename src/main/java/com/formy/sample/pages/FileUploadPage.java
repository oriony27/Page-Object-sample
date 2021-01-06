package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends HomePage {

    public FileUploadPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "file-upload-field")
    private WebElement uploadInput;

    @FindBy(xpath = "//button[@class='btn btn-warning btn-reset']")
    private WebElement resetButton;

    @Override
    public FileUploadPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return "https://formy-project.herokuapp.com/fileupload";
    }

    public FileUploadPage uploadFile(String pathToFile) {
        uploadInput.sendKeys(pathToFile);
        return this;
    }

    public FileUploadPage resetUploadedFile() throws ValidationExceptions.WrongElementStateException {
        resetButton.click();

        if (StringUtils.isNotEmpty(uploadInput.getText())) {
            throw new ValidationExceptions.WrongElementStateException("Upload input still keeps the file!");
        }

        return this;
    }
}
