//Example 1

//Importing settings from Config class
String projectPath = System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");

//New instance of webdriver
WebDriver driver = new ChromeDriver();
driver.get("https://www.selenium.dev/");
driver.close();


//Example 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver
{
    public static WebDriver getChromeDriver()
    {
        //Key-value pointing in memory where driver is located
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        //Declaration of browser language
        options.addArguments("−−lang=es");

        //Declaration of new driver (Chrome) instance which will be used in every test
        WebDriver driver = new ChromeDriver(options);

        //Set up of wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Maximization of window will not be necessary as we already have this done on "options.addArguments("start-fullscreen");"
        //        driver.manage().window().maximize();

        return driver;
    }
}
