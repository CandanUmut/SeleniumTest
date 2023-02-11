package technoStudyB7_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String input ="bamboo pen";
        driver.get("https://www.google.com");
        WebElement searchbox =driver.findElement(By.name("q"));
        searchbox.sendKeys(input + Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "bamboo pen - Google Search";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification is Done : PASS");
            System.out.println(actualTitle);
        }else {
            System.out.println("Verification is Done : FAIL");
            System.out.println(actualTitle);
        }




//<title>bamboo pen - Google Search</title>

//        WebElement searchbutton =driver.findElement(By.cssSelector("btnK"));
//        searchbutton.click();




//        <input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048"
//        name="q" type="text" aria-autocomplete="both" aria-haspopup="false"
//        autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox"
//        spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwju0NKon4f9AhWwlIkEHd6RCmUQ39UDCAc">
//<input class="gNO89b" value="Google Search" aria-label="Google Search"
// name="btnK" role="button" tabindex="0" type="submit" data-ved="0ahUKEwj1nrCioIf9AhXrFVkFHZQtAeAQ4dUDCBA">

//        WebElement searchButton =  driver.findElements(By.name("btnK"));






    }
}


