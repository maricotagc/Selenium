# Selenium
My notes regarding Selenium framework which automates web browser testing.

[Selenium Official GitHub](https://github.com/SeleniumHQ)

[Selenium Installation](https://www.selenium.dev/documentation/en/selenium_installation/)

[Selenium API Documentation](https://www.selenium.dev/selenium/docs/api/java/): Commands to manipulate WebDriver.

## Webdriver

It is an API which emulates browsers using the Selenium server. Each browser has its own driver (Chrome, FireFox, Safari, etc).
* [ChromeDriver](https://sites.google.com/chromium.org/driver/)
* [WebDriver Official Documentation](https://www.w3.org/TR/webdriver1/)

### Declaration

[Code Example](/codeExamples/WebdriverDeclaration.java)

### Possible Locators

1. Class Name - Example: driver.findElement(By.className(“classValue”))
2. CSS Selector - Example: driver.findElement(By.cssSelector(“cssValue”))
3. Id - Example: driver.findElement(By.id(“IdValue”))
4. Name - Example: driver.findElement(By.name(“nameValue”))
5. Link Text - Example: driver.findElement(By.linkText(“textofLink”))
6. Partial Link text - Example: driver.findElement(By.partialLinkText(“PartialTextofLink”)) 
7. Tag Name - Example: driver.findElement(By.tagName(“htmlTag”))
8. XPath - Example: driver.findElement(By.xpath(“xpathValue”))

#### XPATH

* Syntax: //tag[@attribute='value']
* Wild card: //*[@id='navbar']
* Single slash: looks for element immediately inside the parent element
* Double slash: look for any child or nested element inside the parent element
* Dev Tools console: $x(".//*[@id='leftColumn']/div[1]/div[1]/div[1]/div[1]/article/div[1]/span");
* [XPATH Examples](/codeExamples/XpathExamples.java)

### Frequent Actions

1. [Navigation to URL](/codeExamples/Navigation.java)
2. [Maximize browser](/codeExamples/MaximizeBrowser.java)
3. [Set an element’s text](/codeExamples/SetElementText.java)
4. [Clicking on an element](/codeExamples/Click.java)
5. [Explicit Wait](/codeExamples/ExplicityWait.java) [Explanation in video](https://www.youtube.com/watch?v=UN8cauyoZsk) used for specific elements/conditions (ex.: until clickable).It comprehends only specific element.
6. [Implicit Wait](/codeExamples/ImplicityWait.java) [Explanation in video](https://www.youtube.com/watch?v=UN8cauyoZsk) used to define a period of time until the webdriver throws "No Such Element" exception. It comprehends the entire session.
7. [Keyboard Actions](https://www.selenium.dev/documentation/en/webdriver/keyboard/)
8. [Reading Element's Value](/codeExamples/ReadElementValue.java)
9. [Other Examples](https://www.selenium.dev/documentation/en/webdriver/browser_manipulation/)

### JavaScriptExecutor

Used when Selenium Webdriver fails do click on any element due to some issue.

[Code Example](/codeExamples/JavaScriptExecutor.java)

