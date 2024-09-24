package tests;

import Pages.LoginPage;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTests {
    public WebDriver driver;

    @Test
    public void verifySuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        assertEquals(loginPage.login("tomsmith",
                "SuperSecretPassword!").getTitle(), "Home page");
    }
}
