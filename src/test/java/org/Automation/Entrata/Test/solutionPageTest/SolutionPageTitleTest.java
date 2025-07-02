package org.Automation.Entrata.Test.solutionPageTest;

import com.aventstack.extentreports.Status;
import org.Automation.Entrata.Pages.solutions.SolutionsMenuPage;
import org.Automation.Entrata.Test.SetUpTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionPageTitleTest extends SetUpTest {

    @Test
public void SolutionsPageTest(){
        test = extent.createTest(" Solutions Page Test");

        SolutionsMenuPage solutionsMenuPage = new SolutionsMenuPage(driver);

    solutionsMenuPage.hoverSolutionsMenu();
        test.log(Status.INFO,"only checking for dropdown visible or not");
    Assert.assertTrue(solutionsMenuPage.isDropdownVisible());
}

}
