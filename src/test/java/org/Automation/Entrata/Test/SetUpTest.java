package org.Automation.Entrata.Test;

import org.Automation.Entrata.Base.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class SetUpTest extends BaseClass {

    @BeforeSuite
    public void setUp() throws IOException {
        readPropertyfile();
        driverInitialization();
        setExtentReport();

    }

    @AfterSuite
    public void tearDown(){
        extent.flush();
        driver.quit();
    }
}
