package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class Uti_Online_App extends PageObject.Object_Online_App{
    WebDriver driver;

    AllMethode methode = new AllMethode();

    public void  Openbrowser() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Asus\\Downloads\\Framework\\msedgedriver.exe");
       // Logger log = LogManager.getLogger(LogExample.class.getName());
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
//        File file = new File("C:\\Users\\Asus\\Downloads\\Framework\\Xl file\\Book1.xlsx");
//
//        FileInputStream fileInputStream = new FileInputStream(file);
//        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//        Sheet sheet = workbook.getSheet("Sheet1");
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("YourText");

       // int rowCount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();System.out.println(rowCount);

        driver.navigate().back();Thread.sleep(2000);

    }
    public void closeTheApplication() {
        driver.quit();
    }
    public void DragNDrop() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(DragNdrop).click(); Thread.sleep(2000);
        WebElement From=driver.findElement(By.xpath("//div[@id='column-a']"));methode.putwait();

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//div[@id='column-b']"));methode.putwait();

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);methode.putwait();
        act.dragAndDrop(From, To).build().perform();methode.putwait();Thread.sleep(5000);
        System.out.println("Dragged and dropped.");
        driver.navigate().back();Thread.sleep(2000);
    }
    public void Dropdown() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(DropDown).click();


        //getOptions: getOptions( ) : List<WebElement>
        Select objSelect3 = new Select(driver.findElement(DropdownList));
        List<WebElement> elementCount = objSelect3.getOptions();
        System.out.println(elementCount.size());  Thread.sleep(2000);

        //selectByVisibleText: selectByVisibleText(String arg0): void
        Select objSelect =new Select(driver.findElement(DropdownList));
        objSelect.selectByVisibleText("Option 2");  Thread.sleep(2000);

        //selectByIndex: selectByIndex(int arg0) : void
        Select objSelect1 = new Select(driver.findElement(DropdownList));
        objSelect1.selectByIndex(1);  Thread.sleep(2000);

        //objSelect1.deselectAll();  Thread.sleep(2000);

        //selectByValue: selectByValue(String arg0) : void----not working
//        Select objSelect2 = new Select(driver.findElement(DropdownList));
//        objSelect2.selectByValue("Option 2");  Thread.sleep(2000);



    }

}
