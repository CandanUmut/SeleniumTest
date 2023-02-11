package technoStudyB7_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String input ="HELLLOOOO";

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

//        <button autocomplete="off" type="button" onclick="swapInput()">Enable</button>

//        Another Way to find with cssSelector
//        WebElement clickenableButton = driver.findElement(By.cssSelector("button[onclick='swapInput()'"));
//        clickenableButton.click();
//
//        Thread.sleep(5000);
//        <input type="text" style="width: 30%;">

        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputField = driver.findElement(By.cssSelector("input[type='text'"));
        enableButton.click();




        Thread.sleep(5000);
        inputField.sendKeys(input);

        boolean isEnabled =  inputField.isEnabled();


        System.out.println(isEnabled);







    }
}
