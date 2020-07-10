package CT_Segment_Cases;

import Campaign_Creation_Cases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SegmentTest extends BaseTest {

    @Test(description = "Segment Test Action",priority = 0)
    public void actionSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");
        driver.findElement(By.xpath("//*[contains(text(),'Segments')]")).click();
        Thread.sleep(1000);
        List<WebElement> segOption = driver.findElements(By.xpath("//*[contains(text(),'Segments')]"));
        segOption.get(1).click();

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("ActionAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("ActionAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test InAction",priority = 1)
    public void InactionSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(1).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("InActionAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("InActionAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test User Property",priority = 2)
    public void actionUPropSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(2).click();
        Thread.sleep(1000);
        //Find People Test Case--Who Did Not
        driver.findElement(By.id("addAnotherStepFromUI")).click();

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

        //Save Segment
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("ActionPropAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("ActionPropAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test Single Action",priority = 3)
    public void singleActionSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(3).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("SingleActAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("SingleActAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test InAction Time",priority = 4)
    public void InActionTimeSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(4).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputLoader")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("InActionTimeAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("InActionTimeAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test Page Visit",priority = 5)
    public void PageVisitSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(6).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUrl")).sendKeys("Clevertap");
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("PageVisitAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("PageVisitAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test Reference Entry",priority = 6)
    public void RefEntrySeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(7).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUrl")).sendKeys("Clevertap");
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("RefEntryAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("RefEntryAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test Page Count",priority = 7)
    public void PageCountSeg() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(8).click();
        Thread.sleep(1000);
        driver.findElement(By.id("pageCount")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("PageCountAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("PageCountAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);
    }

    @Test(description = "Segment Test Action",priority = 8)
    public void SegmentActions() throws Throwable{
        //Find People Test Case
        System.out.println("Start Test");

        //Segment Creation
        Thread.sleep(2000);
        driver.findElement(By.id("createSegmentBtn")).click();
        List<WebElement> segTypes = driver.findElements(By.xpath("//*[@class='segCards_item']"));
        segTypes.get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("ActionAutoSegment");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Kebab Menu WebElements--Clone
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("ActionAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Clone']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegment")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("saveSegmentName")).sendKeys("ActionAutoSegment1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Delete Segment--Delete Clone
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("ActionAutoSegment1",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

        //Kebab Menu WebElements--Report
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("ActionAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='View report']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        //Delete Segment--Delete Clone
        ac.moveToElement(driver.findElement(By.id("searchDiv"))).click().sendKeys("ActionAutoSegment",Keys.ENTER).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Show segment actions']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-original-title='Delete']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='confirm']")).click();
        Thread.sleep(2000);

    }
}
