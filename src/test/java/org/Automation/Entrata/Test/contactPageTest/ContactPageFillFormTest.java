package org.Automation.Entrata.Test.contactPageTest;

import com.aventstack.extentreports.Status;
import org.Automation.Entrata.Base.BaseClass;
import org.Automation.Entrata.Pages.contacts.ContactPage;
import org.Automation.Entrata.Test.SetUpTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPageFillFormTest extends SetUpTest {

    @Test
    public void FillFormTest(){
        test = extent.createTest("Only filling form");
        ContactPage contactPage = new ContactPage(driver) ;

        contactPage.enterFirstName();
        test.log(Status.INFO,"only checking for username");
        Assert.assertEquals(contactPage.getFirstNameValue(), "parichit");
        contactPage.enterLastName();
        contactPage.enterEmailid();
        contactPage.enterCompanyName();
        contactPage.enterPhoneNumber();
        contactPage.entertotalManageUnit();
        contactPage.enterJobTitle();
        contactPage.enteriam();

    }
}
