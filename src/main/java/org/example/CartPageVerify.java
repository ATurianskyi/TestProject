package org.example;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartPageVerify {
    private CartPage cartPage;

    public CartPageVerify(WebDriver webDriver) {
        cartPage = new CartPage(webDriver);
    }

    public CartPageVerify verifyErrorMessageIsDisplayedForEmailField() {
        var message = cartPage.getEmailErrorMessage();
        Assertions.assertThat(message).isEqualTo("Por favor, preencha o campo com seu e-mail");
        return this;
    }
}
