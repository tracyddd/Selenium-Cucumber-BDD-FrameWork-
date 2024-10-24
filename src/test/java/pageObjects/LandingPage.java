package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private final WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

   By search=By.xpath("//input[@type='search']");
   By productName=By.cssSelector("h4.product-name");

    public void searchItem(String name){
        System.out.println("searching :"+name);
        driver.findElement(search).sendKeys(name);
    }

    public void getSearchText(){
       String getSearchTextResult= driver.findElement(search).getText();
        System.out.println("getSearchTextResult is: "+getSearchTextResult);
    }

    public String getProductName() {
        String productNameText = driver.findElement(productName).getText().split("-")[0].trim();
        System.out.println("productName: " + productNameText + " is extracted from Home page");
        return productNameText;
    }
}
