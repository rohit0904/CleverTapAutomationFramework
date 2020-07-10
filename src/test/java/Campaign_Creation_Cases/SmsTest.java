package Campaign_Creation_Cases;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SmsTest extends BaseTest {

    @Test(description = "SMS Test Live",priority = 0)
    public void SmsAction() throws Throwable{

        //Campaign Type Selection
        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='sms']")));
        tyCamp.click();
        WebElement tyTycamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-type='action']")));
        tyTycamp.click();
        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();

        //Event Selection When to Send Campaign
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("tgt_message_text")).sendKeys("SMS Test Regression");
        Thread.sleep(2000);
        subButton.click();

        //Setup Mobile Push Campaign
        Thread.sleep(2000);
        WebElement rmrCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='scgToggleLink']")));
        rmrCamp.click();
        Thread.sleep(2000);
        WebElement rmrStep1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Remove']")));
        rmrStep1.click();
        Thread.sleep(2000);
        WebElement rmrStep2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='OK']")));
        rmrStep2.click();
        Thread.sleep(2000);
        subButton.click();

        //Draft Campaign And Save The Campaign
        WebElement drButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_save_as_draft")));
        drButton.click();
        WebElement txtDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jname")));
        txtDr.sendKeys("SMS Test Regression");
        Thread.sleep(2000);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cancel'][text()='Cancel']"))).click();
        WebElement saveDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Save as draft']")));
        saveDr.click();
        Thread.sleep(2000);
        WebElement crmDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']")));
        crmDr.click();
        Thread.sleep(3000);
        WebElement cnt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt1.click();
        WebElement cnt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt2.click();
        WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
        cnt3.click();
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "SMS Test Live",priority= 1)
    public void SmsInAction() throws Throwable{

        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        //Campaign Type Selection
        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='sms']")));
        tyCamp.click();
        WebElement tyTycamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-type='inaction']")));
        tyTycamp.click();
        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();

        //Event Selection When to Send Campaign
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header", Keys.ENTER).build().perform();
        driver.findElement(By.id("inputLoader")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox2 = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox2).sendKeys("Footer", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("tgt_message_text")).sendKeys("SMS Test Regression");
        Thread.sleep(2000);
        subButton.click();

        //Setup Mobile Push Campaign
        Thread.sleep(2000);
        WebElement rmrCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='scgToggleLink']")));
        rmrCamp.click();
        Thread.sleep(2000);
        WebElement rmrStep1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Remove']")));
        rmrStep1.click();
        Thread.sleep(2000);
        WebElement rmrStep2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='OK']")));
        rmrStep2.click();
        Thread.sleep(2000);
        subButton.click();

        //Draft Campaign And Save The Campaign
        WebElement drButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_save_as_draft")));
        drButton.click();
        WebElement txtDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jname")));
        txtDr.sendKeys("SMS Test InAction Regression");
        Thread.sleep(2000);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cancel'][text()='Cancel']"))).click();
        WebElement saveDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Save as draft']")));
        saveDr.click();
        Thread.sleep(2000);
        WebElement crmDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']")));
        crmDr.click();
        Thread.sleep(3000);
        WebElement cnt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt1.click();
        WebElement cnt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt2.click();
        WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
        cnt3.click();
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "SMS Test PBS",priority = 2)
    public void SmsPbs() throws Throwable{

        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        //Campaign Type Selection
        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='sms']")));
        tyCamp.click();
        WebElement tyTycamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("campaignType0")));
        tyTycamp.click();
        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();

        //Event Selection When to Send Campaign
        Thread.sleep(2000);
        driver.findElement(By.id("addDidEvent")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("App Launched", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("tgt_segment_estimate")).click();
        jse.executeScript("window.scrollBy(0,90)","");
        Thread.sleep(2000);
        subButton.click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("tgt_message_text")).sendKeys("SMS Test Regression");
        Thread.sleep(2000);
        subButton.click();


        //Setup Mobile Push Campaign
        Thread.sleep(2000);
        WebElement rmrCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='scgToggleLink']")));
        rmrCamp.click();
        Thread.sleep(2000);
        WebElement rmrStep1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Remove']")));
        rmrStep1.click();
        Thread.sleep(2000);
        WebElement rmrStep2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='OK']")));
        rmrStep2.click();
        Thread.sleep(2000);
        subButton.click();

        //Draft Campaign And Save The Campaign
        WebElement drButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_save_as_draft")));
        drButton.click();
        WebElement txtDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jname")));
        txtDr.sendKeys("SMS Test PBS Regression");
        Thread.sleep(2000);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cancel'][text()='Cancel']"))).click();
        WebElement saveDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Save as draft']")));
        saveDr.click();
        Thread.sleep(2000);
        WebElement crmDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']")));
        crmDr.click();
        Thread.sleep(3000);
        WebElement cnt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt1.click();
        WebElement cnt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt2.click();
        WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
        cnt3.click();
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

}
