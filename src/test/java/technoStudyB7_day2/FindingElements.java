package technoStudyB7_day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        // Set up the browser driver (Selenium going to knock the door of browser driver)
        WebDriverManager.chromedriver().setup();

        // webdriver object creation
        WebDriver driver= new ChromeDriver();



        driver.get("https://techno.study");
        Thread.sleep(1500);

        driver.navigate().to("http://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();

        //finding the webelement on facebook
        WebElement slogantext =  driver.findElement(By.className("_8eso"));
        String expectedslogantext1 = "Connect with friends and the world around you on Facebook.";
        String actualtext = slogantext.getText();

        if (expectedslogantext1.equals(actualtext)){
            System.out.println("Verification is done : PASS");
            System.out.println(actualtext);

        }else {
            System.out.println("Verification is done : FAIL");
            System.out.println(actualtext);
        }






    }
}
