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
* DOM Structure: < button id="login-button" data-amplitude="" type="submit" ***class="btn btn-dark submit-btn"*** css="1">Login< / button>
* driver.findElement(By.className("submit-btn"));

2. CSS Selector - Sintax: driver.findElement(By.cssSelector(“cssValue”))
* Syntax by ID: css=(Html tag )(#) (value of the ID attribute)
  * DOM Structure: < ***input*** type="password" name="password" placeholder="Desired Password*" required="required" ***id="userpassword"*** minlength="8" class="form-control " aria-autocomplete="list" xpath="1" >
  * The desired WebElement was located using the CSS locator in Selenium: driver.findElement(By.cssSelector("input#userpassword"))

* Syntax by Tag and Attribute: css=(HTML Page)[Attribute=Value]
  * DOM Structure: <***input*** type="phone" placeholder="Phone*" ***name="phone"*** value="" class="form-control sign-up-input-2 ">
  * The desired WebElement was located using the CSS locator in Selenium: driver.findElement(By.cssSelector("input[name=\"phone\"]"))

* Syntax by Tag, Class, and Attribute: css=(HTML tag>)(. )(Class attribute value)([attribute=Value of attribute])
  * DOM Structure: < ***button*** data-sitekey="6LceAqQaAAAAAO0LcIgLnXy3gH_M3X5aDrqUihHw" ***data-callback="onSubmit"*** data-amplitude="R_signup" type="submit" ***class="btn btn-dark submit-btn g-recaptcha"*** css="1">Free Sign Up < /button >
  * The desired WebElement was located using the CSS locator in Selenium: driver.findElement(By.cssSelector("button.submit-btn[data-callback=\"onSubmit\"]"));
  
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
* Syntax: //tagname[@attribute = 'value']
  * TagName (attribute) can be input tag, anchor tag, id tag, Name tag, class tag, etc.
  * [XPATH Examples](/codeExamples/XpathExamples.java)

![Xpath Example 1](https://github.com/maricotagc/Selenium/blob/master/images/xpath1.png)
- DOM structure: < ***input*** type="email" ***name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
- The desired WebElement was located using the Xpath locator in Selenium: driver.findElement(By.xpath("//input[@name= ’email’]"));
9. XPath Contains: used on WebElements whose value is changing dynamically
* Syntax: //tagname[contains(@attribute, ‘partial value of attribute’)]
- DOM Structure: < ***input*** type="text" placeholder="Full Name*" name="name" value="" ***class="form-control sign-up-input-2*** " >
- The desired WebElement was located using the Xpath Contains locator in Selenium: driver.findElement(By.xpath("//input[contains(@class, ‘form-control’)]"))
10. XPath using ‘AND’ & ‘OR’: used when locating a WebElement based on certain condition sets. 
* Syntax of OR: //input[@id='login_1' OR @name='login’]
* Syntax of AND: //input[@id='login_1' AND @name='login’] 
  * DOM Structure: < input ***type="email" name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  * The desired WebElement was located using the Xpath AND locator in Selenium: driver.findElement(By.xpath("//input[@type='email' AND @name='email']"

11. Xpath Text: used when elements have to be located by looking into the tags containing certain text.
* Syntax: //div[text()='Logged In']
  * DOM Structure: < button class="btn btn-dark submit-btn g-recaptcha">Free Sign Up < /button >
  * The desired WebElement is located using the Xpath Text locator in Selenium: driver.findElement(By.xpath("//button[text()='Free Sign Up']"))

### Tricks
* Wild (*, ^ and $) in CSS for classes
  *  Starts-With
  *  Syntax: css=(HTML tag)([attribute^=start of the string])
  *  DOM: < input type="email" ***name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  *  The desired WebElement is located using: driver.findElement(By.cssSelector("input[name ***^='em'***]"));

  *  Ends-With
  *  Syntax: css=(HTML tag)([attribute$=end of the string])
  *  DOM: < input type="email" ***name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  *  The desired WebElement is located using: driver.findElement(By.cssSelector("input[name ***$='ail'***]"));


  *  Contains
  *  Syntax: css=(HTML tag)([attribute*=partial string])
  *  DOM: < ***input*** type="email" name="email" value="" placeholder="Email" required="required" autofocus="autofocus" ***class="form-control mt-3 form-control-lg"*** >
  *  The desired WebElement is located using: driver.findElement(By.cssSelector("input[***class*='control'***]"));
  
* Single slash: looks for element immediately inside the parent element
* Double slash: look for any child or nested element inside the parent element
* Dev Tools console: $x(".//*[@id='leftColumn']/div[1]/div[1]/div[1]/div[1]/article/div[1]/span");

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

