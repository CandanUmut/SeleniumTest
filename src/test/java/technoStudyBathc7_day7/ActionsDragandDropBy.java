package technoStudyBathc7_day7;

import Utilities.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragandDropBy extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
//<span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 60%;"></span>
        WebElement rightScrollBar = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
        Actions actions= new Actions(driver);

        Action scrollAction = actions.dragAndDropBy(rightScrollBar,100,0).build();
        scrollAction.perform();


    }
}
