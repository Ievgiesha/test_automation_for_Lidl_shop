package org.example.pageObject.pages.home;

import org.example.pageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//app-header/header//nav/a[1]")
    private WebElement catalog;
    @FindBy(xpath = "//app-header/header//nav/a[1]")
    private WebElement catalog;
    @FindBy(xpath = "//app-header/header//nav/a[1]")
    private WebElement catalog;
    @FindBy(xpath = "//app-header/header//nav/a[1]")
    private WebElement catalog;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public HomePage open() {
        webDriver.get("https://www.lidl.pl/");
        return this;
    }
}
