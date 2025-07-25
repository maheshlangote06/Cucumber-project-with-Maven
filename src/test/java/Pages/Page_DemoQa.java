package Pages;

import PageObject.Object_DemoQa;
import Utilities.AllMethode;
import Utilities.ReadConfg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;


public class Page_DemoQa extends Object_DemoQa {
    WebDriver driver;
    AllMethode methode = new AllMethode();
    ReadConfg readConfg = new ReadConfg();
    Page_Online_App page_Online_App = new Page_Online_App();
    String url1 = readConfg.getBaseURL();
    public void  Openbrowser() throws InterruptedException {
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

    public void CheckBox() throws InterruptedException {
        Thread.sleep(1000);
        ScrollIntoViewElementandClick(Elements); Thread.sleep(1000);
ScrollIntoViewElement(CheckBOX);
        driver.findElement(CheckBOX).click();
        ScrollIntoViewElement(CheckBoxHome);
        WebElement checkbox = driver.findElement(CheckBoxHome); // Replace with your checkbox's ID or other locator
        // Check if the checkbox is selected
        boolean isChecked = checkbox.isSelected();
        System.out.println(isChecked);
        // Print the result
        if (isChecked) {
            System.out.println("The checkbox is checked.");
            System.out.println(isChecked);
        } else {
            System.out.println("The checkbox is not checked.");
        }

       driver.findElement(CheckBoxHome).click(); Thread.sleep(4000);
        WebElement checkbox1 = driver.findElement(CheckBoxHome); // Replace with your checkbox's ID or other locator
        // Check if the checkbox is selected
        boolean isCheckedd = checkbox1.isSelected();
        System.out.println(isCheckedd);
        if (isCheckedd) {
            System.out.println("The checkbox is checked.");
            System.out.println(isCheckedd);
        } else {
            System.out.println("The checkbox is not checked.");
        }

        ScrollIntoViewElementandClick(expandOptions);
List<WebElement> checkbox_Size = driver.findElements(checkboxes);
int size = checkbox_Size.size();
System.out.println(size);
        for (int i = 1; i<=size; i++) {
            String makeXpath ="//span[@class='rct-checkbox']["+i+"]";
            System.out.println(i);
            WebElement gettext = driver.findElement(By.xpath(makeXpath));
            System.out.println(gettext.getText());
        }


    }
    public  void RadioButton() throws InterruptedException {
        Thread.sleep(1000);
        ScrollIntoViewElementandClick(Elements); Thread.sleep(1000);
        ScrollIntoViewElementandClick(RadioButton);

        ScrollIntoViewElementandClick(ClickOnYes);
        WebElement YesText = driver.findElement(TextPrint);

        ScrollIntoViewElementandClick(Clickonimpressive);
        WebElement impressiveText = driver.findElement(TextPrint);

        String YesText1 = YesText.getText();
        String impressiveText1 = impressiveText.getText();
        System.out.println(YesText1);
        System.out.println(impressiveText1);

    }

    public void WebTable() throws InterruptedException {
        ScrollIntoViewElementandClick(WebTable);
        ScrollIntoViewElementandClick(WebTable);
    }
}
