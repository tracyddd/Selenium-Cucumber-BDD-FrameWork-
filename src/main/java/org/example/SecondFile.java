package org.example;

import org.openqa.selenium.WebDriver;

public class SecondFile {

    private WebDriver driver;

    // 构造函数，用于接收传入的 WebDriver 实例
    public SecondFile(WebDriver driver) {
        this.driver = driver;
    }

    public void useDriver() {
        // 使用 WebDriver 实例

        // Launch Google.com
        driver.get("https://www.google.com");

        // Optionally, you can maximize the browser window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
    }

}
