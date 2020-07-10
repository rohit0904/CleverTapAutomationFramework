package CT_CampaignPage_Cases;

import Campaign_Creation_Cases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class BulletinsTest extends BaseTest {

    @Test(description = "Campaign Page Locators-Filters",priority = 0)
    public void campFilters1() throws Throwable{
        System.out.println("Start Test");
/*
        //Define your business event
        driver.findElement(By.xpath("//*[contains(text(),'Bulletins')]")).click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Business Event')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='e.g. book.release']")).sendKeys("TestAutoLaunch");
        Thread.sleep(1000);
        WebElement propsFiled = driver.findElement(By.xpath("//*[@placeholder='Use the enter key to separate each property (e.g. book.name, author, genre)']"));
        propsFiled.click();
        ac.sendKeys("App Version 2.0",Keys.ENTER).build().perform();
        ac.sendKeys("OS Version",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Select user event']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Charged')]")).click();
        Thread.sleep(1000);
        List<WebElement> dropBox = driver.findElements(By.xpath("//*[@placeholder='Select event property']"));
        dropBox.get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'CT App Version')]")).click();
        Thread.sleep(1000);
        dropBox.get(2).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'App Version 2.0')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Save & Continue')]")).click();
        Thread.sleep(2000);

        //Start Creating Bulletins
        jse.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//span[contains(text(),'Create a Bulletin')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Select segment']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[contains(text(),'All Users')]")).click();
        driver.findElement(By.xpath("//*[@placeholder='Select user event property']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'App Version 2.0')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Select event property']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'CT App Version')]")).click();
        Thread.sleep(1000);
        List<WebElement> cntButton = driver.findElements(By.xpath("//*[contains(text(),'Continue')]"));
        cntButton.get(1).click();
        Thread.sleep(2000);

        //All Campaign Flow Test
        //Push Campaign Test
        driver.findElement(By.xpath("//*[@class='campaign-block__icn push']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        List<WebElement> templateSelect = driver.findElements(By.xpath("//span[contains(text(),'Select')]"));
        ac.moveToElement(templateSelect.get(0)).click().build().perform();
        Thread.sleep(1000);
        List<WebElement> whatMessage = driver.findElements(By.xpath("//*[@data-type='input']"));
        whatMessage.get(0).sendKeys("Title BI");
        whatMessage.get(1).sendKeys("Text BI");
        WebElement notificationChannel  = driver.findElement(By.xpath("//span[text()='Select Channel']"));
        ac.moveToElement(notificationChannel).click().build().perform();
        Thread.sleep(1000);
        WebElement channel = driver.findElement(By.id("selectaochannel_chzn_o_1"));
        ac.moveToElement(channel).click().build().perform();
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        //Setup Mobile Push Campaign
        Thread.sleep(2000);
        WebElement hrSel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@type='number']")));
        hrSel.sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //SMS Campaign Test
        driver.findElement(By.xpath("//*[@class='v-breadcrumbs__item'][text()='Channel']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Change']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='campaign-block__icn sms']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("tgt_message_text")).sendKeys("Test SMS in Bulletins");
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        List<WebElement> dropSMS = driver.findElements(By.xpath("//*[@class='v-select__selections']"));
        dropSMS.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='list-item-1693-0']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //Email Campaign Test
        driver.findElement(By.xpath("//*[@class='v-breadcrumbs__item'][text()='Channel']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Change']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='campaign-block__icn email']")).click();
        Thread.sleep(1000);
        List<WebElement> templateEmail = driver.findElements(By.xpath("//*[@class='template-wrapper']"));
        templateEmail.get(1).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-at-select='edit-sender-details']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-at-select='from-name']")).sendKeys("Test Auto Mail");
        driver.findElement(By.id("emoji_wzrk_email-subject")).sendKeys("Sample Test Mail");
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        List<WebElement> dropEmail = driver.findElements(By.xpath("//*[@class='v-select__selections']"));
        dropSMS.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='list-item-1796-0']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //WebPush Campaign Test
        driver.findElement(By.xpath("//*[@class='v-breadcrumbs__item'][text()='Channel']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Change']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='campaign-block__icn web-push']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("emoji_wzrk_tgt_message_title1")).sendKeys("Web Push");
        Thread.sleep(1000);
        driver.findElement(By.id("emoji_wzrk_tgt_message_text1")).sendKeys("TEst Auto");
        Thread.sleep(1000);
        driver.findElement(By.id("deepLinkInput")).sendKeys("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("ttlInput")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        //Final Push Campaign Creation
        driver.findElement(By.xpath("//*[@class='v-breadcrumbs__item'][text()='Channel']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Change']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='campaign-block__icn push']")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        List<WebElement> templateSelect1 = driver.findElements(By.xpath("//span[contains(text(),'Select')]"));
        templateSelect1.get(0).click();
        Thread.sleep(1000);
        List<WebElement> whatMessage1 = driver.findElements(By.xpath("//*[@data-type='input']"));
        whatMessage1.get(0).sendKeys("Title BI");
        whatMessage1.get(1).sendKeys("Text BI");
        WebElement notificationChannel1  = driver.findElement(By.xpath("//span[text()='Select Channel']"));
        ac.moveToElement(notificationChannel1).click().build().perform();
        Thread.sleep(1000);
        WebElement channel1 = driver.findElement(By.id("selectaochannel_chzn_o_1"));
        ac.moveToElement(channel1).click().build().perform();
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        //Setup Mobile Push Campaign
        Thread.sleep(2000);
        WebElement hrSel1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@type='number']")));
        hrSel1.clear();
        hrSel1.sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Save draft')]")).click();
        Thread.sleep(1000);
        List<WebElement> sampleBox = driver.findElements(By.xpath("//*[@class='v-text-field__slot']"));
        sampleBox.get(1).sendKeys("Regression Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save Draft']")).click();

        //Run Campaign
        jse.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@color='blue-grey lighten-2']"))).click();
        Thread.sleep(1000);
        List<WebElement> editMenu = driver.findElements(By.xpath("//*[@role='menuitem']"));
        editMenu.get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Publish')]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Ok, got it']"))).click();

        //Stop Campaign
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@color='blue-grey lighten-2']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Stop']")).click();

        //Clone Campaign
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@color='blue-grey lighten-2']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Clone']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Publish')]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Ok, got it']"))).click();

        //Stop and Archive Campaigns
        Thread.sleep(2000);
        List<WebElement> kebabMenu = driver.findElements(By.xpath("//*[@color='blue-grey lighten-2']"));
        kebabMenu.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Stop']")).click();
        Thread.sleep(1000);
        kebabMenu.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Archive']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Archive']")).click();
        Thread.sleep(2000);
        //Delete Next
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@color='blue-grey lighten-2']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Archive']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Archive']")).click();
        Thread.sleep(2000);
*/
        //Go to Menu Again
//        WebElement sideBar = driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"));
//        ac.moveToElement(sideBar).build().perform();
//        Thread.sleep(1000);
        WebElement goToBoard = driver.findElement(By.xpath("//*[contains(text(),'Bulletins')]"));
        goToBoard.click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        //Delete Bulletins
        Thread.sleep(2000);
        List<WebElement> kebabMenu1 = driver.findElements(By.xpath("//*[@color='blue-grey lighten-2']"));
        kebabMenu1.get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Archive']")).click();
        Thread.sleep(2000);
    }
}
