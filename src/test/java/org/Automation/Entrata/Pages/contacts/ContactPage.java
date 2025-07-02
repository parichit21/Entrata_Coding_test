package org.Automation.Entrata.Pages.contacts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.Automation.Entrata.Base.BaseClass.config;

public class ContactPage {
    private static final Logger log = LoggerFactory.getLogger(ContactPage.class);
    WebDriver driver;

    @FindBy(xpath = "//*[@id='FirstName']")
    WebElement firstNameInput;

    @FindBy(xpath = "//*[@id='LastName']")
    WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='Email']")
    WebElement emailInput;

    @FindBy(xpath = "//*[@id='Company']")
    WebElement companyNameInput;

    @FindBy(xpath = "//*[@id='Title']")
    WebElement JobtitleInput;

    @FindBy(xpath = "//*[@id='Phone']")
    WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@id='Unit_Count__c']")
    WebElement totalManageUnitInput;

    @FindBy(xpath = "//*[@id='demoRequest']")
    WebElement iamInput;


    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


        public void enterFirstName(){
            firstNameInput.sendKeys(config.getProperty("firstName"));
        }
    public String getFirstNameValue() {
        return firstNameInput.getAttribute("value");
    }

        public void enterLastName(){
        lastNameInput.sendKeys(config.getProperty("lastName"));
        }

    public void enterEmailid(){
       emailInput.sendKeys(config.getProperty("email"));
    }
    public void enterCompanyName(){
        companyNameInput.sendKeys(config.getProperty("company_Name"));
    }
    public void enterJobTitle(){
        JobtitleInput.sendKeys(config.getProperty("job_Title"));
    }
    public void enterPhoneNumber(){
        phoneNumberInput.sendKeys(config.getProperty("phone_No"));
    }

    public void entertotalManageUnit(){
        totalManageUnitInput.click();
        Select select = new Select(driver.findElement(By.id("Unit_Count__c")));
       select.selectByVisibleText("101 - 300");
    }

    public void enteriam(){
        iamInput.click();
        Select select = new Select(driver.findElement(By.xpath("//*[@id='demoRequest']")));
        select.selectByVisibleText("an Owner/Operator or Property Manager");
    }

}
