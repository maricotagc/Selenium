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

1. Class Name - Sintax: driver.findElement(By.className(“classValue”))
![ClassName Example](https://github.com/maricotagc/Selenium/blob/master/images/className.png)
2. CSS Selector - Sintax: driver.findElement(By.cssSelector(“cssValue”))
3. Id - Sintax: driver.findElement(By.id(“IdValue”))
![Id Example](https://github.com/maricotagc/Selenium/blob/master/images/id.jpg)
4. Name - it may or may not have a unique value. If there are WebElements with the same name, the locator selects the first element with that Name on the page. Sintax: driver.findElement(By.name(“nameValue”)) 
![Name Example](https://github.com/maricotagc/Selenium/blob/master/images/name.jpg)
5. Link Text - can only be used for elements that have an anchor(a) tag. Sintax: driver.findElement(By.linkText(“textofLink”)).
![Link Text](https://github.com/maricotagc/Selenium/blob/master/images/linkText.png)
* DOM structure of the same: 
< a href="https://www.lambdatest.com/automation-testing" class="desktop:block  desktop:ml-0 desktop:mt-10 nav-link inline-block py-5 text-size-14 font-medium ml-30 fromipad:ml-20 "> ***Automation*** < / a>
* The desired WebElement was located using the linkText locator in Selenium: driver.findElement(By.linkText("***Automation***"));
6. Partial Link text - preferred when the link text is too long. Using this can also be to locate multiple links on a page with a common partial text. Sintax: driver.findElement(By.partialLinkText(“PartialTextofLink”)) 
* DOM structure of the element: 
< a href="https://www.lambdatest.com/test-on-ios-devices">***Test on iOS Simulator*** < /a>
* The desired WebElement was located using the linkText locator in Selenium: driver.findElement(By.partialLinkText ("***Simulator***"));
7. Tag Name - Sintax: driver.findElement(By.tagName(“htmlTag”))
8. XPath - Sintax: driver.findElement(By.xpath(“xpathValue”))

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

