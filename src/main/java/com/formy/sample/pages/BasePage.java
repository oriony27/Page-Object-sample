package com.formy.sample.pages;

import com.formy.sample.config.WaitConfiguration;
import com.formy.sample.config.WebDriverConfiguration;
import com.formy.sample.exceptions.ValidationExceptions;
import com.formy.sample.utils.WaitUtils;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public BasePage() {
        WaitConfiguration waitConfiguration = new WaitConfiguration.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(2)
                .setDefaultExplicitTimeout(2)
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
        if (!getWebDriver().getCurrentUrl().equals(getUrl())) {
            throw new ValidationExceptions.WrongPageOpenedException("Wrong page URL!");
        }
    }

    public abstract String getUrl();
}
