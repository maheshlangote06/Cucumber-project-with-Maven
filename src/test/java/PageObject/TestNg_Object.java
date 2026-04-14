package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class TestNg_Object {
    public static By DynamicButton = By.xpath("//button[@name='start']");
    public static By DynamicButton1 = By.xpath("//button[@name='stop']");
    public static By Alert = By.xpath("//button[@id='alertBtn']");
    public static By ConfirmAlert = By.xpath("//button[@id='confirmBtn']");
    public static By PromtAlert = By.xpath("//button[@id='promptBtn']");
    public static By WindowHandle = By.xpath("//button[@onclick='myFunction()']");
    public static By PopupWindowHandle = By.xpath("//button[@id='PopUp']");
    public static By Register = By.xpath("//a[normalize-space()='Register now!']");

}
