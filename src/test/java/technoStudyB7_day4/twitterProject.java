package technoStudyB7_day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterProject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

//        <div data-offset-key="5p32a-0-0" class="public-DraftStyleDefault-block public-DraftStyleDefault-ltr">
//        <span data-offset-key="5p32a-0-0"><br data-text="true"></span></div>

        driver.get("https://twitter.com/home");

    }
}
