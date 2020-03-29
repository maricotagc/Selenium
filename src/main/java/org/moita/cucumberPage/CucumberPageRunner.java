package org.moita.cucumberPage;

import org.moita.utilities.InputWebElementManipulator;
import org.openqa.selenium.WebElement;

import static org.moita.utilities.Config.EMAIL;
import static org.moita.utilities.Config.PASSWORD;

public class CucumberPageRunner {

    private CucumberPageElements cucumberPageElements;

    public CucumberPageRunner(CucumberPageElements cucumberPageElements) {
        this.cucumberPageElements = cucumberPageElements;
    }

    public void login() {

        WebElement cucumberLogin = cucumberPageElements.titleButton();
        cucumberLogin.click();

        WebElement googleLogin = cucumberPageElements.googleLoginButton();
        googleLogin.click();

        WebElement googleUser = cucumberPageElements.googleUser();
        googleUser.sendKeys(EMAIL);

        WebElement emailNextButton = cucumberPageElements.emailNextButton();
        emailNextButton.click();

        WebElement googlePassword = cucumberPageElements.googlePassword();
        googlePassword.sendKeys(PASSWORD);

        WebElement passwordNextButton = cucumberPageElements.passwordNextButton();
        passwordNextButton.click();
    }

    public void navigateToUserProfile() {
        WebElement closeWelcomePanel = cucumberPageElements.closeWelcomePanelButton();
        closeWelcomePanel.click();

        WebElement userSection = cucumberPageElements.userSection();
        userSection.click();

        WebElement profileSection = cucumberPageElements.profileSection();
        profileSection.click();
    }

    public String getUserName() {

        WebElement userNameField = cucumberPageElements.userName();
        return InputWebElementManipulator.read(userNameField);
    }

    public void setUserName(String userName) {
        WebElement userNameField = cucumberPageElements.userName();
//        InputWebElementManipulator.clearInputElement(userNameField);
        InputWebElementManipulator.update(userNameField, userName);
    }

    public String getUserRole() {

        WebElement userRole = cucumberPageElements.userRole();
        return userRole.getAttribute("value");
    }

}
