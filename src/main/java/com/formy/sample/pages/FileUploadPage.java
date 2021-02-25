package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.FILE_UPLOAD_PAGE;

public class FileUploadPage extends MainPage {

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
        return FILE_UPLOAD_PAGE.getPageUrl();
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
