package technoStudyB7_day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

//        <select class="form-control" id="select-demo">
       WebElement days=  driver.findElement(By.id("select-demo"));
//        Create Select CLass Object

        Select select = new Select(days);
        select.selectByVisibleText("Sunday");

        Thread.sleep(1000);

        select.selectByIndex(3);

        String selectedOption = select.getFirstSelectedOption().getText();

        System.out.println(selectedOption);

        String expected = "Tuesday";

        if(selectedOption.equals(expected)){
            System.out.println("Verification is Done : PASS");
        }




    }
}
