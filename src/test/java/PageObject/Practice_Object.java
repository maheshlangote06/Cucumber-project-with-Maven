package PageObject;

import org.openqa.selenium.By;

public class Practice_Object {

    public static By name = By.xpath("//input[@id='name']");
    public static By email = By.xpath("//input[@id='email']");
    public static By phone = By.xpath("//input[@id='phone']");
    public static By address = By.xpath("//textarea[@id='textarea']");
    public static By male = By.xpath("//input[@id='male']");
    public static By female = By.xpath("//input[@id='female']");
    public static By sunday = By.xpath("//input[@id='sunday']");
    public static By monday = By.xpath("//input[@id='monday']");
    public static By country = By.xpath("//select[@id='country']");
    public static By colors = By.xpath("//select[@id='colors']//option[1]");
    public static By Page = By.xpath("//h1[@class='title']");
//    public static By Iframe = By.xpath("");
//    public static By Iframe = By.xpath("");
//    public static By Iframe = By.xpath("");
//    public static By Iframe = By.xpath("");
//    public static By Iframe = By.xpath("");
}
