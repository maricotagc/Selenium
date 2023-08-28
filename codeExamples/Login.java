import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends Base
{
    private Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @BeforeEach
    void openMainPage() {
        driver.get(BASE_URL);
    }

    @Test
    void successfulLogin() {
        //Given
        String expectedUrl = "https://portalpacjenta.luxmed.pl/PatientPortal/NewPortal/Page/Dashboard";

        //When
        driver.findElement(By.cssSelector("#Login")).sendKeys("maricotagc@gmail.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("@Brasil2010");
        driver.findElement(By.cssSelector("#LoginSubmit")).click();

        wait.until(ExpectedConditions.urlToBe("https://portalpacjenta.luxmed.pl/PatientPortal/NewPortal/Page/Dashboard"));

        String actualUrl = driver.getCurrentUrl();

        //Then
        Assertions.assertEquals(expectedUrl, actualUrl);
    }
}
