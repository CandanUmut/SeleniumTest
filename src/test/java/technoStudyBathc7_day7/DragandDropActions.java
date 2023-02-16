package technoStudyBathc7_day7;

import Utilities.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropActions extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement Washington = driver.findElement(By.id("box3"));

        System.out.println(Washington.getCssValue("background-color"));

        WebElement unitedStates = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);

        Action dragandDropWashington = actions.dragAndDrop(Washington,unitedStates).build();

        dragandDropWashington.perform();

        System.out.println(Washington.getCssValue("background-color"));


        WebElement copenhagen = driver.findElement(By.id("box4"));

        WebElement denmark = driver.findElement(By.id("box104"));

        Action draganddropCopenhagen = actions.dragAndDrop(copenhagen,denmark).build();
        draganddropCopenhagen.perform();


    }
}
