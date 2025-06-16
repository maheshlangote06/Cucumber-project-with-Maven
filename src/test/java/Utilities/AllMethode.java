package Utilities;

import PageObject.Object_Online_App;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllMethode extends Object_Online_App {
    WebDriver driver;

//    private void scrollToElement(WebElement webElement) throws Exception {
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded()", webElement);
//        Thread.sleep(5000);
//    }

    public void putwait() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Asus\\Downloads\\Framework\\msedgedriver.exe");
        // Logger log = LogManager.getLogger(LogExample.class.getName());
        driver = new EdgeDriver();
        Thread.sleep(2000);
    }
//    public void infiniteScroll() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        // Return the total height of the webpage
//        long initialHeight = (long) js.executeScript("return   document.body.scrollHeight");
//        // Start a while loop
//        while(true){
//            // Do infinite scrolling
//            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//            // Add implicit wait of 10 seconds
//            Thread.sleep(3000);
//            // Get current height of the page
//            long currentHeight = (long) js.executeScript("return document.body.scrollHeight");
//            // Steop when initial height equals to current height
//            if(initialHeight == currentHeight) {
//                break;
//            }
//            initialHeight = currentHeight;
//        }
//        Thread.sleep(3000);
//    }
//    public void ScrollintoView(By webElement){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement((By) webElement);
//        js.executeScript("arguments[0].scrollIntoView()", element);
//    }

}