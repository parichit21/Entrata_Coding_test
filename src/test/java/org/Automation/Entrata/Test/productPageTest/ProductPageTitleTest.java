package org.Automation.Entrata.Test.productPageTest;

import com.aventstack.extentreports.Status;
import org.Automation.Entrata.Pages.products.ProductsPage;
import org.Automation.Entrata.Test.SetUpTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTitleTest extends SetUpTest {

    @Test
    public void productPageTest(){
        test = extent.createTest("Product pagge test ");
        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.goToProductsPage();
        test.log(Status.INFO,"only checking for Products header");
        Assert.assertEquals( productsPage.getHeaderText(), "Products");

    }
}
