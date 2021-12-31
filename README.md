# Selenium

[Selenium Official GitHub](https://github.com/SeleniumHQ)

[Selenium Installation](https://www.selenium.dev/documentation/en/selenium_installation/)

[Selenium API Documentation](https://www.selenium.dev/selenium/docs/api/java/): Commands to manipulate WebDriver.

# Webdriver

It is an API which emulates browsers using the Selenium server. Each browser has its own driver (Chrome, FireFox, Safari, etc).
* [ChromeDriver](https://sites.google.com/chromium.org/driver/)
* [WebDriver Official Documentation](https://www.w3.org/TR/webdriver1/)

# Declaration

[Code Example](/codeExamples/WebdriverDeclaration.java)

# Frequent Actions

1. [Navigation to URL](/codeExamples/Navigation.java)
2. [Maximize browser](/codeExamples/MaximizeBrowser.java)
3. [Set an element’s text](/codeExamples/SetElementText.java)
4. [Clicking on an element](/codeExamples/Click.java)
5. [Explicit Wait](/codeExamples/ExplicityWait.java) [Explanation in video](https://www.youtube.com/watch?v=UN8cauyoZsk) used for specific elements/conditions (ex.: until clickable).It comprehends only specific element.
6. [Implicit Wait](/codeExamples/ImplicityWait.java) [Explanation in video](https://www.youtube.com/watch?v=UN8cauyoZsk) used to define a period of time until the webdriver throws "No Such Element" exception. It comprehends the entire session.
7. [Keyboard Actions](https://www.selenium.dev/documentation/en/webdriver/keyboard/)
8. [Reading Element's Value](/codeExamples/ReadElementValue.java)
9. [Other Examples](https://www.selenium.dev/documentation/en/webdriver/browser_manipulation/)

# JavaScriptExecutor

Used when Selenium Webdriver fails do click on any element due to some issue.

[Code Example](/codeExamples/JavaScriptExecutor.java)

# Possible Locators for WebElements

## 1. Class Name - used by unique class names
  * DOM: < button id="login-button" data-amplitude="" type="submit" ***class="btn btn-dark submit-btn"*** css="1">Login< / button>
  * WebElement is located by: driver.findElement(By.***className("submit-btn")***);


## 2. CSS Selector
  ### Syntax by ID: css=(tag)#(value of the ID attribute)
  * DOM: < ***input*** type="password" name="password" placeholder="Desired Password*" required="required" ***id="userpassword"*** minlength="8" class="form-control " aria-autocomplete="list" xpath="1" >
  * WebElement is located by: driver.findElement(By.cssSelector("input#userpassword"))

  ### Syntax by Tag and Attribute: css=(HTML Page)[Attribute=Value]
  * DOM: <***input*** type="phone" placeholder="Phone*" ***name="phone"*** value="" class="form-control sign-up-input-2 ">
  * WebElement is located by: driver.findElement(By.cssSelector("input[name=\"phone\"]"))

### Syntax by Tag, Class, and Attribute: css=(tag).(Class attribute value)([attribute=Value of attribute])
  * DOM: < ***button*** data-sitekey="6LceAqQaAAAAAO0LcIgLnXy3gH_M3X5aDrqUihHw" ***data-callback="onSubmit"*** data-amplitude="R_signup" type="submit" ***class="btn btn-dark submit-btn g-recaptcha"*** css="1">Free Sign Up < /button >
  * WebElement is located by: driver.findElement(By.cssSelector("button.submit-btn[data-callback=\"onSubmit\"]"));
    
## 3. ID
  * Syntax: driver.findElement(By.id(“IdValue”))
  * DOM: < input ***id="email"*** type="email" placeholder="Email" name="email" value="" required="required"
autofocus="autofocus" class="form-control " xpath="1" >
 * WebElement is located by: driver.findElement(By.id("email"))

## 4. Name - it may or may not have a unique value. If there are WebElements with the same name, the locator selects the first element with that Name on the page. 
  * Syntax: driver.findElement(By.name(“nameValue”)) 
  * DOM: < input id="email" type="email" placeholder="Email" ***name="email"*** value="" required="required" autofocus="autofocus" class="form-control " xpath="1" >
  * WebElement is located by: driver.findElement(By.name("email"));
  
## 5. Link Text - can only be used for elements that have an anchor(a) tag. 
  * DOM: < a href="https://www.lambdatest.com/automation-testing" class="desktop:block  desktop:ml-0 desktop:mt-10 nav-link inline-block py-5 text-size-14 font-medium ml-30 fromipad:ml-20 "> ***Automation*** < / a>
* WebElement is located by: driver.findElement(By.linkText("***Automation***"));

## 6. Partial Link text - preferred when the link text is too long. Using this can also be to locate multiple links on a page with a common partial text. 
  * DOM:< a href="https://www.lambdatest.com/test-on-ios-devices">***Test on iOS Simulator*** < /a>
  * WebElement is located by: driver.findElement(By.partialLinkText ("***Simulator***"));
  
## 7. Tag Name
  * Syntax: driver.findElement(By.tagName(“htmlTag”))

## 8. XPath 
  * Syntax: //tagname[@attribute = 'value']
  * TagName (attribute) can be: input tag, anchor tag, id tag, Name tag, class tag, etc.
  * [XPATH Examples](/codeExamples/XpathExamples.java)
  * DOM: < ***input*** type="email" ***name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  * WebElement is located by: driver.findElement(By.xpath("//input[@name= ’email’]"));

## 9. XPath Contains: used on WebElements whose value is changing dynamically
* Syntax: //tagname[contains(@attribute, ‘partial value of attribute’)]
- DOM: < ***input*** type="text" placeholder="Full Name*" name="name" value="" ***class="form-control sign-up-input-2*** " >
* WebElement is located by: driver.findElement(By.xpath("//input[contains(@class, ‘form-control’)]"))

## 10. XPath using ‘AND’ & ‘OR’: used when locating a WebElement based on certain condition sets. 
  * Syntax of OR: //input[@id='login_1' OR @name='login’]
  * Syntax of AND: //input[@id='login_1' AND @name='login’] 
  * DOM: < input ***type="email" name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  * WebElement is located by: driver.findElement(By.xpath("//input[@type='email' AND @name='email']"

## 11. Xpath Text: used when elements have to be located by looking into the tags containing certain text.
  * Syntax: //div[text()='Logged In']
  * DOM: < button class="btn btn-dark submit-btn g-recaptcha">Free Sign Up < /button >
  * WebElement is located by: driver.findElement(By.xpath("//button[text()='Free Sign Up']"))

## Tricks
### Wild (*, ^ and $) in CSS for classes
#### Starts-With
  *  Syntax: css=(HTML tag)([attribute^=start of the string])
  *  DOM: < input type="email" ***name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  * WebElement is located by: driver.findElement(By.cssSelector("input[name ***^='em'***]"));

  #### Ends-With
  *  Syntax: css=(HTML tag)([attribute$=end of the string])
  *  DOM: < input type="email" ***name="email"*** value="" placeholder="Email" required="required" autofocus="autofocus" class="form-control mt-3 form-control-lg" >
  * WebElement is located by: driver.findElement(By.cssSelector("input[name ***$='ail'***]"));


  #### Contains
  *  Syntax: css=(HTML tag)([attribute*=partial string])
  *  DOM: < ***input*** type="email" name="email" value="" placeholder="Email" required="required" autofocus="autofocus" ***class="form-control mt-3 form-control-lg"*** >
  * WebElement is located by: driver.findElement(By.cssSelector("input[***class*='control'***]"));
  
### Single slash: looks for element immediately inside the parent element
### Double slash: look for any child or nested element inside the parent element

## HTML Elements
  * Finding elements in Chrome Dev Tools Console:
    *  By ID: document.getElementById("example");
    *  By TagName: document.getElementsByTagName("example");
    *  By Class Name: document.getElementsByClassName("example");
    *  By CSS Selector: document.querySelectorAll("p.intro");

  * [For more details check W3 Schools](https://www.w3schools.com/js/js_htmldom_document.asp)



