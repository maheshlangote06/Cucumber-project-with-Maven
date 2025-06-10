package Utilities;

import PageObject.Object_Online_App;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Uti_Online_App extends PageObject.Object_Online_App {
    WebDriver driver;

    public void  Openbrowser() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Asus\\Downloads\\Framework\\msedgedriver.exe");
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
   // driver.findElement(BasicAuth).click();Thread.sleep(2000);

    }
    public void Challenging_DOM() throws InterruptedException, IOException {
        driver.findElement(Challenging_DOM).click();Thread.sleep(2000);System.out.println("Clicked on - Challenging_DOM");
        File file = new File("C:\\Users\\Asus\\Downloads\\Framework\\Xl file\\Book1.xlsx");
        FileInputStream inputStream = new FileInputStream(file);

        XSSFSheet sheet = sheet.getSheetAt(0);
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();System.out.println(rowCount);

    }
    public void closeTheApplication() {
        driver.quit();
    }

}
