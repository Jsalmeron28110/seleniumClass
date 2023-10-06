package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();

        driver.get("http://35.175.58.98/cssSelector.php");

        // maximize window
        driver.manage().window().maximize();

        // fill in the profile id
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("moazzamSadiq");

        // fill in the profile name
        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("Hello");

        // fill in the feedback  by jenny box
        WebElement feedbackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("Website is not working");

        // Feedback from Raj
        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("Website is working");

        // contains method to fill course topic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("Selenium");

        //   using starts with
        WebElement introtoAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introtoAdv.sendKeys("welcome");

        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");



    }

}
