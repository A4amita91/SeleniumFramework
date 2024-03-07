package TestCases;

import PageObject.CartPage;
import PageObject.HomePage;
import PageObject.PhonePage;
import PageObject.ProductPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_SignUp extends BaseClass {

    public TC_SignUp() throws IOException {
    }

    @Test
    public void verifySignUp()
    {
        driver.get(url);
        log.info("Url fetched");
        HomePage hp=new HomePage(driver);
        hp.signUp("Amitha","123456");

    }

    @Test
    public void Addprod()
    {
        hp.phoneBuy();
        PhonePage pg= new PhonePage(driver);
        pg.selectPhone();
        ProductPage prod=new ProductPage(driver);
        prod.AddPhoneCart();
        CartPage cart=new CartPage(driver);
        cart.orderconfirm();
    }

}
