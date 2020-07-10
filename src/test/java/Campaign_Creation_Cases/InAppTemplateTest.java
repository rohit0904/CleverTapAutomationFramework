package Campaign_Creation_Cases;

import com.google.common.base.Verify;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;

import java.util.List;

public class InAppTemplateTest extends BaseTest
{
    @Test(description = "Cover InApp Test",priority = 0)
    public void CoverTest() throws Throwable{
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,130)");
        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(0);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[text()='With content notification']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(0);
        Thread.sleep(1000);
        selBtn.click();
        Thread.sleep(1000);

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Cover InApp");
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
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(1000);
        WebElement btnCTA = driver.findElement(By.id("button-0"));
        Thread.sleep(2000);
        btnCTA.clear();
        btnCTA.sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(2000);
        WebElement btnCTA2 = driver.findElement(By.id("button-1"));
        btnCTA2.clear();
        btnCTA2.sendKeys("2");
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft Campaign
        DraftScheduleCamp("Cover InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);

    }

    @Test(description = "Interstitial InApp Test",priority = 1)
    public void InterstitialTest() throws Throwable
    {
        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,130)");
        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(1);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[text()='With content notification']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(1);
        Thread.sleep(1000);
        selBtn.click();

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Interstital ATest");
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
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(1000);
        WebElement btnCTA = driver.findElement(By.id("button-0"));
        Thread.sleep(2000);
        btnCTA.clear();
        btnCTA.sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(2000);
        WebElement btnCTA2 = driver.findElement(By.id("button-1"));
        btnCTA2.clear();
        btnCTA2.sendKeys("2");
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft Campaign
        DraftScheduleCamp("Interstitial InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);

    }

    @Test(description = "Half Interstitial Test",priority = 2)
    public void HalfInterstitialTest() throws Throwable{

        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,130)");
        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(2);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[text()='With content notification']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(2);
        Thread.sleep(1000);
        selBtn.click();

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Half Interstitial");
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
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(1000);
        WebElement btnCTA = driver.findElement(By.id("button-0"));
        Thread.sleep(2000);
        btnCTA.clear();
        btnCTA.sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(2000);
        WebElement btnCTA2 = driver.findElement(By.id("button-1"));
        btnCTA2.clear();
        btnCTA2.sendKeys("2");
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft Campaign
        DraftScheduleCamp("Half Interstitial InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "Header InApp Test",priority = 3)
    public void HeaderTest() throws Throwable{

        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(3);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(0);
        Thread.sleep(1000);
        selBtn.click();
        Thread.sleep(1000);

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Header RegTest");
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
        WebElement btnCTA = driver.findElement(By.id("button-0"));
        Thread.sleep(2000);
        btnCTA.clear();
        btnCTA.sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(2000);
        WebElement btnCTA2 = driver.findElement(By.id("button-1"));
        btnCTA2.clear();
        btnCTA2.sendKeys("2");
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft Campaign
        DraftScheduleCamp("Header InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "Footer InApp Test",priority = 4)
    public void FooterTest() throws Throwable{

        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(4);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(1);
        Thread.sleep(1000);
        selBtn.click();
        Thread.sleep(1000);

        //What Message Sent To User
        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Footer RegTest");
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
        WebElement btnCTA = driver.findElement(By.id("button-0"));
        Thread.sleep(2000);
        btnCTA.clear();
        btnCTA.sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(2000);
        WebElement btnCTA2 = driver.findElement(By.id("button-1"));
        btnCTA2.clear();
        btnCTA2.sendKeys("2");
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft Campaign
        DraftScheduleCamp("Footer InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "Alert InApp Test",priority = 5)
    public void AlertTest() throws Throwable
    {
        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(5);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(2);
        Thread.sleep(1000);
        selBtn.click();
        Thread.sleep(1000);

        //What Message Should Display in InApp

        List<WebElement> textFields = driver.findElements(By.xpath("//*[@data-type='input']"));
        Thread.sleep(1000);
        WebElement firstBtn = textFields.get(0);
        firstBtn.clear();
        firstBtn.sendKeys("Automation Alert Title");
        List<WebElement> headersColl = driver.findElements(By.xpath("//*[@class='custom-collapse-header']"));
        WebElement H1 = headersColl.get(1);
        H1.click();
        Thread.sleep(2000);
        WebElement secondBtn = textFields.get(1);
        secondBtn.clear();
        secondBtn.sendKeys("Automation Alert Message");
        Thread.sleep(1000);
        WebElement H2 = headersColl.get(2);
        H2.click();
        Thread.sleep(2000);
        WebElement btnCTA = driver.findElement(By.id("button-0"));
        Thread.sleep(2000);
        btnCTA.clear();
        btnCTA.sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-white']")).click();
        Thread.sleep(2000);
        WebElement btnCTA2 = driver.findElement(By.id("button-1"));
        btnCTA2.clear();
        btnCTA2.sendKeys("2");
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft and Schedule Campaign
        DraftScheduleCamp("Alert InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);

    }

    @Test(description = "HTML Base Flow Test",priority = 6)
    public void HtmlTest() throws Throwable{
        Thread.sleep(2000);
        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        subButton.click();
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header",Keys.ENTER).build().perform();
        Thread.sleep(3000);
        subButton.click();
        Thread.sleep(3000);

        //Template Selection For InApp

        List<WebElement> typeMsg = driver.findElements(By.xpath("//*[@class='inapp-template']"));
        WebElement coverFrm = typeMsg.get(6);
        ac.moveToElement(coverFrm).build().perform();
        Thread.sleep(1000);
        List<WebElement> btnSel = driver.findElements(By.xpath("//*[@type='button'][text()='Select']"));
        Thread.sleep(1000);
        WebElement selBtn = btnSel.get(3);
        Thread.sleep(1000);
        selBtn.click();
        Thread.sleep(1000);
        subButton.click();

        //Setup For the User

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

        //Save Campaign

        Thread.sleep(2000);
        //Draft Campaign
        DraftScheduleCamp("HTML-1 InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

}
