package technoStudyB7_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");




//        <input type="checkbox" id="isAgeSelected" value=""> CHECKBOX
//1- Visit this page
//2- Locate the check Box
//3- Select the box
//4- And check it is verified or not
        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
        checkbox.click();


//        <div id="txtAge" style="display: block;">Success - Check box is checked</div> Verification

        WebElement verification = driver.findElement(By.id("txtAge"));
        String actualresult = verification.getText();
        String expectedResult = "Success - Check box is checked";

        if (actualresult.equals(expectedResult)){
            System.out.println("Verification is Done : PASS");
        }



    }
}
