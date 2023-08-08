package org.example;

import org.junit.Test;

public class CartPageTest extends TestBase {

    @Test
    public void VerifyingWrongEmailOnUserForm() {
        CartPage cartPage = new CartPage(driver);
        CartPageVerify cartPageVerify = new CartPageVerify(driver);

        cartPage.openCardPageWithOrder()
                .inputLogin("ukraine")
                .inputPasswd("incorrectpass.coa")
                .clickLoginBtn();
        cartPageVerify.verifyErrorMessageIsDisplayedForEmailField();
    }
}
