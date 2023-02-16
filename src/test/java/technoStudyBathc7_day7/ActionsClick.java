package technoStudyBathc7_day7;

import Utilities.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick extends UtilityClass {
    public static void main(String[] args) {
/**
 * The Actions class in Selenium WebDriver is a feature that allows you to perform advanced user interactions such as mouse and keyboard actions. It provides methods that simulate user interactions, such as clicking, double-clicking, right-clicking, dragging and dropping, typing on the keyboard, etc.
 *
 * The Actions class is particularly useful when working with web applications that require more complex user interactions such as drag-and-drop or right-click menus. It provides a way to perform these interactions in a more automated way, allowing you to test your application more thoroughly and reliably.
 *
 * Here's an example of how to use the Actions class to perform a drag-and-drop operation in Selenium WebDriver:
 *
 * java
 * Copy code
 * // Create an instance of the Actions class
 * Actions actions = new Actions(driver);
 *
 * // Find the source and target elements
 * WebElement source = driver.findElement(By.id("source"));
 * WebElement target = driver.findElement(By.id("target"));
 *
 * // Perform the drag-and-drop operation
 * actions.dragAndDrop(source, target).build().perform();
 * In this example, we first create an instance of the Actions class, passing the WebDriver instance as a parameter. Then, we locate the source and target elements that we want to interact with using the findElement() method. Finally, we perform the drag-and-drop operation using the dragAndDrop() method, passing the source and target elements as parameters. We then call the build() method to build the sequence of actions and call the perform() method to execute the sequence.
 *
 * Note that you need to call the build() method to build the sequence of actions and generate an Action object. You then call the perform() method on this object to execute the sequence.
 *
 * *
 * */
        driver.get("https://demoqa.com/buttons");

//        Double Click Button
//        <button id="doubleClickBtn" type="button" class="btn btn-primary">Double Click Me</button>

        WebElement doubleclickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        Action action = actions.doubleClick(doubleclickButton).build();

        action.perform();


//<button id="rightClickBtn" type="button" class="btn btn-primary">Right Click Me</button>
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Action rightClickAction = actions.contextClick(rightClickButton).build();
        rightClickAction.perform();
//<button id="CLmhy" type="button" class="btn btn-primary">Click Me</button>

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Action clickAction = actions.click(clickButton).build();
        clickAction.perform();


//      Second way of using these actions
//        Double Click

        Action doubleClickAction = actions.moveToElement(doubleclickButton).doubleClick().build();
        doubleClickAction.perform();








    }
}
