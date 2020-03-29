package org.moita;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.moita.cucumberPage.CucumberPageElements;
import org.moita.cucumberPage.CucumberPageRunner;
import org.moita.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CucumberPageRunnerTest {

    private WebDriver driver;
    private CucumberPageRunner test;

    @Before
    public void setUp() {
        this.driver = DriverFactory.create();
        this.test = new CucumberPageRunner(new CucumberPageElements(driver));
        this.test.login();
        this.test.navigateToUserProfile();
    }

    @After
    public void setDown() {
        this.driver.close();
    }

    @Test
    public void shouldReturnUserName() {

        // given
        String expectedUserName = "Mariana González Camargo";

        // when
        String userName = test.getUserName();

        // then
        Assert.assertEquals(expectedUserName, userName);
    }

    @Test
    public void shouldSetUserName() {
        // given
        String expectedUserName = "Raphael Moita";

        // when
        test.setUserName("Raphael Moita");
        String userName = test.getUserName();

//        // then
        Assert.assertEquals(expectedUserName, userName);
    }

    @Test
    public void shouldReturnUserRoleNull() {

        //given
        String expectedUserRole = "other";

        //When

        String userRole = test.getUserRole();

        //Then

        Assert.assertEquals(expectedUserRole, userRole);
    }
}