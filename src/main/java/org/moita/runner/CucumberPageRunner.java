package org.moita.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.moita.utilities.Config.*;

public class CucumberPageRunner {

    private WebDriver driver;

    public CucumberPageRunner(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
//        WebDriver driver = DriverFactory.create();
        CucumberPageElements elements = new CucumberPageElements(driver);

        WebElement cucumberLogin = elements.titleButton();
        cucumberLogin.click();

        WebElement googleLogin = elements.googleLoginButton();
        googleLogin.click();

        WebElement googleUser = elements.googleUser();
        googleUser.sendKeys(EMAIL);

        WebElement emailNextButton = elements.emailNextButton();
        emailNextButton.click();

        WebElement googlePassword = elements.googlePassword();
        googlePassword.sendKeys(PASSWORD);

        WebElement passwordNextButton = elements.passwordNextButton();
        passwordNextButton.click();
    }

    public String getUserName() {
        CucumberPageElements elements = new CucumberPageElements(driver);

        WebElement closeWelcomePanel = elements.closeWelcomePanelButton();
        closeWelcomePanel.click();

        WebElement userSection = elements.userSection();
        userSection.click();

        WebElement profileSection = elements.profileSection();
        profileSection.click();

        WebElement userNameField = elements.userName();
        return userNameField.getAttribute("value");
    }

}
