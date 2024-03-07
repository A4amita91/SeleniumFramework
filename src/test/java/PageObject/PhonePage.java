package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
    {
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(linkText = "Log in")
    WebElement login;

    @FindBy(id="loginusername")
    WebElement loginUname;

    @FindBy(id="loginpassword")
    WebElement loginPwd;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginBtn;

    @FindBy(xpath = "(//button[contains(text(),'Close')])[3]")
    WebElement loginClose;

    @FindBy(linkText = "Log out")
    WebElement logOut;

    public void login()
    {
        login.click();
        loginUname.sendKeys("Amitha");
        loginPwd.sendKeys("123456");
        loginBtn.click();
    }
}
