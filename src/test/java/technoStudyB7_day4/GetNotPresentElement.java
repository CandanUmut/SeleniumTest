package technoStudyB7_day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// 1- Visit the page
//        2- Get the text of hidden text
//
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement button = driver.findElement(By.cssSelector("#start>button"));

        button.click();
        String am;

        WebElement HelloWorld = driver.findElement(By.cssSelector("#finish>h4"));
        am=HelloWorld.getText();
        System.out.println(am);

int a =0;
        String text ="";
        while(text.equals("")){


            try{
                WebElement HelloWorld1 = driver.findElement(By.cssSelector("#finish>h4"));
                text=HelloWorld1.getText();
                System.out.println(text);

            }
            catch (NoSuchElementException exception){

                a++;


            }
            System.out.println(a);

        }
//<div id="finish" style=""><h4>Hello World!</h4></div>



    }
}
