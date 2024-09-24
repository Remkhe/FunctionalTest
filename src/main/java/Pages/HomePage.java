package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class HomePage {
    public WebDriver driver;
    private By searchField = By.id("username");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(10));
        wait.until(ExpectedConditions.
                presenceOfElementLocated(searchField));
        return driver.getTitle();
    }
}
