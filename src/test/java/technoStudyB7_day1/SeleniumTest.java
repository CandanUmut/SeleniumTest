package technoStudyB7_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- Set up the chrome driver
        WebDriverManager.chromedriver().setup();
        //2- create object of ChromeDriver to open the browser
        WebDriver driver= new ChromeDriver();
        // 3- go to google page
        driver.get("https://www.google.com");
        System.out.println("title of the url" +driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");

     

        String expectedTitle = "Join the best coding bootcamps online and get IT training in the US";

        String actualTitle = driver.getTitle();


        if(expectedTitle.equals(actualTitle)){
            System.out.println("Verification is done : Pass");
            System.out.println("actual title is :" + actualTitle);
        }else {
            System.out.println("Verification is Failed");
            System.out.println("actual title" + actualTitle);
        }









    }
}
