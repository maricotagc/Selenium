//Importing settings from Config class
String projectPath = System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");

//New instance of webdriver
WebDriver driver = new ChromeDriver();
driver.get("https://www.selenium.dev/");
driver.close();
