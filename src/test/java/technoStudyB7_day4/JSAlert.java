package technoStudyB7_day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//Find the button with Css alert ("tagname[attribute = 'value']));
        WebElement JsAlertButton = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        JsAlertButton.click();
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);



//        <button onclick="jsConfirm()">Click for JS Confirm</button>

         WebElement Jsconfirm =  driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));

         Jsconfirm.click();
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();

//        <button onclick="jsPrompt()">Click for JS Prompt</button>

        WebElement JsPrompt =  driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        JsPrompt.click();

        driver.switchTo().alert().sendKeys("My name is Umut");
        driver.switchTo().alert().accept();










    }
}
