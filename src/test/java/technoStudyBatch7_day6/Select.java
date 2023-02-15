package technoStudyBatch7_day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Navigate to "http://tutorialsninja.com/demo/"
 * Click on Laptops & Notebooks
 * Click on Show All Laptops & Notebooks
 * Sort the products according to their price(Lowest first)
 * Click on the second one.
 * Click on the add to cart
 * check if you see the success message
 * */
public class Select {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://tutorialsninja.com/demo/");

        WebElement laptopsAndDesktops = driver.findElement(By.linkText("Laptops & Notebooks"));
        laptopsAndDesktops.click();

        WebElement showAllComputers = driver.findElement(By.linkText("Show All Laptops & Notebooks"));
        showAllComputers.click();

        WebElement sortButton = driver.findElement(By.id("input-sort"));

//        Select sortButtonSelect = new Select(sortButton);
//        Select select = new Select(sortButton);
//


        WebElement secondProduct = driver.findElement(By.linkText("MacBook"));
        secondProduct.click();

        WebElement addToCartButton = driver.findElement(By.id("button-cart"));
        addToCartButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div[id='product-product']>div"));
        System.out.println(successMessage.getText());
        //System.out.println(successMessage.getText().contains("Success"));
    }
}
