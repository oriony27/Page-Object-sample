package com.formy.sample.pages;

import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage extends BasePage{
    private static final String URL = "https://formy-project.herokuapp.com/dragdrop";
    private WebDriver driver;

    public DragAndDropPage() {
        driver = WebDriverConfiguration.getWebDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "image")
    private WebElement image;

    @FindBy(id = "box")
    private WebElement dropPlace;

    @Override
    public DragAndDropPage open() {
        driver.get(URL);
        return this;
    }

    @Override
    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {

    }

    public DragAndDropPage dragAndDropImage() throws ValidationExceptions.WrongElementStateException {
        Actions action = new Actions(driver);
        action.dragAndDrop(image, dropPlace).build().perform();

        String text = dropPlace.getText();

        if (!"Dropped!".equals(text)) {
            throw new ValidationExceptions.WrongElementStateException("Wrong state of Drag and Drop!");
        }

        return this;
    }
}
