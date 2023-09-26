package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        // maximize your window
        driver.manage().window().maximize();

        // get the url of the website
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url is: " +currentUrl);

        // get the title
        String title= driver.getTitle();
        System.out.println("The title of the page is : " +title);

        // added a wait for 2 seconds to slow the closing of the window
        Thread.sleep(2900);

        // close the browser
        driver.quit();

    }
}
