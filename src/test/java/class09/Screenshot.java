package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

//        declare the isntance
        TakesScreenshot ts=(TakesScreenshot) driver;

//        take screen shot
        File ss = ts.getScreenshotAs(OutputType.FILE);

//        then save on computer
        FileUtils.copyFile(ss,new File("C:\\Users\\Juan Salmeron\\IdeaProjects\\seleniumClass\\screenshot\\abc.png"));


    }
}
