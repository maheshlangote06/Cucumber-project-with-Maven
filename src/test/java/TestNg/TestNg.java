package TestNg;

import PageObject.TestNg_Object;
import Pages.Practice_Page;
import Pages.TestNg_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestNg extends TestNg_Page {

    @Test(priority = 1)
    public void LoginToWebSite() {
      //  System.out.println("Priority 1");
        logintowebsite();
    }

    @Test(priority = 2)
    public void DropDownCheck() throws InterruptedException {
     //   System.out.println("Priority 2");
       //DropDown();
        // DynamicButton();

    }

    @Test(priority = 3)
    public void initializeEnvironmentTest() throws InterruptedException {
        //Alert();
        //TabSwitch();
       //Mosehover();
    }

    @Test(priority = 4)
    public void loginTest() throws InterruptedException {
        //DoubleCLick();
        //DragDrop();
        BrockenLink();
    }

    @Test(priority = 5)
    public void logoutTest() { // Default priority 0
        quit();      //System.out.println("Priority 5");
    }
}
