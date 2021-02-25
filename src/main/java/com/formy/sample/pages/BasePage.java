package com.formy.sample.pages;

import com.formy.sample.config.WaitConfiguration;
import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.utils.WaitUtils;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public BasePage() {
        WaitConfiguration waitConfiguration = new WaitConfiguration.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(2) //set default timeout for implicit wait, 2 seconds
                .setDefaultExplicitTimeout(2) //set default timeout for explicit wait, 2 seconds
                .build();

        WaitUtils.setWaitConfiguration(waitConfiguration);
    }

    public BasePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

    public WebDriver getWebDriver() {
        return WebDriverConfiguration.getWebDriver();
    }

    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {
        String currentUrl = getWebDriver().getCurrentUrl();
        if (!currentUrl.equals(getUrl())) {
            throw new ValidationExceptions.WrongPageOpenedException(MessageFormat.format("Wrong URL is open! Expected {2}. Actual {1}", getUrl(), currentUrl));
        }
    }

    public abstract String getUrl();
}
