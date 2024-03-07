package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonePage {

    WebDriver ldriver;
    public PhonePage(WebDriver rdriver)
    {
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(linkText = "Samsung galaxy s6")
    WebElement samsungS6;


    public void selectPhone()
    {
     samsungS6.click();
    }
}
