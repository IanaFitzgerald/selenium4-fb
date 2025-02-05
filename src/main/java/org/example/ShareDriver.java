package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * * The ShareDriver class is a utility class designed to manage a shared instance of WebDriver.
 * It ensures that only one instance of WebDriver is created and reused throughout the application,
 * providing methods to initialize, retrieve, and close the WebDriver instance.
 */
public class ShareDriver {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();//раздвинет браузер на полный экран и видны все элементы


        }
        return webDriver;

    }

    public static void closeDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}

