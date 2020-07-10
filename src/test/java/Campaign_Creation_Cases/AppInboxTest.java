package Campaign_Creation_Cases;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class AppInboxTest extends BaseTest {

    @Test(description = "Inbox Test Live Simple message",priority = 0)
    public void AppInboxLive() throws Throwable{
        //Campaign Type Selection
        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='notificationinbox']")));
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
        jse.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1000);
        List<WebElement> inboxTemplates = driver.findElements(By.xpath("//*[@class='inbox-template']"));
        WebElement aiT1 = inboxTemplates.get(0);
        ac.moveToElement(aiT1).build().perform();
        Thread.sleep(2000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(0);
        Thread.sleep(1000);
        selBtn.click();

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Inbox ATest");
        List<WebElement> headersColl = driver.findElements(By.xpath("//*[@class='custom-collapse-header']"));
        WebElement H1 = headersColl.get(1);
        H1.click();
        Thread.sleep(2000);
        WebElement secondBtn = textFields.get(1);
        secondBtn.clear();
        secondBtn.sendKeys("Test Message");
        Thread.sleep(1000);
        WebElement H2 = headersColl.get(2);
        H2.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@for='onLink-check']")).click();
        WebElement btn1 = driver.findElement(By.id("link-0"));
        btn1.clear();
        btn1.sendKeys("1");
        Thread.sleep(1000);
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
        txtDr.sendKeys("App Inbox Test Regression");
        Thread.sleep(2000);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cancel'][text()='Cancel']"))).click();
        WebElement saveDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Save as draft']")));
        saveDr.click();
        Thread.sleep(2000);
        WebElement crmDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']")));
        crmDr.click();
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

    @Test(description = "Inbox Test Live Carousel message",priority = 1)
    public void AppInboxLive2() throws Throwable{

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
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='notificationinbox']")));
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
        jse.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1000);
        List<WebElement> inboxTemplates = driver.findElements(By.xpath("//*[@class='inbox-template']"));
        WebElement aiT1 = inboxTemplates.get(1);
        ac.moveToElement(aiT1).build().perform();
        Thread.sleep(2000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[text()='With content notification']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(0);
        Thread.sleep(1000);
        selBtn.click();

        //What Message Sent To User
        WebElement slideAdd = driver.findElement(By.xpath("//*[@class='btn btn-white tab-btn']"));
        slideAdd.click();
        slideAdd.click();
        slideAdd.click();
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
        txtDr.sendKeys("App Inbox Test Carousel Regression");
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

    @Test(description = "Inbox Test Live Message with icon",priority = 2)
    public void AppInboxLive3() throws Throwable{

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
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='notificationinbox']")));
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
        jse.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1000);
        List<WebElement> inboxTemplates = driver.findElements(By.xpath("//*[@class='inbox-template']"));
        WebElement aiT1 = inboxTemplates.get(2);
        ac.moveToElement(aiT1).build().perform();
        Thread.sleep(2000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(1);
        Thread.sleep(1000);
        selBtn.click();

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Inbox ATest");
        List<WebElement> headersColl = driver.findElements(By.xpath("//*[@class='custom-collapse-header']"));
        WebElement H1 = headersColl.get(1);
        H1.click();
        Thread.sleep(2000);
        WebElement secondBtn = textFields.get(1);
        secondBtn.clear();
        secondBtn.sendKeys("Test Message");
        Thread.sleep(1000);
        WebElement H2 = headersColl.get(2);
        H2.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@for='onLink-check']")).click();
        WebElement btn1 = driver.findElement(By.id("link-0"));
        btn1.clear();
        btn1.sendKeys("1");
        Thread.sleep(1000);
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
        txtDr.sendKeys("Inbox Test Message With Icon Regression");
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

    @Test(description = "Inbox Test PBS",priority = 3)
    public void AppInboxPBS1() throws Throwable{

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
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='notificationinbox']")));
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
        driver.findElement(By.xpath("//*[@for='all_device']")).click();
        driver.findElement(By.id("tgt_segment_estimate")).click();
        Thread.sleep(4000);
        subButton.click();
        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1000);
        List<WebElement> inboxTemplates = driver.findElements(By.xpath("//*[@class='inbox-template']"));
        WebElement aiT1 = inboxTemplates.get(0);
        ac.moveToElement(aiT1).build().perform();
        Thread.sleep(2000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(0);
        Thread.sleep(1000);
        selBtn.click();

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Inbox ATest");
        List<WebElement> headersColl = driver.findElements(By.xpath("//*[@class='custom-collapse-header']"));
        WebElement H1 = headersColl.get(1);
        H1.click();
        Thread.sleep(2000);
        WebElement secondBtn = textFields.get(1);
        secondBtn.clear();
        secondBtn.sendKeys("Test Message");
        Thread.sleep(1000);
        WebElement H2 = headersColl.get(2);
        H2.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@for='onLink-check']")).click();
        WebElement btn1 = driver.findElement(By.id("link-0"));
        btn1.clear();
        btn1.sendKeys("1");
        Thread.sleep(1000);
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
        txtDr.sendKeys("App Inbox Test Regression");
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
