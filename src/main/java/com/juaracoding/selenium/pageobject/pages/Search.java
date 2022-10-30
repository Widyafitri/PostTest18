package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='noo-search']//i[@class='icon_search']")
    WebElement searchBtn;

    @FindBy(xpath = "//input[@name='s']")
    WebElement searchInput;

    @FindBy(xpath = "//div[contains(@class,'products noo-row')]//div[1]//div[1]//span[1]//a[1]")
    WebElement txtJeans;


    public void searchItem() {
        searchBtn.click();
        System.out.println("Search");
        searchInput.sendKeys("Jeans", Keys.ENTER);
        System.out.println("Input Search Jeans");
    }


    public String getTxtJeans() {
        return txtJeans.getText();
    }
}
