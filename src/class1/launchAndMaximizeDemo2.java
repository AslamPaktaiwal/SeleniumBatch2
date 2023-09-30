package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchAndMaximizeDemo2 {
    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.tolafghan.com/");
        driver.manage().window().maximize();


    }
}
