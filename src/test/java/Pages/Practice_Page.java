package Pages;

import PageObject.Practice_Object;
import PageObject.RMethode;
import Utilities.ReadConfg;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Practice_Page extends Practice_Object {
WebDriver driver;
    ReadConfg readConfg = new ReadConfg();
    String url1 = readConfg.getBaseURL();
    RMethode rMethode = new RMethode();
public void Login() throws InterruptedException {
    System.out.println("Application started");
    System.setProperty("webdriver.edge.driver", "src/test/java/driver/msedgedriver.exe");
    // Logger log = LogManager.getLogger(LogExample.class.getName());
    driver = new EdgeDriver();
    driver.get(url1);
    driver.manage().window().maximize();Thread.sleep(1000);
    FluentWait(Page);
    System.out.println("Page Opened");
    String pageTitle = driver.getTitle();
    System.out.println("Page Title: " + pageTitle);  Thread.sleep(2000);
}

public void fill_data() throws InterruptedException {
    //driver.findElement(name).sendKeys("Mahesh balchand langote");
   // driver.findElement(FluentWait(email)).sendKeys("Maheshlangote06@gmail.com");
   // driver.findElement(scrollintoView(phone)).sendKeys("9822891542");
   // driver.findElement(scrollintoView(address)).sendKeys("9822891542");
   // driver.findElement(scrollintoView(male)).click();
   // driver.findElement(scrollintoView(female)).click();
   // driver.findElement(scrollintoView(sunday)).click();
   // driver.findElement(scrollintoView(monday)).click();
    WebElement dropdown = driver.findElement(scrollintoView(country));
    Select select = new Select(dropdown);
    select.selectByIndex(2);
    WebElement dropdown2 = driver.findElement(scrollintoView(colors));
    Select select2 = new Select(dropdown2);
    select2.selectByIndex(2);

}



    public By FluentWait(By Elements) {

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(300))  // Maximum time to wait
                .pollingEvery(Duration.ofSeconds(3)) // Interval between each poll
                .ignoring(NoSuchElementException.class); // Exceptions to ignore
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements));

        return Elements;
    }
    public By scrollintoView(By infinteScoll) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(infinteScoll);
        js.executeScript("arguments[0].scrollIntoView()", element);

        return infinteScoll;
    }
}
