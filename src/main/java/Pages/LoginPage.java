package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage{
    private WebDriver driver;
    private By emailID = By.cssSelector("#username");
    private By passwordField = By.id("#password");
    private By signInButton =
            By.cssSelector("button[type=submit]");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage login(String tomsmith, String s){
        driver.findElement(emailID).sendKeys("tomsmith");
        driver.findElement(passwordField).sendKeys("SuperSecretPassword!");
        driver.findElement(signInButton).click();
        return new HomePage(driver);
    }
}