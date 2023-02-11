package technoStudyB7_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

//        <button>Start</button>

//        Test Case
//        1-Visit the page
//        2-Verify if the hidden text displayed
//        3.Click on button
//        4- Verify if the hidden text displayed
        WebElement button =driver.findElement(By.cssSelector("#start>button"));

        WebElement isDisplayed = driver.findElement(By.cssSelector("#finish>h4"));
        boolean isdislayed1 =isDisplayed.isDisplayed();
        System.out.println(isdislayed1);

        button.click();
        Thread.sleep(14000);
        boolean isdisplayedafterclic = isDisplayed.isDisplayed();
        System.out.println(isdisplayedafterclic);












    }
}
