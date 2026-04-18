package Pages;

import PageObject.TestNg_Object;
import Utilities.ReadConfg;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;


public class TestNg_Page extends TestNg_Object {

    AllMethode getmethod = new AllMethode();
    protected static WebDriver driver;
    ReadConfg readConfg = new ReadConfg();
    String url1 = readConfg.getBaseURL();

    public void logintowebsite(){
    System.out.println("Application started");
    System.setProperty("webdriver.edge.driver", "src/test/java/driver/msedgedriver.exe");
    driver = new EdgeDriver();
    driver.get(url1);
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("document.body.style.zoom='75%'");
    }
    public void DropDown() throws InterruptedException {
    WebElement xyz = driver.findElement(By.xpath("//select[@id='country']"));
    Select select = new Select(xyz);
    select.selectByVisibleText("Canada");    waitt();
    select.selectByIndex(4);    waitt();
    }
    public void FluentWait(By Elements){

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Maximum time to wait
                .pollingEvery(Duration.ofMillis(3)) // Interval between each poll
                .ignoring(NoSuchElementException.class); // Exceptions to ignore
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements));
    }
    public void DynamicButton() throws InterruptedException {
        String ButtonText = driver.findElement(DynamicButton).getText();waitt();
        System.out.println(ButtonText);
        if (ButtonText.equals("START")) {
            driver.findElement(DynamicButton).click();
            System.out.println("Start Selected");waitt();

        } String ButtonText1 = driver.findElement(DynamicButton1).getText();waitt();
        if (ButtonText1.equals("STOP")) {
            driver.findElement(DynamicButton1).click();
            System.out.println("Stop Selected");waitt();
      }
    }
    public void ScrollintoView(By infinteScoll) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;Thread.sleep(2000);
        WebElement element = driver.findElement(infinteScoll);   Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView()", element);

    }
    public void MouseHover(By Element,By Element2) throws InterruptedException {
        WebElement elementToHover = driver.findElement(Element);Thread.sleep(2000);
        WebElement elementToHover1 = driver.findElement(Element2);Thread.sleep(2000);
        Actions actions = new Actions(driver);Thread.sleep(2000);
        actions.moveToElement(elementToHover).perform();Thread.sleep(2000);
        actions.moveToElement(elementToHover1).click().perform();Thread.sleep(2000);
    }
    public void Alert() throws InterruptedException {
        ScrollintoView(Alert);waitt();

        driver.findElement(Alert).click();waitt();
        String alertText = driver.switchTo().alert().getText();
        System.out.println("This is alert Text - " + alertText);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();waitt();
        System.out.println("Alert Accepted");

        driver.findElement(ConfirmAlert).click();waitt();
        String alertText2 = driver.switchTo().alert().getText();
        System.out.println("This is alert Text - " + alertText2);
        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
        alert2.accept();waitt();
        System.out.println("Alert Confirmed");

        driver.findElement(ConfirmAlert).click();waitt();
        Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
        alert3.dismiss();waitt();
        System.out.println("Alert Cancelled");


        driver.findElement(PromtAlert).click();waitt();
        Alert alert21 = wait.until(ExpectedConditions.alertIsPresent());
        alert21.sendKeys("Mahesh Langote");waitt();
        alert21.accept();waitt();
        System.out.println("Clicked on OK");


    }
    public void TabSwitch() throws InterruptedException {
        driver.findElement(PopupWindowHandle).click();waitt();waitt();
        getmethod.SwitchToChildWindow();waitt();waitt();
        driver.findElement(Register).click();waitt();waitt();
    }
    public void Mosehover() throws InterruptedException {
        ScrollintoView(MouseHover);
    MouseHover(MouseHover,Mobile);waitt();


    }
    public void DoubleCLick() throws InterruptedException {
        ScrollintoView(DoubleClick);waitt();
        WebElement doubleclickkk = driver.findElement(DoubleClick);
        Actions actions = new Actions(driver);waitt();
        actions.doubleClick(doubleclickkk);waitt();

}public void DragDrop() throws InterruptedException {
        ScrollintoView(Dragdrop);waitt();
        WebElement Drag = driver.findElement(Dragdrop);
        Actions actions = new Actions(driver);waitt();
        actions.dragAndDropBy(Drag, 150, 0).perform();
    }
    public void BrockenLink(){
        // Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }
    }
    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }































    public void waitt() throws InterruptedException {
    Thread.sleep(2000);
    }

    public void quit(){
        driver.quit();
    }
    }
