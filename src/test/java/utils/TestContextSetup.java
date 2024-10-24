package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;

public class TestContextSetup {
    public WebDriver driver;
    public String ProductName;

    public TestContextSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
        this.driver = new ChromeDriver();  // Initialize driver here
        driver.manage().window().maximize();

    }
}
