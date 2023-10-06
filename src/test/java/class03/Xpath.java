package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();

//      find text box and send keys
        WebElement textBox1 = driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch17");

//      find the next text box and send keys
        WebElement textBox2 = driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");

//      send the security question
        WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("Whats the color of the sun?");

//      get the text
        WebElement textDisplay=driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(textDisplay.getText());

//      get the text box
        WebElement textBoxApi = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        textBoxApi.sendKeys("Abracadabra");

//      get the email
        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("Batch17@syntax.org");

        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("Batch17@google.com");

        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("Batch17@yahoo.com");

//      get the fields
        WebElement field1= driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("cat");

        WebElement field2= driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
          field2.sendKeys("dog");




    }
}
