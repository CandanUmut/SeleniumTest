package technoStudyB7_day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);


        WebElement finishText = driver.findElement(By.cssSelector("#finish>h4"));
        webDriverWait.until(ExpectedConditions.visibilityOf(finishText));
        
        System.out.println(finishText.getText());


    }
}
