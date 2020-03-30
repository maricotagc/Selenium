package org.moita;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.moita.cucumberPage.CucumberPageElements;
import org.moita.cucumberPage.CucumberPageRunner;
import org.moita.utilities.DriverFactory;
import org.openqa.selenium.By;
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

//    @After
//    public void setDown() {
//        this.driver.close();
//    }

    @Test
    public void shouldReturnUserName() {

        // given
        String expectedUserName = "Automation Moita";

        // when
        String userName = test.getUserName();

        // then
        Assert.assertEquals(expectedUserName, userName);
    }

    @Test
    public void shouldSetUserName() {
        // given
        String expectedUserName = "Moita Auto Test";

        // when
        test.setUserName("Moita Auto Test");
        String userName = test.getUserName();

        // then
        Assert.assertEquals(expectedUserName, userName);
    }

    @Test
    public void shouldReturnCurrentUserRole() {

        //given
        String expectedUserRole = "qalead";

        //When
        String userRole = test.getUserRole();

        //Then
        Assert.assertEquals(expectedUserRole, userRole);
    }

    @Test
    public void shouldUpdateUserRole() {

        //given
        String expectedNewUserRole = "pm";

        //when
        test.selectUserRole(expectedNewUserRole);

        //then
        Assert.assertEquals(expectedNewUserRole, test.getUserRole());
    }

    @Test
    public void shouldOpenPasswordUpdatePage() {
        //given
        String newPassword = "@Rapha1978";
        String currentPassword = "@Rapha1977";

        //when
        test.changeEmailOrPassword(newPassword, currentPassword);

        //then
        Assert.assertEquals("https://studio.cucumber.io/profile", driver.getCurrentUrl());
        System.out.println("THE END");
    }
}