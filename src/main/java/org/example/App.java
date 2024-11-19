package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        // Launch Google.com
        driver.get("https://www.google.com");
        // Optionally, you can maximize the browser window
        driver.manage().window().maximize();
        // Add a delay to keep the browser open for a while (optional)
        try {
            Thread.sleep(5000); // Keeps the browser open for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
            //     Log.info("Error occurred while navigating to login page", e);
        }
        // Close the browser
        driver.quit();
/*
         System.out.println("\nRunning Test -> testSum");
         SomeClassToTest obj = new SomeClassToTest();
         int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 2);
        System.out.println("\nLine after assert 1");
        Assert.assertEquals(result,3);
        System.out.println("\nLine after assert 2");

        SoftAssert sa=new SoftAssert();
        System.out.println("\nRunning Test -> testSum -- 2 ");
        SomeClassToTest obj2 = new SomeClassToTest();
        int result2 = obj2.sumNumbers(1, 2);
        sa.assertEquals(result2, 2);
        System.out.println("\nLine after assert 1");
        sa.assertEquals(result2,3);
        System.out.println("\nLine after assert 2");
        sa.assertAll();
 */


/*

    @BeforeClass
    @Parameters({"browser", "platform"})  //setup different browsers
    public void setUp(String browser, String platform){
        System.out.println("\nThis runs setUp before Class");
    }
    @AfterClass
    public void cleanUp(){
        System.out.println("\nThis runs setUp after Class");
    }

     @BeforeMethod
     public void beforeMethod() {
         System.out.println("\nThis runs before every method");
     }
     @AfterMethod
     public void afterMethod() {
         System.out.println("\nThis runs after every method");
     }
     @Test (dependsOnMethods ={"testMethod2"} )  // run testMethod2 first, then run this one. for series dependencies, once one fail, then the rest will be skipped
     public void testMethod1() {
         System.out.println("\nRunning Test -> testMethod 1");
     }
     @Test
     public void testMethod2() {
         System.out.println("\nRunning Test -> testMethod 2");
     }

    @Test(enabled = false)  //will be skipped or ignored
    public void testMethod3() {
        System.out.println("\nRunning Test -> testMethod 3");
    }

    @Test(timeOut = 100)  //milliseconds
    public void testMethod4() throws InterruptedException {
        System.out.println("\nRunning Test -> testMethod 3");
        Thread.sleep(200);
    }

 */
    }

 }

