package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v132.network.model.Response;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static java.awt.SystemColor.text;

public class Uti_Online_App<iWebElement> extends PageObject.Object_Online_App{
    WebDriver driver;

    AllMethode methode = new AllMethode();

    public void  Openbrowser() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Asus\\Downloads\\Framework\\msedgedriver.exe");
       // Logger log = LogManager.getLogger(LogExample.class.getName());
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();Thread.sleep(1000);
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
        driver.navigate().back();Thread.sleep(2000);
        //objSelect1.deselectAll();  Thread.sleep(2000);
        //selectByValue: selectByValue(String arg0) : void----not working
//        Select objSelect2 = new Select(driver.findElement(DropdownList));
//        objSelect2.selectByValue("Option 2");  Thread.sleep(2000);
    }
    public void EntryAD() throws InterruptedException {
        driver.findElement(EntryAD).click();Thread.sleep(2000);
        String text = driver.findElement(NewWindow).getText();
        System.out.println(text);
        driver.findElement(Close).click();Thread.sleep(2000);
        driver.navigate().back();Thread.sleep(2000);
//        WebElement iFrame = driver.findElement(Iframe);
//        driver.switchTo().frame(iFrame);Thread.sleep(2000);
//
//        WebElement Text = driver.findElement(Textt);
//        System.out.println(Text);Thread.sleep(2000);
//        driver.findElement(Click).click();Thread.sleep(2000);
    }
    public void UploadFile() throws InterruptedException, IOException {
        driver.findElement(ClickonFileUpload).click(); Thread.sleep(2000);
       // WebElement chooseFile = driver.findElement(Choosefile);

        // Use Actions class to move to the "Choose File" button and click on it
//        Actions ac = new Actions(driver);
//        ac.click(chooseFile).perform();
//        Thread.sleep(2000);
//        Runtime.getRuntime().exec("E:Software Quality Engineer.docx");
//        Thread.sleep(2000);
//        List<WebElement> uploadedPath= driver.findElements(By.cssSelector("E:\\Software Quality Engineer.docx"));
//        if(!uploadedPath.isEmpty()) {
//            System.out.println("File Uploaded successfully"); Thread.sleep(2000);
//        }
        File uploadFile = new File("E:\\Cognizant\\internship in shree ram industry.pdf");
        WebElement fileInput = driver.findElement(Choosefile);
        fileInput.sendKeys(uploadFile.getAbsolutePath());Thread.sleep(2000);
        driver.findElement(Uploadfile).click(); Thread.sleep(2000);
        System.out.println("File Uploaded Successfully");
        driver.navigate().back();Thread.sleep(2000);
    }
    public void HorizSlider() throws InterruptedException {
        driver.findElement(HoriZon).click();Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(slide));Thread.sleep(2000);

        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].volume = 5;", element);Thread.sleep(2000);
        }
    }

    public void Hovers() throws InterruptedException {
        driver.findElement(Hover).click();Thread.sleep(2000);
           WebElement ele = driver.findElement(HoverOnElement);
        WebElement ele1 = driver.findElement(HoverOnElement1);
           WebElement ele2 = driver.findElement(HoverOnElement2);

        Actions action = new Actions(driver);Thread.sleep(2000);
        action.moveToElement(ele).perform();Thread.sleep(2000);
        WebElement someWebElement = driver.findElement(userName);
        try {
            if(someWebElement.isDisplayed()){

                String UserDetails = someWebElement.getText();
                System.out.println(UserDetails);Thread.sleep(2000);
            }}
        catch(Exception e){
            System.out.println("User details not available");
        }

        action.moveToElement(ele1).perform();Thread.sleep(2000);
        WebElement someWebElement1 = driver.findElement(userName1);
        try {
            if(someWebElement1.isDisplayed()){
                String UserDetails1 = someWebElement1.getText();Thread.sleep(2000);
                System.out.println(UserDetails1);
            }}
        catch(Exception e){
            System.out.println("User details not available");
        }


       action.moveToElement(ele2).perform();Thread.sleep(2000);
        WebElement someWebElement2 = driver.findElement(userName2);
        Boolean Flag = someWebElement2.isDisplayed();
        if (Flag == true) {
            String UserDetails2 = someWebElement2.getText();Thread.sleep(2000);
            System.out.println(UserDetails2);
            driver.findElement(ViewProfile).click();

        } else {
            System.out.println("User details not available");
        }

    }
}