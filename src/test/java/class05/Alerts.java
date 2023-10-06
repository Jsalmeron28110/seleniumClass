package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");

        driver.manage().window().maximize();

        // Task1
        // Click on the first alert button and handle the alert
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);

        // switch the focus of the driver to the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        // Task 2
        // click on the third alert button and send some text and press ok

        WebElement alert3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();

        Thread.sleep(2000);
        alert.sendKeys("I am Human");
        alert.accept();

        // Task 3
       // click on alert box 2 and dismiss the alert
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();

        Thread.sleep(2000);
        alert.dismiss();



    }
}
