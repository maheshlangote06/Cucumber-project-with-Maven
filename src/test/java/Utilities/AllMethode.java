package Utilities;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllMethode {
    WebDriver driver;

//    private WebElement element = null;
//    private String old_win = null;
//    private String lastWinHandle;
//
//    public void switchToNewWindow() {
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\617018917\\Downloads\\edgedriver_win64 (6)\\msedgedriver.exe");
//        driver = new EdgeDriver();
//        old_win = getDriver().getWindowHandle();
//        for (String winHandle : getDriver().getWindowHandles())
//            lastWinHandle = winHandle;
//        getDriver().switchTo().window(lastWinHandle);
//    }


    private void scrollToElement(WebElement webElement) throws Exception {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded()", webElement);
        Thread.sleep(500);
    }
    public void putwait() throws InterruptedException {
       Thread.sleep(2000);
    }
}