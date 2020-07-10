package CT_Segment_Cases;

import Campaign_Creation_Cases.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentReporteFile.TestListeners.class)
public class RFMTest extends BaseTest {

    @Test(description = "RFM Test Verification",priority = 0)
    public void RfmCases() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'RFM')]")).click();
        Thread.sleep(1000);

        //Select event for recency & frequency analysis
        Thread.sleep(1000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Add monetary event
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox2 = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox2).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Aggregate By
        driver.findElement(By.id("acquiredQueryRevenue_chzn")).click();
        WebElement searchBox3 = driver.findElement(By.xpath("//div[@id='acquiredQueryRevenue_chzn']//input"));
        ac.moveToElement(searchBox3).sendKeys("CT App Version", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Calculate the Values
        driver.findElement(By.xpath("//*[contains(text(),'Calculate')]")).click();
        Thread.sleep(2000);
        for (int i=1;i<5;i++){
            driver.findElement(By.xpath("//*[@class='btn-group u-NoMargin']//li["+i+"]")).click();
        }

        driver.findElement(By.xpath("//li[text()='RFM']")).click();

        //Bookmark RFM
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveEvent"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bkName"))).sendKeys("RFM Bookmark");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(1000);

        //Delete Bookmark RFM Details
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='rfm-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(3000);
    }

}
