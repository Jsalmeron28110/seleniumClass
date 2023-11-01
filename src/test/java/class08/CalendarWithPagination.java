package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CalendarWithPagination extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.aa.com/homePage.do";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //        click on the calendar
        WebElement calendar = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

        boolean notfound=true;

        while(notfound) {

//          find the month and check if it is correct
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));

            String currentMonth = month.getText();

            if (currentMonth.equals("December")) {

                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

//                iterate
                for(WebElement date:dates){

                    String currentDate = date.getText();

                    if(currentDate.equals("4")){
                        date.click();
                        break;
                    }
                }
                notfound=false;
            } else {
                WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
                next.click();
            }
        }
    }
}