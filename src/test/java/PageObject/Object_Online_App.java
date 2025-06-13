package PageObject;

import org.openqa.selenium.By;

public class Object_Online_App {
    public static By AddRemoveElements = By.xpath("//a[normalize-space()='Add/Remove Elements']");
    public static By AddElement = By.xpath("//button[@onclick='addElement()']");
    public static By BasicAuth = By.xpath("//a[normalize-space()='Basic Auth']");
    public static By Challenging_DOM = By.xpath("//a[normalize-space()='Challenging DOM']");
    public static By DragNdrop = By.xpath("//a[normalize-space()='Drag and Drop']");
    public static By DropDown = By.xpath("//a[normalize-space()='Dropdown']");
    public static By DropdownList = By.xpath("//select[@id='dropdown']");
    public static By EntryAD = By.xpath("//a[normalize-space()='Entry Ad']");
    public static By ClickHere = By.xpath("//a[@id='restart-ad']");
    public static By Textt = By.xpath("//div[@class='modal-body']//p[1]");
    public static By Click = By.xpath("//p[normalize-space()='Close']");
    public static By Iframe = By.xpath("//div[@class='modal']");
    public static By NewWindow = By.xpath("//div[@class='modal-body']//p[1]");
    public static By Close = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");
    public static By ClickonFileUpload = By.xpath("//a[normalize-space()='File Upload']");
    public static By Choosefile = By.xpath("//input[@id='file-upload']");
    public static By Uploadfile = By.xpath("//input[@id='file-submit']");

}
