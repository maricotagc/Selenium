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
        String newPassword = "@Brasil2011";

        //when
        test.changeEmailOrPassword(newPassword, "@Brasil2010");
//        System.out.println("VALOR DO CAMPO OLD PASSWORD: " + driver.findElement(By.id("user_current_password")).getText());

        //then
        Assert.assertEquals(newPassword, driver.findElement(By.id("user_current_password")).getText());

        //TODO create new google account and sig up for cucumber for the first time m.aricotagc@gmail.com

    }
}