package Campaign_Creation_Cases;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class InAppConditionTest extends BaseTest {

    @Test(description = "HTML Custom Test",priority = 0)
    public void CustomTest() throws Throwable{
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
        Thread.sleep(2000);
        subButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Header", Keys.ENTER).build().perform();
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
        List<WebElement> HTMLType = driver.findElements(By.xpath("//*[contains(text(),'Custom HTML')]"));
        WebElement CustomType = HTMLType.get(1);
        CustomType.click();
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
        DraftScheduleCamp("HTML-2 InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "HTML Custom Test",priority = 1)
    public void CustomTest2() throws Throwable{
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
        List<WebElement> HTMLType = driver.findElements(By.xpath("//*[contains(text(),'Custom HTML')]"));
        WebElement CustomType = HTMLType.get(1);
        CustomType.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='inline-html-radio_BV_option_1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='input-container']")).sendKeys("https://www.google.co.in/");
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
        DraftScheduleCamp("HTML-3 InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    //Once Per Session
    @Test(description = "Once Per Session InApp Test",priority = 2)
    public void OPSITest() throws Throwable{
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
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='oncePerSession']")).click();
        Thread.sleep(1000);
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
        firstBtn.sendKeys("Once Per Sess.");
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
        DraftScheduleCamp("Once Per Session InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    //Once Per Day
    @Test(description = "Once Per Day InApp Test",priority = 3)
    public void OPDITest() throws Throwable{
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
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='oncePerDay']")).click();
        Thread.sleep(1000);
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
        firstBtn.sendKeys("Once Per Day");
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
        DraftScheduleCamp("Once Per Day InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    //Once Per Campaign
    @Test(description = "Once Per Campaign InApp Test",priority = 4)
    public void OPCITest() throws Throwable{
        driver.navigate().to(BaseUrl);
        //Campaign Type Selection

        WebElement sideSel = driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]"));
        sideSel.click();
        Thread.sleep(2000);
        WebElement creCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-success btn-large createNewLink trigger_button js-createCampaign']")));
        creCamp.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));;
        WebElement tyCamp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-mode='inapp']")));
        tyCamp.click();

        //When To Send Campaign & On What Action

        subButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='oncePerLifetime']")).click();
        Thread.sleep(1000);
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
        firstBtn.sendKeys("LifeTime Campaign");
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
        DraftScheduleCamp("Once Per LifeTime InApp Regression");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }


}
