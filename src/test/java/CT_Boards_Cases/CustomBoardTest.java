package CT_Boards_Cases;

import Campaign_Creation_Cases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;


public class CustomBoardTest extends BaseTest {

    String BoardName="Test_Board_Do_Not_Delete";


    @Test(description = "Custom Board",priority = 0)
    public void cusBoard() throws Throwable {

        //Custom Boards Test Case
        System.out.println("Start Test");
        WebElement goToBoard = driver.findElement(By.xpath("//*[contains(text(),'Custom Boards')]"));
        goToBoard.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Board']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Give your board a name']")).sendKeys(BoardName);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='v-input--selection-controls__input']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Create']")).click();
        Thread.sleep(2000);

        //Add Cards In Board
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Events']"))).click();
        Thread.sleep(2000);
        driver.findElement(By.id("eventCountBoardPin")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@placeholder='Give your card a name']")).sendKeys("Event Count");
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[text()='Pin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Go to ')]")).click();
        Thread.sleep(2000);

        //Funnel Add In Board---
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Funnels']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addAnotherStep")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection2_chzn")).click();
        WebElement searchBox = driver.findElement(By.xpath("//div[@id='evtSelection2_chzn']//input"));
        ac.moveToElement(searchBox).sendKeys("Charged", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox1 = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox1).sendKeys("Added To Cart", Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value='View funnel']")).click();
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("funnelChartsBoardPin"))).click();
        Thread.sleep(3000);
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@placeholder='Give your card a name']")).sendKeys("Funnel Test");
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[text()='Pin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Go to ')]")).click();
        Thread.sleep(2000);

        //Segment Add In Board
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Segments']"))).click();
        Thread.sleep(1000);
        List<WebElement> segList = driver.findElements(By.xpath("//*[@class='CT-table__cell cellindex_2 CT-table__header--name']//a"));
        segList.get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.id("segmentBoardPin")).click();
        Thread.sleep(1000);
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@placeholder='Give your card a name']")).sendKeys("Segment Test");
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[text()='Pin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Go to ')]")).click();
        Thread.sleep(2000);

        //Find People Add In Board
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Find People']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addDidEvent")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("evtSelection1_chzn")).click();
        WebElement searchBox2 = driver.findElement(By.xpath("//div[@id='evtSelection1_chzn']//input"));
        ac.moveToElement(searchBox2).sendKeys("App Launched", Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("find")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reachabilityBoardPin"))).click();
        Thread.sleep(1000);
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[@placeholder='Give your card a name']")).sendKeys("Find People Test");
        Thread.sleep(600);
        driver.findElement(By.xpath("//*[text()='Pin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Go to ')]")).click();
        Thread.sleep(2000);

        //Card Level Test Case
        WebElement card1 = driver.findElement(By.xpath("//*[@class='card-inner-container']"));
        ac.moveToElement(card1).build().perform();
        Thread.sleep(2000);
        List<WebElement> cardButtons = driver.findElements(By.xpath("//*[@class='card-actions']//button"));
        cardButtons.get(0).click();
        Thread.sleep(1000);
        cardButtons.get(2).click();
        Thread.sleep(2000);
        cardButtons.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Refresh Cards']")).click();
        Thread.sleep(2000);

        //Delete Board
        driver.findElement(By.xpath("//*[@class='v-btn__content']//button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete board']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(1000);
    }

    @Test(description = "Custom Board Web Page Cases",priority = 1)
    public void customPage() throws Throwable{

        //Custom Board Verification
        driver.navigate().to(BaseUrl);
        Thread.sleep(2000);
        WebElement goToBoard = driver.findElement(By.xpath("//*[contains(text(),'Custom Boards')]"));
        goToBoard.click();
        Thread.sleep(1000);

        //Create Public Board
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Board']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Give your board a name']")).sendKeys("Test_Reg_Board_Public");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Create']")).click();
        Thread.sleep(2000);

        //Delete Board
        driver.findElement(By.xpath("//*[@class='v-btn__content']//button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete board']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(1000);


    }



}
