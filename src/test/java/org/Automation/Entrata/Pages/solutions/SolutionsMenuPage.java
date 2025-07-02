package org.Automation.Entrata.Pages.solutions;

import org.Automation.Entrata.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SolutionsMenuPage extends BaseClass {

    WebDriver driver;

    @FindBy(xpath = "//div[text()='Solutions']")
    WebElement solutionsMenu;

    @FindBy(xpath = "//nav[@role='navigation']//div[text()='Solutions']")
    WebElement dropdown;

    public SolutionsMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hoverSolutionsMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(solutionsMenu).perform();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(dropdown));
    }

    public boolean isDropdownVisible() {
        return dropdown.isDisplayed();
    }
}
