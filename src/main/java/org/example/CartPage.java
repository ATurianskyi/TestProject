package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class= 'ucob-form']//input[@type='text']")
    private WebElement loginField;

    @FindBy(xpath = "//div[contains(@class, 'button')]/a")
    private WebElement loginBtn;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement passwdField;

    @FindBy(xpath = "//div[@class='ucob-form-input-message uc-red']/p")
    private WebElement emailErrorMessage;

    public CartPage inputLogin(String login) {
        loginField.sendKeys(login);
        return this;
    }

    public CartPage inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
        return this;
    }

    public CartPage clickLoginBtn() {
        loginBtn.click();
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

