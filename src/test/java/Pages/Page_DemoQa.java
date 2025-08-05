package Pages;

import PageObject.Object_DemoQa;
import Utilities.ReadConfg;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;


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
//        Actions actions = new Actions(driver);
//        actions.keyDown(Keys.CONTROL)
//                .sendKeys(Keys.SUBTRACT)
//                .keyUp(Keys.CONTROL)
//                .perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='75%'");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Page Opened");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);  Thread.sleep(4000);
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
    public void WebTable(String firstname, String lastNamee, String email, String age, String salery, String department) throws InterruptedException, IOException {

        ScrollIntoViewElementandClick(Elements); Thread.sleep(1000);
        ScrollIntoViewElementandClick(WebTable);
     //   ScrollIntoViewElementandClick(Add);

//            SwitchToChildWindow();
//            Thread.sleep(2000);
//            driver.findElement(SendName).sendKeys("Mahesh");
//            driver.findElement(LastName).sendKeys("Mahesh");
//            driver.findElement(Email).sendKeys("Mahesh@gmail.com");
//            driver.findElement(Age).sendKeys("16");
//            driver.findElement(Salery).sendKeys("14");
//            driver.findElement(Department).sendKeys("Mahesh");
//            driver.findElement(Submit).click();
//
//        ScrollIntoViewElementandClick(Add);
       // SwitchToChildWindow();
        Thread.sleep(2000);


//        driver.findElement(SendName).sendKeys(firstname);
//        driver.findElement(LastName).sendKeys(lastNamee);
//        driver.findElement(Email).sendKeys(email);
//        driver.findElement(Age).sendKeys(age);
//        driver.findElement(Salery).sendKeys(salery);
//        driver.findElement(Department).sendKeys(department);
//        driver.findElement(Submit).click();

        ScrollIntoViewElementandClick(FirstName);
        String Cell01 = driver.findElement(By.xpath("(//div[@class = 'rt-resizable-header-content'])[1]")).getText();
        List<WebElement> listofElement =  driver.findElements(By.xpath("(//div[@class = 'rt-resizable-header-content'])"));
        int listofElements = listofElement.size();
        System.out.println(listofElements);
        int i=0;
        int p;
        int o;


        for(o=i; o<listofElements; ){
          String XpathCount = ("(//div[@class = 'rt-resizable-header-content'])["+o+"]");
              String HeaderName = driver.findElement(By.xpath(XpathCount)).getText();

              for (p = i; p<listofElements; ){
                  String Values = ("(//div[@class='rt-td'])["+p+"]");
                  String KeyValues = driver.findElement(By.xpath(Values)).getText();
                  System.out.println(HeaderName+ " is  "+ KeyValues );
                  if (i==(listofElements-1)){
                      listofElements=1;

                  }

                  if(i==6){
                      i=0;
                  } i++;
                  break;
              }





        }































//        FileInputStream fs = new FileInputStream("C:\\Users\\617018917\\Downloads\\Maven Projects\\TestDataSheet.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(fs);
//        XSSFSheet sheet = workbook.getSheetAt(0);

//        Row row = sheet.getRow(0);
//        Cell cell = row.getCell(0);
//        String FirstName = cell.getStringCellValue();

//        Row row1 = sheet.getRow(1);
//        Cell cell1 = row1.getCell(1);
//        String LastName = cell1.getStringCellValue();
//        FileInputStream file = new FileInputStream("C:\\Users\\617018917\\Downloads\\Maven Projects\\TestDataSheet.xlsx");

//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet= workbook.getSheet("Sheet1");

//        int noOfRows = sheet.getLastRowNum(); // returns the row count
//        System.out.println("No. of Records in the Excel Sheet:" + noOfRows);

//        int cols=sheet.getRow(1).getLastCellNum();
//        System.out.println("No. of Records in the Excel Sheet:" + cols);

//        driver.findElement(SendName).sendKeys();
//        driver.findElement(SendName).sendKeys();
//        driver.findElement(SendName).sendKeys();
//        driver.findElement(SendName).sendKeys();
//        driver.findElement(SendName).sendKeys();

    }
}
