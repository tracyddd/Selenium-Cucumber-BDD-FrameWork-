package utils;

import org.openqa.selenium.WebDriver;

public class Utilities {
    private final TestContextSetup testContextSetup;
    private final WebDriver driver;

    public Utilities(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;  // 将 driver 初始化为 testContextSetup.driver which can simply use "driver" instead of "testContextSetup.driver"
    }

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

