package org.moita.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.moita.utilities.Config.*;

public class DriverFactory {

    public static WebDriver create() {
        //Java set up which receives create to be used within the test and it's location
        System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH);

        //Selenium set up for executing test in specific browser language
        ChromeOptions options = new ChromeOptions();
        options.addArguments(LANG_EN);

        //Instance of the create test will use in every action
        WebDriver driver = new ChromeDriver(options);

        //Set up of create in order to start test runner
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}
