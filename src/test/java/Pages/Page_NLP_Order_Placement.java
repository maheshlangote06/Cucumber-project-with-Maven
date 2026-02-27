package Pages;

import PageObject.Object_NLP_Order_Placement;
import Utilities.ReadConfg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class Page_NLP_Order_Placement extends Object_NLP_Order_Placement {
    public static WebDriver driver;
    ReadConfg readConfg = new ReadConfg();
    Page_Online_App page_Online_App = new Page_Online_App();
    String url1 = readConfg.getBaseURL();
    AllMethode allMethode = new AllMethode();
    public void ScrollIntoViewElementandClick(By element) throws InterruptedException {
        WebElement ele = driver.findElement(element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        ele.click();
        Thread.sleep(4000);
    }
    public void ScrollIntoViewElement(By element) throws InterruptedException {

        WebElement ele =driver.findElement(element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        Thread.sleep(2000);
    }
    public void SwitchToPopUpHandle(){
        String parentWindowHandle = driver.getWindowHandle();
// The steps on How to handle popup in selenium
// Get the window handles for all open windows
        Set<String> windowHandles = driver.getWindowHandles();
// Switch to the pop-up window
        for (String handle: windowHandles) {
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
    public void WindowSwitch() throws InterruptedException {
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();


        // Switch to the new window/tab
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("document.body.style.zoom='75%'");Thread.sleep(2000);
                break;
            }
        }
    }
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

    public void SABORPage() throws InterruptedException {
             driver.findElement(ClickOn_Sabor).click();Thread.sleep(10000);
             WindowSwitch();
             ScrollIntoViewElementandClick(ClickOn_GEA);
            ScrollIntoViewElementandClick(ClickOn_PlaceAnOrder);
             driver.findElement(ClickOn_SendNADKey).sendKeys("A00993122597");
            ScrollIntoViewElementandClick(ClickOn_Search);
            ScrollIntoViewElementandClick(ClickOn_Next);
              driver.findElement(ClickOn_DropDown).click();Thread.sleep(7000);
             ScrollIntoViewElementandClick(ClickOn_GoldAddressKey);
             driver.findElement(Send_GoldAddressKey).sendKeys("A00993122597");Thread.sleep(1000);
             driver.findElement(Send_DistricCode).sendKeys("ES");Thread.sleep(1000);
             driver.findElement(Send_ExchangeCode).sendKeys("EDM");Thread.sleep(1000);
        ScrollIntoViewElementandClick(ClickOn_CheckBox);Thread.sleep(1000);
        ScrollIntoViewElementandClick(ClickOn_Next);Thread.sleep(1000);
        ScrollIntoViewElement(Check_VDSLavailablebility);Thread.sleep(1000);
        String VdslAvailability = driver.findElement(Check_VDSLavailablebility).getText();Thread.sleep(1000);
        String GfastAvailability =  driver.findElement(Check_Gfastavailablebility).getText();Thread.sleep(1000);
        String VdslFlag = driver.findElement(Check_VDSLflag).getText();Thread.sleep(1000);
        String GfastFlag = driver.findElement(Check_Gfastflag).getText();Thread.sleep(1000);
        System.out.println(VdslAvailability + " : "+VdslFlag + " -- "+GfastAvailability +" : "+GfastFlag);Thread.sleep(1000);
        ScrollIntoViewElementandClick(ClickOn_Next);Thread.sleep(7000);Thread.sleep(1000);
    }

    public void Orderdetails() throws InterruptedException {
        ScrollIntoViewElementandClick(CLickon_DropDown);Thread.sleep(2000);
        ScrollIntoViewElementandClick(Select_BillingAccount);
        ScrollIntoViewElementandClick(Send_CustomerReference);
        driver.findElement(Send_CustomerReference).sendKeys("Test");
        driver.findElement(Send_Date).sendKeys("13/08/2025");
        ScrollIntoViewElementandClick(KCItypeDropdown);
        ScrollIntoViewElementandClick(KCItype);
        ScrollIntoViewElementandClick(Retailer);
        SwitchToPopUpHandle();
        ScrollIntoViewElementandClick(Select);
        driver.findElement(RetailerId).click();
        driver.findElement(Search).sendKeys("DMA");
        driver.findElement(Selectt).click();



    }
}
