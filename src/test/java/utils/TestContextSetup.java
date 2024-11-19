package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class TestContextSetup {
    public WebDriver driver;
    public String ProductName;

    public TestContextSetup() {
        // Accept Https Certificates
        ChromeOptions options = new ChromeOptions();
        //Block pop=up windows
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        /* setup Proxy

        //Proxy proxy=new Proxy();
        //proxy.setHttpProxy("username","password");
        //options.setCapability("proxy", proxy);

        //setup options for different type of the browsers
        // FirefoxOptions options_firefox = new FirefoxOptions();
        //options_firefox.setAcceptInsecureCerts(true);

        //EdgeOptions options_edge = new EdgeOptions();
        //options_edge.setAcceptInsecureCerts(true);

        */

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
        this.driver = new ChromeDriver(options);  // Initialize driver here to add "options" in () for accepting certificates
        driver.manage().window().maximize();

    }
}
