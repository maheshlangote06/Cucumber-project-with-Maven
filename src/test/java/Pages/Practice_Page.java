package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice_Page {
WebDriver driver;
public void fill_data() throws InterruptedException {
    System.out.println("Application started");
    System.setProperty("webdriver.edge.driver", "src/test/java/Utilities/msedgedriver.exe");
    // Logger log = LogManager.getLogger(LogExample.class.getName());
    driver = new EdgeDriver();
    driver.get("https://testautomationpractice.blogspot.com");
    driver.manage().window().maximize();Thread.sleep(1000);
    System.out.println("Page Opened");
    String pageTitle = driver.getTitle();
    System.out.println("Page Title: " + pageTitle);  Thread.sleep(2000);
}
}
