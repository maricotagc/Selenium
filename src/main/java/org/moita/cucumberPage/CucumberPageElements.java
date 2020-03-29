package org.moita.cucumberPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CucumberPageElements {

    private static final String PAGE = "https://cucumber.io/docs";
    private WebDriver driver;

    public CucumberPageElements(WebDriver driver) {
        this.driver = driver;
        this.driver.get(PAGE);
    }

    public WebElement titleButton() {
        return driver.findElement(By.cssSelector("a[title='Login']"));
    }

    public WebElement googleLoginButton() {
        return driver.findElement(By.className("ht-btn--google"));
    }

    public WebElement googleUser() {
        return driver.findElement(By.id("identifierId"));
    }

    public WebElement emailNextButton() {
        return driver.findElement(By.id("identifierNext"));
    }

    public WebElement googlePassword() {
        return driver.findElement(By.cssSelector("#password input[type='password']"));
    }

    public WebElement passwordNextButton() {
        return driver.findElement(By.cssSelector("#passwordNext span[class='RveJvd snByac']"));
    }

    public WebElement closeWelcomePanelButton() {
       return driver.findElement(By.className("ht-icon--cross"));
    }

    public WebElement userSection() {
        return driver.findElement(By.id("ember772"));
    }

    public WebElement profileSection() {
        return driver.findElement(By.id("ember781"));
    }

    public WebElement userName() {
        return driver.findElement(By.id("profile-name"));
    }

    public WebElement userRoleDropdown() {
        return driver.findElement(By.className("ht-select"));
    }
}
