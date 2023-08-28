package org.moita.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.moita.utilities.Config.*;

public class DriverFactory {

    public static WebDriver creation() {
        ChromeOptions options = new ChromeOptions();
        //For executing test in specific browser language
        options.addArguments(LANG_EN);

        //Instance of the create test will use in every action
        WebDriver driver = new ChromeDriver(options);

        //Windows minimization
        driver.manage().window().minimize();
        
        //Windows maximization and timeout
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}
