package org.example;

import org.junit.Test;

public class CartPageTest extends TestBase {

    @Test
    public void VerifyingWrongEmailOnUserForm() {
        CartPage cartPage = new CartPage(driver);
        CartPageVerify cartPageVerify = new CartPageVerify(driver);

        cartPage.openCardPageWithOrder()
                .inputUsername("ukraine")
                .inputEmail("incorrectpass.coa")
                .clickContinueBtn();
        cartPageVerify.verifyErrorMessageIsDisplayedForEmailField();
    }
}
