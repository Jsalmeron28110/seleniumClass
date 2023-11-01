package class09;

import Utils.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;

public class JsExecutor extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url="http://35.175.58.98/keypress.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // scroll down
        // declare the instance

        JavascriptExecutor Js=(JavascriptExecutor) driver;
        Js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        Js.executeScript("window.scrollBy(0,-500)");

    }
}
