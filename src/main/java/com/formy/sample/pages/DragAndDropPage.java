package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage extends HomePage{

    public DragAndDropPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "image")
    private WebElement image;

    @FindBy(id = "box")
    private WebElement dropPlace;

    @Override
    public DragAndDropPage open() {
        super.open();
        return this;
    }

    @Override
    public String getUrl() {
        return "https://formy-project.herokuapp.com/dragdrop";
    }

    public DragAndDropPage dragAndDropImage() throws ValidationExceptions.WrongElementStateException {
        Actions action = new Actions(getWebDriver());
        action.dragAndDrop(image, dropPlace).build().perform();

        String text = dropPlace.getText();

        if (!"Dropped!".equals(text)) {
            throw new ValidationExceptions.WrongElementStateException("Wrong state of Drag and Drop!");
        }

        return this;
    }
}
