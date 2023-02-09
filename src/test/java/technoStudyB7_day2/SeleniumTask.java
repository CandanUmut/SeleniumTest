package technoStudyB7_day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String input ="myinput";
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");


        WebElement entermessagebox =driver.findElement(By.className("form-control"));
        entermessagebox.sendKeys(input);
        WebElement showmessageButton = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        showmessageButton.click();
        WebElement message = driver.findElement(By.id("display"));

        if (message.getText().equals(input)){
            System.out.println("Verification is done : Pass");
            System.out.println(message.getText());

        }else {
            System.out.println("Verification is done : FAIL");
            System.out.println(message.getText());
        }




    }
}
