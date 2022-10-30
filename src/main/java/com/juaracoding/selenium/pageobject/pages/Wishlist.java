package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public Wishlist() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/div")
    WebElement itemOneAddToWishlist;

    @FindBy(xpath = "//a[normalize-space()='blue sinner ripped knee high waist skinny jeans']")
    WebElement txtItemOne;

    @FindBy(xpath = "//div[contains(@class,'yith-wcwl-add-to-wishlist add-to-wishlist-1388 exists wishlist-fragment on-first-load')]//div[contains(@class,'yith-wcwl-wishlistexistsbrowse')]")
    WebElement itemTwoAddToWishlist;

    @FindBy(xpath = "//a[contains(text(),'dark blue sinner distress knee high waist skinny j')]")
    WebElement txtItemTwo;


    public void btnWishlist() {
        itemOneAddToWishlist.click();
        System.out.println("Click to add product one to wishlist");
        //driver.navigate().refresh();
        itemTwoAddToWishlist.click();
        System.out.println("Click to add product Two to wishlist");
    }

    public String getTxtProductOne() {
        return txtItemOne.getText();
    }

    public String getTxtProductTwo() {
        return txtItemTwo.getText();
    }
}
