package Utilities;

import PageObject.Object_Online_App;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Uti_Online_App extends PageObject.Object_Online_App {
    WebDriver driver;

    public void  Openbrowser() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\617018917\\Downloads\\edgedriver_win64 (6)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");  Thread.sleep(5000);
        driver.manage().window().maximize();Thread.sleep(2000);
        System.out.println("Page Opened");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);  Thread.sleep(2000);
    }
    public void ClickonAddorRemoveElements() throws InterruptedException {
    driver.findElement(AddRemoveElements).click();Thread.sleep(2000);System.out.println("Clicked on Add/Remove element");
    driver.findElement(AddElement).click();Thread.sleep(2000);
    driver.navigate().back();Thread.sleep(2000);
    driver.findElement(BasicAuth).click();Thread.sleep(2000);

    }
    public void closeTheApplication() {
        driver.quit();
    }

}
