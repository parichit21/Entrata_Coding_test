package org.Automation.Entrata.baseutils;

import org.Automation.Entrata.Base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseUtil extends BaseClass {
    public static String getScreenShort() throws IOException {

        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShort\\"+currentDate+".png";
        FileHandler.copy(source, new File(destination));
        return destination;
    }


}

