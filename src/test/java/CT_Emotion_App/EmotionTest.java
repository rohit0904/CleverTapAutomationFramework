package CT_Emotion_App;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.mail.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Listeners(ExtentReporteFile.TestListeners.class)

public class EmotionTest
{
    WebDriver driver;
    Actions ac;
    WebDriverWait wait;
    JavascriptExecutor jse;
    ChromeOptions cos;
    String Twitter_icon_Test="Twitter";
    String Facebook_icon_Test="Facebook";
    String LinkedIn_icon_Test="Sign Up | LinkedIn";
    private String saveDirectory;


    @BeforeTest
    public void starEmotion() throws Throwable{
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

    @Test(description = "Social Icons Test",priority = 0)
    public void case1EmotionSocialIcons() throws Throwable {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://dev.emotions.clevertap.tech/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='v-icon notranslate icon icon-twitter theme--light']")).click();
        Thread.sleep(1000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(),Twitter_icon_Test);
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='v-icon notranslate icon icon-facebook theme--light']")).click();
        Thread.sleep(1000);
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(),Facebook_icon_Test);
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='v-icon notranslate icon icon-linkedin theme--light']")).click();
        Thread.sleep(1000);
        ArrayList<String> tab3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab3.get(1));
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(),LinkedIn_icon_Test);
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(1000);
    }

    @Test(description = "Type Box Test",priority = 1)
    public void case2EmotionTextBoxes() throws Throwable{
        driver.findElement(By.xpath("//*[@contenteditable='true']")).click();
        Thread.sleep(1000);
        ac.sendKeys(Keys.BACK_SPACE).build().perform();
        ac.sendKeys("Here We are going to Announce Sale.").build().perform();
        jse.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.xpath("//*[text()='Analyze ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("copy-button")).click();
        Assert.assertEquals("Text successfully copied",wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Text successfully copied']"))).getText());
        Thread.sleep(1000);
        WebElement copyText = driver.findElement(By.id("message-copy"));
        String CopiedText = copyText.getAttribute("value");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Clear All']")).click();
        Thread.sleep(1000);
        WebElement textEditor = driver.findElement(By.xpath("//*[@contenteditable='true']"));
        textEditor.click();
        textEditor.sendKeys(CopiedText+"Copy Paste");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Analyze ']")).click();
        Thread.sleep(2000);

    }

    @Test(description = "CSV File and Log Test", priority = 2)
    public void case3CsvUpload () throws Throwable {
        driver.findElement(By.xpath("//*[contains(text(),'Get My Free Report')]")).click();
        Thread.sleep(1000);
        WebElement fileUpload = driver.findElement(By.xpath("//input[@accept='text/csv']"));
        Thread.sleep(1000);
        fileUpload.sendKeys("/Users/rohit.singh/IdeaProjects/CleverTap/Test_Files/TestFile.csv");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@placeholder='Enter Full Name']")).sendKeys("Rohit321");
        driver.findElement(By.xpath("//*[@placeholder='Enter Work Email']")).sendKeys("rsingh.ak95@gmail.com");
        driver.findElement(By.xpath("//*[contains(text(),'Get Report')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'Take me to the text editor')]")).click();
        Thread.sleep(3000);

    }

    @Test(description = "Email Verification Test", priority = 3)
    public  void checkMails() throws Throwable {

        //create properties field
        Thread.sleep(3000);
        Properties properties = new Properties();

        properties.put("mail.pop3.host", "pop.gmail.com");
        properties.put("mail.pop3.port", "995");
        properties.put("mail.pop3.starttls.enable", "true");
        Session emailSession = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rohit.singh@clevertap.com", "bug@123456");
            }
        });

        //create the POP3 store object and connect with the pop server
        Store store = emailSession.getStore("pop3s");

        store.connect("pop.gmail.com", "rohit.singh@clevertap.com", "bug@123456");

        //create the folder object and open it

        Folder emailFolder = store.getFolder("INBOX");
        emailFolder.open(Folder.READ_ONLY);

        // retrieve the messages from the folder in an array and print it
        Message[] messages = emailFolder.getMessages();
        //System.out.println("messages.length---" + messages.length);

        Message message = messages[0];
        System.out.println("---------------------------------");
        System.out.println("Subject: " + message.getSubject());
        System.out.println("From: " + message.getFrom()[0]);
        System.out.println("Time: " + message.getSentDate());

    }

    @AfterTest
    public void closeEmotion() throws Throwable{
        Thread.sleep(2000);
        driver.quit();
    }
}
