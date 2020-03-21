# Selenium
My notes regarding Selenium framework which automates web browser testing.

[Selenium Official GitHub](https://github.com/SeleniumHQ)

[Selenium Installation](https://www.selenium.dev/documentation/en/selenium_installation/)

[Selenium API Documentation](https://www.selenium.dev/selenium/docs/api/java/): Commands to manipulate WebDriver.

## Webdriver

It is an API which emulates browsers using the Selenium server. Each browser has its own driver (Chrome, FireFox, Safari, etc).
* [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
* [WebDriver Official Documentation](https://www.w3.org/TR/webdriver1/)

### Locators
![](/images/locators1.jpg)

### Frequent Actions

#### Set an element’s text
```java
String name = "Mariana Moita";
driver.findElement(By.name("name")).sendKeys(name);
```
#### Clicking
```java
driver.findElement(By.id("login")).click();
```
