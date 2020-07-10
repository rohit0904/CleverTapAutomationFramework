package CT_CampaignPage_Cases;

import Campaign_Creation_Cases.BaseTest;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class SettingPageTest extends BaseTest {

    @Test(description = "Settings Page Cases-Schema Pages",priority = 0)
    public void EventProps() throws Throwable{

        //Custom Boards Test Case
        System.out.println("Start Test");
        WebElement goToSettings = driver.findElement(By.xpath("//*[contains(text(),'Settings')]"));
        goToSettings.click();
        Thread.sleep(1000);
        String AccountText = driver.findElement(By.xpath("//*[@class='pa-8']")).getText();
        //System.out.println(AccountText);
        Verify.verify(AccountText.contains("Add extra security by turning on two-factor authentication."));
        Thread.sleep(1000);
        WebElement settingOpt = driver.findElement(By.xpath("//*[contains(text(),'Schema')]"));
        settingOpt.click();
        Thread.sleep(1000);
        WebElement EventProps = driver.findElement(By.xpath("//*[contains(text(),'Events/User Properties')]"));
        EventProps.click();
        Thread.sleep(1000);
        int TotalEventCount = driver.findElements(By.xpath("//*[@name='events-check-box']")).size();
        Thread.sleep(1000);
        //System Event
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eventsFilter"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='event-type_0']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);
        int SystemEventCount = driver.findElements(By.xpath("//*[@name='events-check-box']")).size();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eventsFilter"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='clear-all-filter']"))).click();
        Thread.sleep(1000);
        //Active Event
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eventsFilter"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='event-type_1']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);
        int ActiveEventCount = driver.findElements(By.xpath("//*[@name='events-check-box']")).size();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eventsFilter"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='clear-all-filter']"))).click();
        Thread.sleep(1000);
        //Discarded Events
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eventsFilter"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@for='event-type_2']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Apply']")).click();
        Thread.sleep(1000);
        int DiscardEventCount = driver.findElements(By.xpath("//*[@name='events-check-box']")).size();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eventsFilter"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='clear-all-filter']"))).click();
        Thread.sleep(1000);
        Verify.verify(TotalEventCount==SystemEventCount+DiscardEventCount+ActiveEventCount);
//      System.out.println("System Event:-"+SystemEventCount+" Active Event:-"+ActiveEventCount+" Discarded Events:-"+DiscardEventCount+" Total Event:-"+TotalEventCount);

        //2nd Page in Schema Conversion
        Thread.sleep(1000);
        WebElement EventProps1 = driver.findElement(By.xpath("//*[contains(text(),'Conversion Event')]"));
        EventProps1.click();
        Thread.sleep(1000);

        //3rd Page
        Thread.sleep(1000);
        WebElement EventProps2 = driver.findElement(By.xpath("//*[contains(text(),'Qualifying Event')]"));
        EventProps2.click();
        Thread.sleep(1000);
    }

    @Test(description = "Settings Page Cases-User Invite",priority = 1)
    public void UserInvitePage() throws Throwable{

        //Custom Boards Test Case
        System.out.println("Start Test.");
        WebElement goToUsers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Users')]")));
        goToUsers.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='filterbtn'][text()='Role']"))).click();
        driver.findElement(By.xpath("//*[@for='role_0']")).click();
        Thread.sleep(1000);
        List<WebElement> applyBtn = driver.findElements(By.xpath("//*[text()='Apply']"));
        applyBtn.get(0).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='filterbtn'][text()='Role']"))).click();
        Thread.sleep(1000);
        List<WebElement> clearBtn = driver.findElements(By.xpath("//*[@class='clear-all-filter']"));
        clearBtn.get(0).click();
        Thread.sleep(1000);

    }

    @Test(description = "Settings Page Cases-Roles Page",priority = 2)
    public void RolesPage() throws Throwable{

        //Create Role Test Case
        System.out.println("Start Test Roles");
        WebElement goToUsers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Roles')]")));
        goToUsers.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn add-button btn-success']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Create Role']")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameInput"))).sendKeys("AutoTestRole");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save']")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("//*[text()='OK']")).click();
        Thread.sleep(1000);

        //Edit Role
        List<WebElement> menuBarRole = driver.findElements(By.xpath("//*[@class='actions-button']"));
  /*      menuBarRole.get(0).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='View / Edit role']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Proceed']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Edit Role']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='OK']")).click();
        Thread.sleep(1000);

        //Clone Role
        menuBarRole.get(0).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Clone role']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Create Role']")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameInput"))).sendKeys("AutoTestRole-Clone");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Save']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='OK']")).click();
        Thread.sleep(1000);

        //Delete Roles--1
        menuBarRole.get(0).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Delete role']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='OK']")).click();
        Thread.sleep(1000);
*/
        //Delete Roles--2
        menuBarRole.get(0).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Delete role']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='OK']")).click();
        Thread.sleep(2000);
    }
}
