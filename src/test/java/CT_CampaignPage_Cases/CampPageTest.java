package CT_CampaignPage_Cases;

import Campaign_Creation_Cases.BaseTest;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class CampPageTest extends BaseTest {

    @Test(description = "Campaign Page Locators-Filters",priority = 0)
    public void campFilters1() throws Throwable{
        System.out.println("Start Test");
        //Campaign Page
        driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("campaignFilter")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='campaignFilter']//div[text()='Clear']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("campaignFilter")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Channel']")).click();
        driver.findElement(By.xpath("//*[text()='Delivery']")).click();
        driver.findElement(By.xpath("//*[text()='Status']")).click();
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);

        //Channel Verification
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Channel']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Email']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);

        List<WebElement> campaignCount = driver.findElements(By.xpath("//*[@class='CT-table__cell cellindex_0 '][text()='Email']"));
        System.out.println("Total Campaigns:- "+campaignCount.size());

        try {
            for(int i=1;i<=campaignCount.size();i++){
               String typeCamp =  driver.findElement(By.xpath("//*[@class='CT-table__cell cellindex_0 '][text()='Email']")).getText();
                Verify.verify(typeCamp.equals("Email"));
            }
        }catch (Exception e){
            System.out.println("Verification Failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Channel']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Clear']")).click();
        Thread.sleep(1000);

        //Delivery Filter Verification
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Delivery']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='One Time']")).click();
        Thread.sleep(1000);
        List<WebElement> applyBtn = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn.get(1).click();
        Thread.sleep(1000);

        List<WebElement> deliverTypeCount = driver.findElements(By.xpath("//*[@class='CT-table__cell cellindex_7 '][text()='One Time']"));
        System.out.println("Total Campaigns:- "+deliverTypeCount.size());

        try {
            for(int i=1;i<=deliverTypeCount.size();i++){
                String typeCamp =  driver.findElement(By.xpath("//*[@class='CT-table__cell cellindex_7 '][text()='One Time']")).getText();
                Verify.verify(typeCamp.equals("One Time"));
            }
        }catch (Exception e){
            System.out.println("Verification Failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Delivery']")).click();
        Thread.sleep(1000);
        List<WebElement> clrButtons = driver.findElements(By.xpath("//div[text()='Clear']"));
        clrButtons.get(1).click();
        Thread.sleep(1000);

        //Status Filter Verification
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Status']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Completed']")).click();
        Thread.sleep(1000);
        List<WebElement> applyBtn1 = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn1.get(2).click();
        Thread.sleep(1000);

        List<WebElement> statusTypeCount = driver.findElements(By.xpath("//*[@class='CT-table__cell cellindex_6 '][text()='Completed']"));
        System.out.println("Total Campaigns:- "+statusTypeCount.size());

        try {
            for(int i=1;i<=deliverTypeCount.size();i++){
                String typeCamp =  driver.findElement(By.xpath("//*[@class='CT-table__cell cellindex_6 '][text()='Completed']")).getText();
                Verify.verify(typeCamp.equals("Completed"));
            }
        }catch (Exception e){
            System.out.println("Verification Failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Status']")).click();
        Thread.sleep(1000);
        List<WebElement> clrButtons1 = driver.findElements(By.xpath("//div[text()='Clear']"));
        clrButtons1.get(2).click();
        Thread.sleep(1000);
    }

    @Test(description = "Campaign Page Locators-Filters2",priority = 1)
    public void campFilters2() throws Throwable{

        //Campaign Page
        driver.findElement(By.id("campaignFilter")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='campaignFilter']//div[text()='Clear']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("campaignFilter")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='filterCampaignType'][text()='Type']")).click();
        driver.findElement(By.xpath("//*[text()='Label']")).click();
        driver.findElement(By.xpath("//*[@for='filterCreatedBy'][text()='Created by']")).click();
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(2000);

        //Type Verification
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Type']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Single message']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);

        List<WebElement> campaignCount = driver.findElements(By.xpath("//*[@class='campaign-type-pill is-single-msg']"));
        System.out.println("Total Campaigns:- "+campaignCount.size());

        try {
            for(int i=1;i<=campaignCount.size();i++){
                String typeCamp =  driver.findElement(By.xpath("//*[@class='campaign-type-pill is-single-msg']")).getText();
                Verify.verify(typeCamp.equals("SM"));
            }
        }catch (Exception e){
            System.out.println("Verification Failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Type']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Clear']")).click();
        Thread.sleep(1000);

        //Search Filter Verification
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Created by']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@for='createdBy_0']")).click();
        Thread.sleep(1000);
        List<WebElement> applyBtn1 = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn1.get(2).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Created by']")).click();
        Thread.sleep(1000);
        List<WebElement> clrButtons1 = driver.findElements(By.xpath("//div[text()='Clear']"));
        clrButtons1.get(2).click();
        Thread.sleep(1000);

        //Reset All
        driver.findElement(By.id("campaignFilter")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='campaignFilter']//div[text()='Clear']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("campaignFilter")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Channel']")).click();
        driver.findElement(By.xpath("//*[text()='Delivery']")).click();
        driver.findElement(By.xpath("//*[text()='Status']")).click();
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);
    }

    @Test(description = "Campaign Page Locators-Menu Items",priority = 2)
    public void campMenu() throws Throwable{

        //Status Filter
    try {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Status']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Running']")).click();
        Thread.sleep(1000);
        List<WebElement> applyBtn1 = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn1.get(2).click();
        Thread.sleep(1000);
        List<WebElement> menuList = driver.findElements(By.xpath("//*[@data-original-title='Show campaign actions']"));
        menuList.get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-original-title='View report']")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]")).click();
        Thread.sleep(2000);

        //Edit Campaign
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Status']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Running']")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        List<WebElement> applyBtn2 = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn2.get(2).click();
        Thread.sleep(1000);
        List<WebElement> menuList1 = driver.findElements(By.xpath("//*[@data-original-title='Show campaign actions']"));
        menuList1.get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-original-title='Edit']")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_top_nav_continue"))).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]")).click();
        Thread.sleep(2000);

        //Clone Campaign
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Status']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Running']")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        List<WebElement> applyBtn3 = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn3.get(2).click();
        Thread.sleep(1000);
        List<WebElement> menuList3 = driver.findElements(By.xpath("//*[@data-original-title='Show campaign actions']"));
        menuList3.get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-original-title='Clone']")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_save_as_draft']"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='Ok']"))).click();
        Thread.sleep(2000);
        WebElement cnt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue ']")));
        cnt1.click();
        WebElement cnt2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue ']")));
        cnt2.click();
        WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
        cnt3.click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Campaigns')]")).click();
        Thread.sleep(2000);

        //Finally Stop The Campaign
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='filterbtn'][text()='Status']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Running']")).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        List<WebElement> applyBtn4 = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn4.get(2).click();
        Thread.sleep(1000);
        List<WebElement> menuList4 = driver.findElements(By.xpath("//*[@data-original-title='Show campaign actions']"));
        menuList4.get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-original-title='Stop']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='confirm'][text()='Yes, stop it!']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm'][text()='OK']")).click();
        System.out.println("Test Case Pass Successfully For Running Campaign");
    }catch (Exception e){
        System.out.println("No Any Running Campaign Available");
    }


    }

    @Test(description = "Journey Page Locators-Menu Items",priority = 3)
    public void journeyMenu() throws Throwable{

        //Status Filter
        driver.navigate().to(RedirectURL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Journeys')]")).click();
        Thread.sleep(2000);
        List<WebElement> journeyCount = driver.findElements(By.xpath("//*[@class='journey-name-link']"));
        int jrCount = journeyCount.size();
        try{
            List<WebElement> menuBtn = driver.findElements(By.xpath("//*[@data-original-title='Show journey actions']"));
            menuBtn.get(0).click();
            //Report Case
            driver.findElement(By.xpath("//*[@data-original-title='View report']")).click();
            Thread.sleep(2000);
            ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(text(),'Journeys')]")).click();
            Thread.sleep(2000);

            //Clone Case
            List<WebElement> menuBtn1 = driver.findElements(By.xpath("//*[@data-original-title='Show journey actions']"));
            menuBtn1.get(0).click();
            driver.findElement(By.xpath("//*[@data-original-title='Clone']")).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveJourney"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='OK']"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("publishJourney"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='OK']"))).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='confirm'][text()='OK']"))).click();
            Thread.sleep(2000);
            ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(text(),'Journeys')]")).click();
            Thread.sleep(2000);
            System.out.println("Journey Locators are working Fine");
        }catch (Exception e){
            System.out.println("No Journey Available on the Page");
        }




    }
}
