package Pages;

import PageObject.Object_Online_App;
import Utilities.ReadConfg;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Set;

public class AllMethode extends Page_Online_App {


    public static WebDriver driver;
    ReadConfg readConfg = new ReadConfg();
    String url1 = readConfg.getBaseURL();

    public void Openbrowserr() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\617018917\\Downloads\\Maven Projects\\Cucumber-project-with-Maven\\src\\test\\Drivers\\msedgedriver.exe");

        this.driver = new EdgeDriver();
        driver.get(url1);
        driver.manage().window().maximize();Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Page Opened");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);  Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='75%'");
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
    public void ScrollintoView(By infinteScoll) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;Thread.sleep(2000);
        WebElement element = driver.findElement(infinteScoll);   Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView()", element);
        Thread.sleep(2000); element.click();
    }
    public void ScrollIntoViewElement(By element) throws InterruptedException {

        WebElement ele =driver.findElement(element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        Thread.sleep(2000);
    }
    public void ScrollIntoViewElementandClick(By element) throws InterruptedException {
        WebElement ele = driver.findElement(element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        ele.click();
        Thread.sleep(2000);
    }
}