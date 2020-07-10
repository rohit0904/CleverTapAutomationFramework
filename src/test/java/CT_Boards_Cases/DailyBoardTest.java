package CT_Boards_Cases;

import Campaign_Creation_Cases.BaseTest;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DailyBoardTest extends BaseTest {

    @Test(description = "Daily Board Cases",priority = 0)
    public void dailyBoard() throws Throwable{
        //Conversion Event Selection
        System.out.println("Start Test");
        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Settings')]"));
        sideSel.click();
        Thread.sleep(1000);
        WebElement settingOpt = driver.findElement(By.xpath("//*[contains(text(),'Schema')]"));
        settingOpt.click();
        Thread.sleep(1000);
        WebElement conversionSel = driver.findElement(By.xpath("//*[contains(text(),'Conversion Event')]"));
        conversionSel.click();
        Thread.sleep(1000);
        List<WebElement> eventSel = driver.findElements(By.xpath("//*[@class='v-select__slot']//input"));
        WebElement e1 = eventSel.get(0);
        e1.click();
        Thread.sleep(2000);
        List<WebElement> allEvent = driver.findElements(By.xpath("//*[@role='option']"));
        WebElement blanckEvent = allEvent.get(0);
        blanckEvent.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(1000);
        String toastMSG = driver.findElement(By.xpath("//*[text()='Conversion event has been updated.']")).getText();
        Verify.verify(toastMSG.equalsIgnoreCase("Conversion event has been updated."));
        Thread.sleep(1000);

        //Go To Daily Board Section
        WebElement sideBar = driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"));
        ac.moveToElement(sideBar).build().perform();
        Thread.sleep(1000);
        WebElement goToBoard = driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]"));
        goToBoard.click();
        Thread.sleep(1000);

        //Verify The Expected Result
        driver.findElement(By.xpath("//*[contains(text(),'Activity stream')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Mobile App')]")).click();
        Thread.sleep(1000);
        List<WebElement> mobileBoard = driver.findElements(By.xpath("//*[@class='v-input__append-inner']"));
        int allInner = mobileBoard.size();
        int lastCount = allInner - 1 ;
        WebElement evntSel = mobileBoard.get(lastCount);
        evntSel.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@role='option']//div[text()='App Launched']")).click();
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(1000);
        Verify.verify(toastMSG.equalsIgnoreCase("Conversion event has been updated."));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Uninstall')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Revenue')]")).click();
        Thread.sleep(1000);
        List<WebElement> revenueBoard = driver.findElements(By.xpath("//*[@class='v-input__append-inner']"));
        int allInner1 = revenueBoard.size();
        int lastCount1 = allInner1 - 1 ;
        WebElement evntPropSel = revenueBoard.get(lastCount1);
        evntPropSel.click();
        driver.findElement(By.xpath("//*[@role='option']//div[text()='CT App Version']")).click();
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Boards Verification",priority = 1)
    public void BaseCasesBoard() throws Throwable{

        driver.navigate().to(BaseUrl);
        //Today Board Test Cases-Quick View

        String allTabs = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        Verify.verify(allTabs.contains("Active Users"));
        Verify.verify(allTabs.contains("New vs Returning Users"));
        Verify.verify(allTabs.contains("Usage Source"));
        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,150)");
        List<WebElement> graphSelection = driver.findElements(By.xpath("//*[@class='chartLegend clickableLegend']"));
        for(int i=1;i<graphSelection.size();i++){
            WebElement gs = graphSelection.get(i);
            Thread.sleep(1000);
            gs.click();
        }

        //Today Board Test Cases-Activity Stream
        jse.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Activity stream']")).click();
        String allTabs1 = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        Verify.verify(allTabs1.contains("Note: Activity Stream data is shown for All Users, and not filtered by the selected segment."));
        Thread.sleep(2000);

        //Mobile Board Test Cases-Quick View
        driver.findElement(By.xpath("//*[contains(text(),'Mobile App')]")).click();
        Thread.sleep(1000);
        String allTabs2 = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        Verify.verify(allTabs2.contains("Active Users"));
        Verify.verify(allTabs2.contains("Conversions"));
        Verify.verify(allTabs2.contains("Distribution by App Version"));
        Verify.verify(allTabs2.contains("User Retention And Conversion"));

        //OS Types
        List<WebElement> dropChart = driver.findElements(By.xpath("//*[@class='v-select__selections']"));
        dropChart.get(0).click();
        driver.findElement(By.xpath("//div[text()='iOS']")).click();
        Thread.sleep(2000);
        dropChart.get(0).click();
        driver.findElement(By.xpath("//div[text()='Android']")).click();
        Thread.sleep(2000);
        //Active Users
        dropChart.get(1).click();
        driver.findElement(By.xpath("//div[text()='Weekly']")).click();
        Thread.sleep(2000);
        dropChart.get(1).click();
        driver.findElement(By.xpath("//div[text()='Monthly']")).click();
        Thread.sleep(2000);

        //Mobile Board Test Cases-More
        driver.findElement(By.xpath("//*[text()='More']")).click();
        Thread.sleep(2000);
        String allTabs3 = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        Verify.verify(allTabs3.contains("App Launched vs Conversions"));
        Verify.verify(allTabs3.contains("Usage and Revenue Trends"));
        Thread.sleep(2000);

        //Uninstall Board Test Cases
        driver.findElement(By.xpath("//*[contains(text(),'Uninstall')]")).click();
        Thread.sleep(1000);
        String allTabs4 = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        Verify.verify(allTabs4.contains("Activations vs Uninstalls"));
        Verify.verify(allTabs4.contains("Uninstalls by Operating System"));
        Verify.verify(allTabs4.contains("Total New Activations"));
        Verify.verify(allTabs4.contains("Total Uninstalls"));
        Verify.verify(allTabs4.contains("Net Activations"));
        Thread.sleep(2000);
        List<WebElement> dropChart1 = driver.findElements(By.xpath("//*[@class='v-select__selections']"));
        dropChart1.get(0).click();
        driver.findElement(By.xpath("//div[text()='Weekly']")).click();
        Thread.sleep(2000);
        dropChart1.get(0).click();
        driver.findElement(By.xpath("//div[text()='Monthly']")).click();
        Thread.sleep(2000);

        //Revenue Board Test Cases
        driver.findElement(By.xpath("//*[contains(text(),'Revenue')]")).click();
        Thread.sleep(1000);
        String allTabs5 = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        Verify.verify(allTabs5.contains("Total Revenue"));
        Verify.verify(allTabs5.contains("Total Paying Users"));
        Verify.verify(allTabs5.contains("Avg Revenue Per Paying User"));
        Verify.verify(allTabs5.contains("Trend of Revenue"));
        Verify.verify(allTabs5.contains("Revenue Distribution By Device"));
        Thread.sleep(2000);
        List<WebElement> dropChart2 = driver.findElements(By.xpath("//*[@class='v-select__selections']"));
        dropChart2.get(0).click();
        driver.findElement(By.xpath("//div[text()='Weekly']")).click();
        Thread.sleep(2000);
        dropChart2.get(0).click();
        driver.findElement(By.xpath("//div[text()='Monthly']")).click();
        Thread.sleep(2000);
    }
}
