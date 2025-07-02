package org.Automation.Entrata.Test.homePageTest;

import com.aventstack.extentreports.Status;
import org.Automation.Entrata.Base.BaseClass;
import org.Automation.Entrata.Pages.homePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTitleTest extends BaseClass {

    @Test
    public void testHomepageTitle() {
        test = extent.createTest("HomePage Test ");
        HomePage homePage = new HomePage(driver);
       String title =  homePage.getPageTitle();
        test.log(Status.INFO,"only checking for title");
        assertTrue(title.contains("Entrata"));
    }
}
