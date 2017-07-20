package Tests;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test " + iTestResult.getName() + " success");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test " + iTestResult.getName() +
                " failed, error " + iTestResult.getThrowable());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test " + iTestResult.getName() + " skipped");
    }
}