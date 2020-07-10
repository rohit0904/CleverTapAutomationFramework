package Campaign_Creation_Cases;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
   public WebDriver driver;
   public WebDriverWait wait;
   public Actions ac;
   public JavascriptExecutor jse;
   public WebElement psb_ac,sea1;
   public List<WebElement> segList;
   public WebElement subButton;
   public ChromeOptions cos;
   public Process pr,elsDash,kibanaDash;
   public String BaseUrl,RedirectURL,UserID,Password;
   Properties prop = new Properties();


   @BeforeSuite
   public void setInstance() throws Throwable{
      // startServices();
   }

   @AfterSuite
   public void destroyInstance()throws Throwable{
       //stopServices();
   }

   @BeforeClass
   public void tearUp() throws Throwable{
       valuesSet();
       webCaseTest();
       webLaunch();
       loginCT();
       wait = new WebDriverWait(driver, 60);
   }

   @AfterClass
   public void tearDown() throws Throwable{
       Thread.sleep(3000);
       driver.quit();
       Thread.sleep(3000);
       System.out.println("End Test");
   }

    public void valuesSet() throws Throwable{
        InputStream input = new FileInputStream("./resources/Property_File/user.properties");
        prop.load(input);
        BaseUrl = prop.getProperty("sk10");
        RedirectURL = BaseUrl+prop.getProperty("Retention")+"/dashboards/daily/today";
        UserID = prop.getProperty("username");
        Password = prop.getProperty("password");

    }

    public void webCaseTest(){
        System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver");
        cos = new ChromeOptions();
        cos.setHeadless(true);
        cos.addArguments("--window-size=1920,1080");
        cos.addArguments("--disable-gpu");
        cos.addArguments("--disable-extensions");
        cos.setExperimentalOption("useAutomationExtension", false);
        cos.addArguments("--proxy-server='direct://'");
        cos.addArguments("--proxy-bypass-list=*");
        cos.addArguments("--start-maximized");
        cos.addArguments("--headless");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        ac = new Actions(driver);
        jse =  (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void webLaunch() throws Throwable {
        System.out.println("App Launch Successfully");
        driver.get(BaseUrl);
        Thread.sleep(3000);
    }

    public void loginCT() throws Throwable {
        driver.findElement(By.name("email")).sendKeys(UserID);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@type='submit'][text()='Log In']")).click();
        Thread.sleep(3000);
       driver.navigate().to(RedirectURL);
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println("Login Done Successfully");
    }

    public void notiChannelSelection() throws Throwable{
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,200)");
        WebElement dropChannel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Channel')]")));
        dropChannel.click();
        Thread.sleep(2000);
        WebElement channelSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='selectaochannel_chzn_o_1']")));
        channelSelect.click();
        Thread.sleep(2000);
    }

    public void DraftScheduleCamp(String CampName) throws Throwable{
        //Draft Campaign
        WebElement drButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_save_as_draft")));
        drButton.click();
        WebElement txtDr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jname")));
        txtDr.sendKeys(CampName);
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
        WebElement cnt3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn_top_nav_continue']")));
        cnt3.click();
        Thread.sleep(5000);
    }

    public void startServices() throws Throwable{
        elsDash = Runtime.getRuntime().exec("/Users/rohit.singh/Documents/elasticsearch-6.8.7/bin/elasticsearch");
        Thread.sleep(5000);
        kibanaDash = Runtime.getRuntime().exec("/Users/rohit.singh/Documents/kibana-6.5.2-darwin-x86_64/bin/kibana");
        Thread.sleep(5000);

    }

    public void stopServices() throws Throwable{
        Thread.sleep(3000);
        elsDash.destroy();
        Thread.sleep(3000);
        kibanaDash.destroy();
        Thread.sleep(3000);
    }

}