package PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver ldriver;
    public ProductPage(WebDriver rdriver)
    {
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(linkText = "Add to cart")
    WebElement prodAddtoCart;
    @FindBy(linkText = "Cart")
    WebElement cart;


    public void AddPhoneCart()
    {

        prodAddtoCart.click();
        ldriver.switchTo().alert().accept();
        cart.click();
    }
}
