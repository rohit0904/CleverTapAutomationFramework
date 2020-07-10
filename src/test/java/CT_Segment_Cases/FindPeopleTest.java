package CT_Segment_Cases;

import Campaign_Creation_Cases.BaseTest;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FindPeopleTest extends BaseTest {

    @Test(description = "Find People Test Did",priority = 0)
    public void whoDidCase() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addDidEvent")).click();

        //Event Selection When to Send Campaign
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("App Launched", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("find"))).click();
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("save"))).click();
        Thread.sleep(1000);
        driver.findElement(By.id("groupName")).sendKeys("User Who Did Query");
        Thread.sleep(1000);
        driver.findElement(By.id("saveGroupButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();

        //Delete Bookmark Event Details
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='segment-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Find People Test Did Not",priority = 1)
    public void whoDidNotCase() throws Throwable{
        //Find People Test Case--Who Did Not
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addDidNotEvent"))).click();

        //Event Selection When to Send Campaign
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("find"))).click();
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("save"))).click();
        Thread.sleep(1000);
        driver.findElement(By.id("groupName")).sendKeys("User Who Did Not Query");
        Thread.sleep(1000);
        driver.findElement(By.id("saveGroupButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();

        //Delete Bookmark Event Details
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='segment-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Find People Test User Properties",priority = 2)
    public void userPropsCase() throws Throwable{
        //Find People Test Case--Who Did Not
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addAnotherStepFromUI"))).click();

        jse.executeScript("window.scrollBy(0,300)");
        //User Property Selection
        Thread.sleep(2000);
        driver.findElement(By.id("level1_0_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='level1_0_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("User Properties", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Property Type
        Thread.sleep(2000);
        driver.findElement(By.id("profileSelect1_0_chzn")).click();
        WebElement searchBox2 = driver.findElement(By.xpath("//div[@id='profileSelect1_0_chzn']//input"));
        ac.moveToElement(searchBox2).sendKeys("Language", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Compare Type
        Thread.sleep(2000);
        driver.findElement(By.id("profileSelect2_0_chzn")).click();
        WebElement searchBox3 = driver.findElement(By.id("profileSelect2_0_chzn_o_3"));
        searchBox3.click();
        Thread.sleep(1000);

        //Value For Property
        driver.findElement(By.id("profileInputBox_0")).sendKeys("English");

        //Find People With Query
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("find"))).click();
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("save"))).click();
        Thread.sleep(1000);
        driver.findElement(By.id("groupName")).sendKeys("User Property Query");
        Thread.sleep(1000);
        driver.findElement(By.id("saveGroupButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();

        //Delete Bookmark Event Details
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='segment-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Find People with All Mini Who Query Test",priority = 3)
    public void allQueryCase() throws Throwable{

        //User Who Did
        driver.findElement(By.id("addDidEvent")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("App Launched", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //User Who Din Not
        jse.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.id("addDidNotEvent")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox2 = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox2).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(2000);

        //User Property Selection
        jse.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.id("addAnotherStepFromUI")).click();
        jse.executeScript("window.scrollBy(0,300)");
        //User Property Selection
        Thread.sleep(2000);
        driver.findElement(By.id("level1_0_chzn")).click();
        Thread.sleep(1000);
        WebElement searchBox3 = driver.findElement(By.xpath("//div[@id='level1_0_chzn']//input"));
        ac.moveToElement(searchBox3).sendKeys("User Properties", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Property Type
        Thread.sleep(2000);
        driver.findElement(By.id("profileSelect1_0_chzn")).click();
        Thread.sleep(1000);
        WebElement searchBox4 = driver.findElement(By.xpath("//div[@id='profileSelect1_0_chzn']//input"));
        ac.moveToElement(searchBox4).sendKeys("Language", Keys.ENTER).build().perform();
        Thread.sleep(1000);

        //Compare Type
        Thread.sleep(2000);
        driver.findElement(By.id("profileSelect2_0_chzn")).click();
        Thread.sleep(1000);
        WebElement searchBox5 = driver.findElement(By.id("profileSelect2_0_chzn_o_3"));
        searchBox5.click();
        Thread.sleep(1000);

        //Value For Property
        driver.findElement(By.id("profileInputBox_0")).sendKeys("English");

        //Find People With Query
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='View details']"))).click();
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("save"))).click();
        Thread.sleep(1000);
        driver.findElement(By.id("groupName")).sendKeys("All Query");
        Thread.sleep(1000);
        driver.findElement(By.id("saveGroupButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();

        //Delete Bookmark Event Details
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Manage')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='segment-bookmark-table']//span[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
        Thread.sleep(2000);
        ac.moveToElement(driver.findElement(By.xpath("//*[@class='referrer py-3 d-flex align-center px-4']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Daily Boards')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(2000);

    }

    @Test(description = "Find People with Identity Test",priority = 4)
    public void UserIDCase() throws Throwable{

        //User GUID OR EMAIL Search
        driver.findElement(By.id("searchIput")).sendKeys("amit@clevertap.com");
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(2000);
        try {
            String emailID = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("more-emails"))).getText();
            Thread.sleep(1000);
            Verify.verify(emailID.equals("cliford@clevertap.com"));
            Thread.sleep(1000);

            //Copy And Search With GUID For Same User
            String guid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("more-guids"))).getText();
            Thread.sleep(500);
            ac.moveToElement(driver.findElement(By.id("sq"))).click().sendKeys(guid, Keys.ENTER).build().perform();
            Thread.sleep(2000);
            Verify.verify(emailID.equals("amit@clevertap.com"));
            Thread.sleep(1000);
            System.out.println("User Verification Pass");
        }catch (Exception e){
            System.out.println("User Not Found");
        }
    }
}
