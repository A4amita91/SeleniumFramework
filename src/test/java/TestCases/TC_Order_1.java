package TestCases;

import PageObject.CartPage;
import PageObject.HomePage;
import PageObject.PhonePage;
import PageObject.ProductPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_ProdBuy_1 extends BaseClass {

    public TC_ProdBuy_1() throws IOException {
    }

    @Test(priority = 1)
    public void verifyProduct() throws InterruptedException {

        HomePage hp = new HomePage(driver);
        Thread.sleep(2000);
        hp.phoneBuy();
        log.info("Phone link is pressed");
    }
    @Test(priority = 2)
    public void addtoCart() throws InterruptedException, IOException {

        PhonePage pg= new PhonePage(driver);
        pg.selectPhone();
        log.info("Phone is selected");
        ProductPage prod=new ProductPage(driver);
        prod.AddPhoneCart();
        log.info("Phone is added to cart");
        CartPage cart=new CartPage(driver);
        cart.orderconfirm();
        captureScreenShot(driver,"addtoCart");
        Thread.sleep(2000);
        log.info("Confirmed product");
    }


}
