package org.Automation.Entrata.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public   static Properties config;
    public   static WebDriver driver;

    //  for reports
    public static ExtentReports extent;
    public static ExtentSparkReporter htmlReporter;
    public static ExtentTest test;

    public void driverInitialization(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver();
//       for headless mode uncomment it
        // driver = new ChromeDriver(options);
        driver.get(config.getProperty("Base_URL"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(config.getProperty("pageloadTime"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

    }

    public void readPropertyfile() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
        config = new Properties();
        config.load(fis);
    }

    public void setExtentReport(){
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//extentReports//Entrata_coding_Test.html");
        htmlReporter.config().setDocumentTitle("Entrata_coding_Test Automation Report");
        htmlReporter.config().setReportName("Functional Testing");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Name","Parichit");

    }



}
