package technoStudyB7_day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitterProject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

//        <div data-offset-key="5p32a-0-0" class="public-DraftStyleDefault-block public-DraftStyleDefault-ltr">
//        <span data-offset-key="5p32a-0-0"><br data-text="true"></span></div>

        driver.get("https://twitter.com");

//    <div dir="ltr" class="css-901oao r-1awozwy r-1cvl2hr r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0"><span class="css-901oao css-16my406 css-1hf3ou5 r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0"><span class="css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0">Sign in</span></span></div>

        WebElement login = driver.findElement(By.xpath("//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0' and text()='Log in']"));
        login.click();

//        <input autocapitalize="sentences" autocomplete="username" autocorrect="on" name="text" spellcheck="true" type="text" dir="auto" class="r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-1dz5y72 r-fdjqy7 r-13qz1uu" value="">
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlToBe("https://twitter.com/i/flow/login"));
        WebElement username = driver.findElement(By.cssSelector("input[autocomplete='username']"));

        username.sendKeys("");


//        <div dir="ltr" class="css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0"><span class="css-901oao css-16my406 css-1hf3ou5 r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0"><span class="css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0">Next</span></span></div>


    }
}
