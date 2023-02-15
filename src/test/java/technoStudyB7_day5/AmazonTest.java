package technoStudyB7_day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AmazonTest {



        public static void main(String[] args) throws InterruptedException {
            // Set up the driver
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            // Navigate to the Amazon homepage
            driver.get("https://www.amazon.com/");

            // Enter the search query and submit the search
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("Nintendo Switch");
            searchBox.submit();

            // Wait for the search results to load

            Thread.sleep(5000);

            // Find all the products on the page and check their images
            List<WebElement> products = driver.findElements(By.cssSelector("div[data-asin]"));
            for (WebElement product : products) {
                WebElement image = product.findElement(By.cssSelector("img"));
                if (image.isDisplayed()) {
                    System.out.println("Image test passed for product: " + product.getAttribute("data-asin"));
                } else {
                    System.out.println("Image test failed for product: " + product.getAttribute("data-asin"));
                }
            }

            // Close the browser
            driver.quit();
        }

    }


