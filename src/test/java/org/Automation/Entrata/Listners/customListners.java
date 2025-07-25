package org.Automation.Entrata.Listners;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.Automation.Entrata.Base.BaseClass;
import org.Automation.Entrata.baseutils.BaseUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class customListners extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String methodName = result.getName();
        String logTest = "<b>"+"Test case :- "+methodName.toUpperCase()+"Passed"+"</b>";
        Markup m = MarkupHelper.createLabel(logTest, ExtentColor.GREEN);
        test.log(Status.PASS,m);

    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL,result.getName()+"Test Fail");
        try {
            String screenShortpath = BaseUtil.getScreenShort();
            test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenShortpath).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

        if(extent != null){
            extent.flush();
        }
    }
}
