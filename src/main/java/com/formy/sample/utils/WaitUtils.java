package com.formy.sample.utils;

import com.formy.sample.config.WaitConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public final class WaitUtils {
    private static WaitConfiguration waitConfig;

    public WaitUtils(WaitConfiguration waitConfiguration) {
        waitConfig = waitConfiguration;
    }

    public static void setWaitConfiguration(WaitConfiguration waitConfiguration) {
        waitConfig = waitConfiguration;
    }

    public static void implicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(waitConfig.getDefaultImplicitTimeout(), waitConfig.getDefaultImplicitTimeUnit());
    }

    public static void waitForPageLoad(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(waitConfig.getDefaultExplicitTimeout(), waitConfig.getDefaultImplicitTimeUnit());
    }

    public static <V> void explicitWait(WebDriver driver, Function<? super WebDriver, V> condition) {
        WebDriverWait wait = new WebDriverWait(driver, waitConfig.getDefaultExplicitTimeout());
        wait.until(condition);
    }
}
