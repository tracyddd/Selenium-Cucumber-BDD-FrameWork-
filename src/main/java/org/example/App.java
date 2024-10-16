package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


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
        }

        // Close the browser
        // driver.quit();
    }
}
