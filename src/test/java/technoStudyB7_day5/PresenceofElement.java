package technoStudyB7_day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresenceofElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/");

        WebElement TestNGbutton = driver.findElement(By.linkText("TestNG"));

        TestNGbutton.click();

        WebElement TestNgtext =driver.findElement(By.cssSelector(".section-title>h1"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".section-title>h1")));

        String testngtect =TestNgtext.getText();
        System.out.println(testngtect);

    }
}
