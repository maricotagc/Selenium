# Selenium
My notes regarding Selenium framework which automates web browser testing.

[Selenium Official GitHub](https://github.com/SeleniumHQ)

[Selenium Installation](https://www.selenium.dev/documentation/en/selenium_installation/)

[Selenium API Documentation](https://www.selenium.dev/selenium/docs/api/java/): Commands to manipulate WebDriver.

## Webdriver

It is an API which emulates browsers using the Selenium server. Each browser has its own driver (Chrome, FireFox, Safari, etc).
* [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
* [WebDriver Official Documentation](https://www.w3.org/TR/webdriver1/)

### Declaration

[Code Example](/codeExamples/WebdriverDeclaration.java)

### Locators
![](/images/locators1.jpg)

Xpath Syntax: //tag[@attribute='value']


[XPATH Examples](/codeExamples/XpathExamples.java)

### Frequent Actions

1. [Navigation to URL](/codeExamples/Navigation.java)
2. [Maximize browser](/codeExamples/MaximizeBrowser.java)
3. [Set an element’s text](/codeExamples/SetElementText.java)
4. [Clicking on an element](/codeExamples/Click.java)
5. [Expect Conditions -Explicit](/codeExamples/ExplicityWait.java): They allow your code to halt program execution, or freeze the thread, until the condition you pass it is resolved.
6. [Expect Conditions -Implicit](/codeExamples/ImplicityWait.java)
7. [Keyboard Actions](https://www.selenium.dev/documentation/en/webdriver/keyboard/)
8. [Reading Element's Value](/codeExamples/ReadElementValue.java)
9. [Other Examples](https://www.selenium.dev/documentation/en/webdriver/browser_manipulation/)

### JavaScriptExecutor

Used when Selenium Webdriver fails do click on any element due to some issue.

[Code Example](/codeExamples/JavaScriptExecutor.java)

