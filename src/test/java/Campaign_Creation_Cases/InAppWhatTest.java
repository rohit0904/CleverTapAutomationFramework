package Campaign_Creation_Cases;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class InAppWhatTest extends BaseTest {

    @Test(description = "HTML Custom Test-AB",priority = 1)
    public void CustomTestAB() throws Throwable{
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
        jse.executeScript("window.scrollBy(0,-200)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='A/B test']")).click();
        subButton.click();
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

        //Draft Campaign
        Thread.sleep(2000);
        WebElement drButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_save_as_draft")));
        drButton.click();
        WebElement txtDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jname")));
        txtDr.sendKeys("HTML Custom InApp Regression-A/B");
        Thread.sleep(2000);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cancel'][text()='Cancel']"))).click();
        WebElement saveDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Save as draft']")));
        saveDr.click();
        Thread.sleep(2000);
        WebElement crmDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']")));
        crmDr.click();
        Thread.sleep(5000);
        WebElement cnt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt1.click();
        WebElement cnt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt2.click();
        WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
        cnt3.click();
        WebElement cnt4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
        cnt4.click();
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "HTML Custom Test-Property",priority = 2)
    public void CustomTestProp() throws Throwable{
        //Campaign Type Selection
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
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
        jse.executeScript("window.scrollBy(0,-300)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Message on user property']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Select user property')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'anguage')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='plus-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
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
        DraftScheduleCamp("HTML-2 InApp Regression-user property");
        //reportSection("Custom HTML InApp-User Property Test","Information of Test Case","Test Case Pass","Test Case Fail","Test Case Skipped");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "HTML Custom Test-Legacy",priority = 3)
    public void CustomTestLegacy() throws Throwable{

        //Campaign Type Selection
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
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
        jse.executeScript("window.scrollBy(0,-200)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Legacy']")).click();
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
        DraftScheduleCamp("HTML-2 InApp Regression-Legacy");
       // reportSection("Custom HTML InApp-Legacy Test","Information of Test Case","Test Case Pass","Test Case Fail","Test Case Skipped");
        Thread.sleep(3000);
        Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
        Thread.sleep(2000);
    }

    @Test(description = "InApp Test-A/B",priority = 4)
    public void InAppTestAB() throws Throwable {

        try {
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            System.out.println("Above Case Is Fail");
        } catch (Exception e) {
            System.out.println("Above Case Is Pass");
        }
            //Campaign Type Selection
            driver.navigate().to(BaseUrl);
            Thread.sleep(2000);
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
            ac.moveToElement(searchBox).sendKeys("Header", Keys.ENTER).build().perform();
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
            Thread.sleep(1000);

            //What Message Sent To User
            jse.executeScript("window.scrollBy(0,-200)");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='A/B test']")).click();
            Thread.sleep(1000);
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
            WebElement drButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_save_as_draft")));
            drButton.click();
            WebElement txtDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jname")));
            txtDr.sendKeys("InApp Regression-A/B");
            Thread.sleep(2000);
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cancel'][text()='Cancel']"))).click();
            WebElement saveDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Save as draft']")));
            saveDr.click();
            Thread.sleep(2000);
            WebElement crmDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']")));
            crmDr.click();
            Thread.sleep(5000);
            WebElement cnt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
            cnt1.click();
            Thread.sleep(1000);
            WebElement cnt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
            cnt2.click();
            Thread.sleep(1000);
            WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue'][text()='Continue ']")));
            cnt3.click();
            Thread.sleep(1000);
            WebElement cnt4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
            cnt4.click();
            Thread.sleep(5000);
            //reportSection("InApp-AB Test","Information of Test Case","Test Case Pass","Test Case Fail","Test Case Skipped");
            Thread.sleep(3000);
            Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
            Thread.sleep(2000);
    }

    @Test(description = "InApp Test-User Property",priority = 5)
    public void InAppTestProp() throws Throwable {

        try {
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            System.out.println("Above Case Is Fail");
        } catch (Exception e) {
            System.out.println("Above Case Is Pass");
        }
            //Campaign Type Selection
            driver.navigate().to(BaseUrl);
            Thread.sleep(2000);
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
            ac.moveToElement(searchBox).sendKeys("Header", Keys.ENTER).build().perform();
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
            Thread.sleep(1000);

            //What Message Sent To User
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,-300)");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Message on user property']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(text(),'Select user property')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[contains(text(),'anguage')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='plus-button']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
            Thread.sleep(1000);
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
            DraftScheduleCamp("InApp Regression-User Property");
            //reportSection("InApp-User Property Test","Information of Test Case","Test Case Pass","Test Case Fail","Test Case Skipped");
            Thread.sleep(3000);
            Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
            Thread.sleep(2000);
        }


    @Test(description = "InApp Test-Legacy",priority = 6)
    public void InAppTestLegacy() throws Throwable {

        try {
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            System.out.println("Above Case Is Fail");
        } catch (Exception e) {
            System.out.println("Above Case Is Pass");
        }
            //Campaign Type Selection
            driver.navigate().to(BaseUrl);
            Thread.sleep(2000);
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
            ac.moveToElement(searchBox).sendKeys("Header", Keys.ENTER).build().perform();
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
            Thread.sleep(1000);

            //What Message Sent To User
            jse.executeScript("window.scrollBy(0,-200)");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Legacy']")).click();
            Thread.sleep(1000);
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
            DraftScheduleCamp("InApp Regression-Legacy");
            // reportSection("InApp-Legacy Test","Information of Test Case","Test Case Pass","Test Case Fail","Test Case Skipped");
            Thread.sleep(3000);
            Verify.verify(driver.findElement(By.xpath("//*[@data-page='statsPg']")).getText().equals("Stats"));
            Thread.sleep(2000);
        }


}
