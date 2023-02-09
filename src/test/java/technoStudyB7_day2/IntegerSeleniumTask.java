package technoStudyB7_day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntegerSeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int input =10123;
        int input1=203;
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

//        <input type="text" class="form-control" placeholder="Enter value" id="sum1">
        WebElement enterinteger =driver.findElement(By.id("sum1"));
        enterinteger.sendKeys(Integer.toString(input));

        WebElement enterinteger1 =driver.findElement(By.id("sum2"));
        enterinteger1.sendKeys(Integer.toString(input1));
        WebElement showmessageButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        showmessageButton.click();
        WebElement value = driver.findElement(By.id("displayvalue"));
        System.out.println(value.getText());


        if (value.getText().equals(Integer.toString(input+input1))){
            System.out.println("Verification is done : Pass");
            System.out.println(value.getText());

        }else {
            System.out.println("Verification is done : FAIL");
            System.out.println(value.getText());
        }





//        <input type="text" class="form-control" placeholder="Enter value" id="sum2">


//        <button type="button" onclick="return total()" class="btn btn-default">Get Total</button>


//        <span id="displayvalue">2</span>




    }

}
