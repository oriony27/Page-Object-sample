package com.formy.sample.pages;

import com.formy.sample.exceptions.ValidationExceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.formy.sample.enumeration.PageUrls.DRAG_AND_DROP_PAGE;

public class DragAndDropPage extends MainPage{

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
        return DRAG_AND_DROP_PAGE.getPageUrl();
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
