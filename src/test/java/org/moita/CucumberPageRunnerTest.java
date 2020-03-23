package org.moita;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.moita.runner.CucumberPageRunner;
import org.moita.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CucumberPageRunnerTest {

    private WebDriver driver;
    private CucumberPageRunner test;

    @Before
    public void setUp() {
        this.driver = DriverFactory.create();
        this.test = new CucumberPageRunner(driver);
    }

    @Test
    public void shouldReturnUserName() {
        test.login();
        Assert.assertEquals(test.getUserName(), "Mariana González Camargo");
        driver.close();
    }
}
