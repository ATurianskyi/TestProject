package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class= 'ucob-form']//input[@type='text']")
    private WebElement usernameField;

    @FindBy(xpath = "//div[contains(@class, 'button')]/a")
    private WebElement continueBtn;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='ucob-form-input-message uc-red']/p")
    private WebElement emailErrorMessage;

    public CartPage setUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        return this;
    }

    public CartPage setEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public CartPage clickContinueBtn() {
        continueBtn.click();
        waitUntilPageLoad();
        return this;
    }

    public String getEmailErrorMessage() {
        return emailErrorMessage.getText();
    }

    public CartPage openCardPageWithOrder() {
        driver.get(ConfProperties.getProperty("url.with.order"));
        return this;
    }
}

