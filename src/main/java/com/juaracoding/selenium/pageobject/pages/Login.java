package com.juaracoding.selenium.pageobject.pages;
import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement usernameLogin;

    @FindBy(id = "password")
    WebElement passwordLogin;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[2]/span/span")
    WebElement hideShowPass;

    @FindBy(id = "rememberme")
    WebElement rememberme;

    @FindBy(name = "login")
    WebElement loginBtn;

    public void login(String usernameLogin, String passwordLogin){
        this.usernameLogin.sendKeys(usernameLogin);
        this.passwordLogin.sendKeys(passwordLogin);
        hideShowPass.click();
        rememberme.click();
        loginBtn.click();
    }



}
