package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("http://35.175.58.98/basic-checkbox-demo.php");

        driver.manage().window().maximize();

        // select the checkbox
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();

        // if selected after click
        boolean selectState = checkBox1.isSelected();
        if (selectState){
            System.out.println("the checkbox is selected");
        }else {
            System.out.println("the checkbox is not selected");
        }

        // select option 3
        // make sure your code is not hardcoded with locator
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox:checkboxes){
            // click on them all
            checkbox.click();
        }

        // deselect option 3
        for (WebElement checkboxAgain:checkboxes){
            String option = checkboxAgain.getAttribute("value");
            if (option.equalsIgnoreCase("Option-3")){
                checkboxAgain.click();
            }
        }



    }
}
