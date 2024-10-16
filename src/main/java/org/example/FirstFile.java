package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstFile {
    public static void main(String[] args) {
        // 初始化 WebDriver 实例

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // 传递 WebDriver 实例到 SecondFile 类
        SecondFile secondFile = new SecondFile(driver);
        secondFile.useDriver();

        ThirdFile thirdFile = new ThirdFile(driver);
        thirdFile.useDriver();

        // 关闭 driver
        driver.quit();
    }
}
