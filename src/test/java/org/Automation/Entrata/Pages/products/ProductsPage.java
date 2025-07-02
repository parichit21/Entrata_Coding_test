package org.Automation.Entrata.Pages.products;

import org.Automation.Entrata.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class ProductsPage extends BaseClass {
    WebDriver driver;


    @FindBy(xpath = "//div[text()='Products']")
    WebElement productsLink;

    @FindBy(xpath = "//nav[@role='navigation']//div[text()='Products']")
    WebElement pageHeader;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToProductsPage()  {
        productsLink.click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(pageHeader));
    }

    public String getHeaderText() {
        return pageHeader.getText();
    }
}
