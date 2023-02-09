package technoStudyB7_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.seleniumeasy.com");
        System.out.println("title of seleniumeasy page" +driver.getTitle());

        String expectedTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Verification of title : PASS");
            System.out.println("The title is " + actualTitle);

        }else {
            System.out.println("Verification of TITLE : Fail");
        }
        Thread.sleep(3000);
        String teslaurl ="https://www.tesla.com/";
        driver.navigate().to(teslaurl);
        driver.manage().window().maximize();

        driver.close();
        driver.quit();
    }
}
