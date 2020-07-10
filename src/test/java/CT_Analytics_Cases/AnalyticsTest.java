package CT_Analytics_Cases;

import Campaign_Creation_Cases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;;
import org.testng.annotations.Test;

import java.util.List;

public class AnalyticsTest extends BaseTest {

    @Test(description = "Event Analytics Test",priority = 0)
    public void eventCase() throws Throwable{
        //Analytics Test Case
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());

        //Event Selection When to Send Campaign
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("App Launched", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("aViewDetails")).click();
        Thread.sleep(2000);

        //Bookmark Event Details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveEvent"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bkName"))).sendKeys("Event Bookmark");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(1000);

        //Delete Bookmark Event Details
        driver.findElement(By.xpath("//div[contains(text(),'Events')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='events-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(3000);

    }

    @Test(description = "Funnels Analytics Test",priority = 1)
    public void funnelCase() throws Throwable{
        //Analytics Test Case
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'Funnels')]")).click();
        Thread.sleep(2000);
        Thread.sleep(1000);
        driver.findElement(By.id("addAnotherStep")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox1 = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox1).sendKeys("Added To Cart", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value='View funnel']")).click();
        Thread.sleep(5000);

        //Bookmark Event Details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveFunnel"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bkName"))).sendKeys("Funnel Bookmark");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(1000);

        //Delete Bookmark Event Details
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='funnels-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(3000);
    }

    @Test(description = "Cohorts Analytics Test",priority = 2)
    public void cohortsCase() throws Throwable{

        //Analytics Test Case
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'Cohorts')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Added To Cart", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox1 = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox1).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='View cohort']")).click();
        Thread.sleep(5000);

        //Bookmark Cohorts Details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveCohort"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bkName"))).sendKeys("Cohorts Bookmark");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(1000);

        //Delete Bookmark Cohorts Details
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='cohorts-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(3000);
    }

    @Test(description = "Trends Analytics Test",priority = 3)
    public void trendsCase() throws Throwable{

        //Analytics Test Case
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'Trends')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Added To Cart", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("add_event")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox1 = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox1).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value='View trend']")).click();
        Thread.sleep(5000);

        //Trends Details
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Unique users']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Events per user']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Active %']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Properties']")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Event count']")).click();
        Thread.sleep(2000);


    }

    @Test(description = "Pivots Analytics Test",priority = 4)
    public void pivotsCase() throws Throwable{

        //Analytics Test Case
        driver.navigate().to(BaseUrl);
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'Pivots')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("App Launched", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Calculate']")).click();
        Thread.sleep(5000);

        //Bookmark Pivots Details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveEvent"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bkName"))).sendKeys("Pivots Bookmark");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(1000);

        //Delete Bookmark Cohorts Details
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='pivots-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(3000);
    }

    @Test(description = "Flows Event Analytics Test",priority = 5)
    public void flowCaseEvent() throws Throwable{

        //Analytics Test Case
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'Flows')]")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@flows_type='event']"))).build().perform();
        List<WebElement> selButton = driver.findElements(By.xpath("//a[contains(text(),'Select')]"));
        selButton.get(0).click();

        //Event Selection
        Thread.sleep(1000);
        driver.findElement(By.id("add-entry")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Added To Cart", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox1 = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox1).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='View flows']")).click();
        Thread.sleep(5000);

        //Bookmark Event Details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='js-bookmark-dialog']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bkName"))).sendKeys("Event Flow Bookmark");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        Thread.sleep(1000);

        //Delete Bookmark Event Details
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='flows-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(3000);
    }

    @Test(description = "Flows Content Analytics Test",priority = 6)
    public void flowCaseContent() throws Throwable{

        //Analytics Test Case
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        System.out.println("Start Test");
        List<WebElement> goToAnalytics = driver.findElements(By.xpath("//*[contains(text(),'Analytics')]"));
        goToAnalytics.get(1).click();
        Thread.sleep(1000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='block clearfix']")).getText());
        driver.findElement(By.xpath("//div[contains(text(),'Flows')]")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@flows_type='content']"))).build().perform();
        List<WebElement> selButton = driver.findElements(By.xpath("//a[contains(text(),'Select')]"));
        selButton.get(1).click();
        Thread.sleep(1000);
    }
}
