package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Utilities {
    private final TestContextSetup testContextSetup;
    private final WebDriver driver;

    public Utilities(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;  // 将 driver 初始化为 testContextSetup.driver which can simply use "driver" instead of "testContextSetup.driver"
    }

public static class tackTakeScreenshot {

    public static void tackTakeScreenshot() throws Exception {


//       // * This function will take screenshot
//       //Convert web driver object to TakeScreenshot
//           TakesScreenshot scrShot = ((TakesScreenshot)driver);
//       //Call getScreenshotAs method to create image file
//           File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//       //Move image file to new destination
//           File DestFile = new File(fileWithPath);
//       //Copy file at destination
//           FileUtils.copyFile(SrcFile, DestFile);
        }
    }
}