package com.formy.sample.config;

import com.formy.sample.enumeration.SupportedDrivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class WebDriverConfiguration {

    private static WebDriver driverInstance;

    private WebDriverConfiguration() {
        throw new IllegalStateException("This is static class!");
    }

    public static WebDriver setWebDriver(SupportedDrivers driver) {
        if (driverInstance != null) return driverInstance;

        String driverName = driver.getDriverName();

        switch (driverName) {
            case "chrome": {
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driverInstance = new ChromeDriver(chromeOptions);
                return driverInstance;
            }

            default: {
                throw new IllegalStateException("This browser isn't supported!");

            }
        }
    }

    public static WebDriver getWebDriver() {
        return driverInstance;
    }

    public static void tearDown() {
        if (driverInstance != null) driverInstance.quit();
    }
}