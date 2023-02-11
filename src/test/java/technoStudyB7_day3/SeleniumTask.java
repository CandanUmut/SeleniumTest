package technoStudyB7_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.OutputStream;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

//        1- find all option chekcbox and select them all
//        1. checkbox <input type="checkbox" class="cb1-element" value="">
//        <input type="checkbox" class="cb1-element" value="">



        WebElement firstcheckbox = driver.findElement(By.cssSelector("checkbox[value='Option 1"));
        firstcheckbox.click();
        String a = "Option ";
        int b = 0;
        for (int i = 0; i < 4; i++) {
            b++;
            String option = a + Integer.toString(b);
            System.out.println(option);
            System.out.println(b);


        }





    }

}
