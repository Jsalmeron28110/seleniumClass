package class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        // to go to google.com
        driver.get("https://www.google.com");

        // maximize the window
        driver.manage().window().maximize();

        // slow down to observe the process
        Thread.sleep(2000);

        // go to facebook.com
        driver.navigate().to("https://www.facebook.com");

        // slow down to observe
        Thread.sleep(2000);

        // go back
        driver.navigate().back();

        // slow down to observe
        Thread.sleep(2000);

        // go forward
        driver.navigate().forward();

        // refresh page
        driver.navigate().refresh();

        // close
        driver.close();// close current tab
        // can also use
        // driver.quit(); closes entire browser


    }
}
