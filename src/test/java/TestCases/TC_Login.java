package TestCases;


import PageObject.HomePage;

import org.testng.annotations.Test;

import java.io.IOException;

public class TC_SignUp extends BaseClass {

    public TC_SignUp() throws IOException {
    }

    @Test
    public void verifySignUp() {
        driver.get(url);
        log.info("Url fetched");
        HomePage hp = new HomePage(driver);
        hp.signUp("Amitha", "123456");
        hp.phoneBuy();

    }

}
