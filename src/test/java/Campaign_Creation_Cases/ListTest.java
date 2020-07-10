package Campaign_Creation_Cases;

import org.testng.annotations.*;

public class ListTest {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }
}
