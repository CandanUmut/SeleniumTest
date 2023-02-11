package technoStudyB7_day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
// 1- Visit the page
//        2- Get the text of hidden text
//
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement button = driver.findElement(By.cssSelector("#start>button"));
        button.click();
        Thread.sleep(6000);
//<div id="finish" style=""><h4>Hello World!</h4></div>
        WebElement HelloWorld = driver.findElement(By.cssSelector("#finish>h4"));
        System.out.println(HelloWorld.getText());


    }
}
