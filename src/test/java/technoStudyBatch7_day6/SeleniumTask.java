package technoStudyBatch7_day6;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**1- Go to https://www.saucedemo.com/
2- login with valid credentials
3- Click on Sauce Labs Backpack and add to the cart
4- Click on Back To Products
5- Click on Sauce Labs Bolt T-Shirt and add to the cart
6- Click on the cart
7- Click on the Check Out button
8- Fill the form and click on Continue
9- Check if you see your products
*/
public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");


//        Username Input
//        <input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">

        WebElement username =  driver.findElement(By.xpath("//input[@class='input_error form_input']"));
        username.sendKeys("standard_user");


//      Password Input
//      <input class="input_error form_input" placeholder="Password" type="password" data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value="">

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

//        Login Button
//        <input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();

//        Backpack
//        <div class="inventory_item_name">Sauce Labs Backpack</div>

        WebElement backpack = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']"));
        backpack.click();

//        Add to cart button
//        <button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-backpack" id="add-to-cart-sauce-labs-backpack" name="add-to-cart-sauce-labs-backpack">Add to cart</button>

        WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addtocart.click();
//      Backto products button
//        <button class="btn btn_secondary back btn_large inventory_details_back_button" data-test="back-to-products" id="back-to-products" name="back-to-products"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABYAAAAWCAYAAADEtGw7AAAAAXNSR0IArs4c6QAAAJpJREFUOBHV1b8KgCAQB2CN3qvWoKAl6HF6n9aGxh5MMRwuFPxz3t2SywmH3+8GRaX+sOZ1H6dle/ysvcTAHrTWHsbYATwWnAJZcAkkwRiwCW4BUTAFLMIcMAlLgBEsCQLcwUa66hCEyZ1T3wsK+9j9fZ06guEgNyALcwOqMDUADbcGNMPYADJcC2DDuQAPQ0+k+msKX5MImEJePMWUxD8KaN0AAAAASUVORK5CYII=" class="back-image" alt="Go back">Back to products</button>

        WebElement backtoProducts = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        backtoProducts.click();

// T Shirt

//      <div class="inventory_item_name">Sauce Labs Bolt T-Shirt</div>
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));

        WebElement tshirt = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();


//      Bactoproduck
//      <button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-bolt-t-shirt" id="add-to-cart-sauce-labs-bolt-t-shirt" name="add-to-cart-sauce-labs-bolt-t-shirt">Add to cart</button>

        WebElement addtheProduct = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addtheProduct.click();

//
//

        driver.navigate().back();

//        Shoppingcart
//        <a class="shopping_cart_link"><span class="shopping_cart_badge">2</span></a>

        WebElement shoppingcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shoppingcart.click();

//        Checkout button
//        <button class="btn btn_action btn_medium checkout_button" data-test="checkout" id="checkout" name="checkout">Checkout</button>

        WebElement Checkout = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        Checkout.click();

//        FirstName
//        <input class="input_error form_input" placeholder="First Name" type="text" data-test="firstName" id="first-name" name="firstName" autocorrect="off" autocapitalize="none" value="">
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Umut");

//        LastName
//      <input class="input_error form_input" placeholder="Last Name" type="text" data-test="lastName" id="last-name" name="lastName" autocorrect="off" autocapitalize="none" value="">

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("candan");

//      Zipcode
//      <input class="input_error form_input" placeholder="Zip/Postal Code" type="text" data-test="postalCode" id="postal-code" name="postalCode" autocorrect="off" autocapitalize="none" value="">
        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("113333");

//        clickcontinue
//        <input type="submit" class="submit-button btn btn_primary cart_button btn_action" data-test="continue" id="continue" name="continue" value="Continue">

        WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
        continuebutton.click();


        try {
            WebElement item1 = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']"));
            System.out.println("Backpack is present on the website.");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Backpack is not present on the website.");
        }

        // Check for the second item
        try {
            WebElement item2 = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']"));
            System.out.println("T-shirt  is present on the website.");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("T-shirt is not present on the website.");
        }










    }

}
