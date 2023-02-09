package technoStudyB7_day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAddressVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String username = "umutcandan";
        String password = "omosyus123456";


        driver.get("https://www.google.com");

        driver.navigate().to("https://www.facebook.com");
        //<input type="text" class="inputtext _55r1 _6luy" name="email"
        // id="email" data-testid="royal_email" placeholder="Email or phone number"
        // autofocus="1" aria-label="Email or phone number">
        WebElement emailBox =driver.findElement(By.id("email"));

        emailBox.sendKeys(username);
        //<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass"
        // data-testid="royal_pass" placeholder="Password" aria-label="Password">
        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password);
        //<button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="loginbutton"
        // name="login" tabindex="0" type="submit">Log In</button>
        WebElement loginbutton = driver.findElement(By.name("login"));
        loginbutton.click();
        Thread.sleep(10001);


        driver.quit();





    }
}
