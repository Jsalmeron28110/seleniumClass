package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1728436963%3A1696468161768821&theme=glif");
        driver.manage().window().maximize();

        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        // click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        // Task1
        // get the window handle of the first page (gmail.com) and print it on the console

        // as our web driver is currently focused on gmail page we can user driver.getwindowhandle() to get the handle of the current page (gmail.com)
        String gmailHandle = driver.getWindowHandle();

        System.out.println(gmailHandle);

        // task 2
        // Switch the focus of your web driver to the privacy window
        Set<String> windowHandles = driver.getWindowHandles();

        // loop through all the handles and find the one desired

        for (String handle:windowHandles){

            // switch to the first handle
            driver.switchTo().window(handle);

            // get the title of the window on which the focus is
            String title = driver.getTitle();

            // check if the title of the desired tile , if yes break the loop, if no repeat the process
            if (title.equals("Privacy Policy – Privacy & Terms – Google")){
                break;
            }

        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());




    }

}