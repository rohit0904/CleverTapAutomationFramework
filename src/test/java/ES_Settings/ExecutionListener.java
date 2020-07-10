package ES_Settings;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ExecutionListener implements ITestListener {

    private TestStatus testStatus;
    List<ITestNGMethod> passedtests = new ArrayList<ITestNGMethod>();
    List<ITestNGMethod> failedtests = new ArrayList<ITestNGMethod>();
    List<ITestNGMethod> skippedtests = new ArrayList<ITestNGMethod>();

    public void onTestStart(ITestResult iTestResult) {
        this.testStatus = new TestStatus();
    }

    public void onTestSuccess(ITestResult iTestResult) {
        this.sendStatus(iTestResult,"PASS");
        passedtests.add(iTestResult.getMethod());
    }

    public void onTestFailure(ITestResult iTestResult) {
        this.sendStatus(iTestResult,"FAIL");
        failedtests.add(iTestResult.getMethod());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        this.sendStatus(iTestResult,"SKIP");
        skippedtests.add(iTestResult.getMethod());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    public void onStart(ITestContext iTestContext) {
    }

    public void onFinish(ITestContext iTestContext) {
    }

    private void sendStatus(ITestResult iTestResult, String status){

        this.testStatus.setTestClass(iTestResult.getTestClass().getName());
        this.testStatus.setDescription(iTestResult.getMethod().getDescription());
        this.testStatus.setStatus(status);
        this.testStatus.setPassed(passedtests.size());
        this.testStatus.setFailed(failedtests.size());
        this.testStatus.setSkipped(skippedtests.size());
        int a = iTestResult.getTestContext().getAllTestMethods().length;
        this.testStatus.setTotal(a);
        this.testStatus.setExecutionDate(LocalDateTime.now().toString());
        this.testStatus.setUserName(System.getProperty("user.name"));
        ResultSender.send(this.testStatus);
    }
}