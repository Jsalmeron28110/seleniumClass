package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        // write down the topic
        // switch to the iframe
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("hello");

        // click on the checkbox
        // using the name or id method
        driver.switchTo().frame("checkboxIframe");
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        // switch to default
        driver.switchTo().defaultContent();

        // switch using web element
        WebElement frame = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(frame);

        // create object of select class-
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel= new Select(animals);
        sel.selectByVisibleText("Baby Cat");

    }
}
