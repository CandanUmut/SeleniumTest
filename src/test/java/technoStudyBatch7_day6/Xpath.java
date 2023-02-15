package technoStudyBatch7_day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        //tagname[attribute='value']

        //tagName[@attribute='value']  --> relative xPath

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.worldometers.info/world-population/");
//<div id="maincounter-wrap"> <h1> Current World Population</h1> <div class="maincounter-number"> <span class="rts-counter" rel="current_population"><span class="rts-nr-sign"></span><span class="rts-nr-int rts-nr-10e9">8</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e6">016</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e3">804</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e0">934</span></span></div> </div>
        WebElement worldPopulationtitle = driver.findElement(By.xpath("//div[@id='maincounter-wrap']//h1"));
        System.out.println(worldPopulationtitle.getText());
//<span class="rts-counter" rel="current_population"><span class="rts-nr-sign"></span><span class="rts-nr-int rts-nr-10e9">8</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e6">016</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e3">805</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e0">220</span></span>
        WebElement worldPopulation = driver.findElement(By.xpath("//span[@class='rts-counter']"));
        System.out.println(worldPopulation.getText());



    }
}
