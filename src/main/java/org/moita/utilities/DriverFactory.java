package org.moita.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.moita.utilities.Config.*;

public class DriverFactory {

    public static WebDriver create() {
        //Java select up which receives create to be used within the test and it's location
        System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH);

        //Declaration of browser language
        ChromeOptions options = new ChromeOptions();
        options.addArguments(LANG_EN);

        //Declaration of new driver (Chrome) instance which will be used in every test
        WebDriver driver = new ChromeDriver(options);

        //Set up of wait and window maximization
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}
