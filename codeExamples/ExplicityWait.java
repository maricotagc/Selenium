public class Actions {

    WebDriver driver;
    BrInvestingElements webElements;
    WebDriverWait wait;

    public Actions(WebDriver driver, BrInvestingElements webElements) {
        this.driver = driver;
        this.webElements = webElements;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void closePrivacyWindow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("quotesBarSpacer")));
        switchFrameBeginningWith("pop");
        webElements.privacyFrame().click();
        switchToMainPage();
    }

    public void switchFrameBeginningWith(String frameName) {

        List<WebElement> frames = driver.findElements(By.cssSelector("iframe"));
        int frame = 0;

        for (int i = 0; i <= frames.size() - 1; i++) {
            if (frames.get(i).getAttribute("id").startsWith(frameName)) {
                frame = i;
            }
        }
        driver.switchTo().frame(frame);
    }

    public void switchToMainPage() {
        driver.switchTo().defaultContent();
    }
}
