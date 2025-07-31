package Utilities;

import PageObject.Object_Online_App;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Set;

public class AllMethode extends Object_Online_App {


    WebDriver driver;
    ReadConfg readConfg = new ReadConfg();
    String url1 = readConfg.getBaseURL();
    void Openbrowserr() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\617018917\\Downloads\\Maven Projects\\Cucumber-project-with-Maven\\src\\test\\Drivers\\msedgedriver.exe");
        // Logger log = LogManager.getLogger(LogExample.class.getName());
        driver = new EdgeDriver();
        driver.get(url1);
        driver.manage().window().maximize();Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Page Opened");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);  Thread.sleep(4000);
    }

public void FluentWait(By Elements){
           FluentWait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))  // Maximum time to wait
            .pollingEvery(Duration.ofMillis(3)) // Interval between each poll
            .ignoring(NoSuchElementException.class); // Exceptions to ignore
  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements));

}
public void SwitchToChildWindow() throws InterruptedException {
    String parentWindow = driver.getWindowHandle();
    Set<String> handles =  driver.getWindowHandles();
    for(String windowHandle  : handles)
    {
        if(!windowHandle.equals(parentWindow))
        {
            driver.switchTo().window(windowHandle);
            Thread.sleep(2000);

        }
    }
}


}