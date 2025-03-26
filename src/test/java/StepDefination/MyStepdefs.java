package StepDefination;

import AllMethodes.AllMethode;
import Pages.SigningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyStepdefs {
    SigningPage action = new SigningPage();
    AllMethode allMethode = new AllMethode();
    WebDriver driver;

    @Given("Login to application")
    public void login_to_application() throws InterruptedException {
        System.out.println("Application started");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\617018917\\Downloads\\edgedriver_win64 (6)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://bach.cp.test1.9459360a754efbe.euwe2.prd-plat.aws.bt.com/cpportal/home");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("Page Opened");
        driver.findElement(By.xpath("//a[@title='login']")).click();Thread.sleep(10000);


    }
    @Given("Login to Sabor and search order")
    public void Login_to_Sabor_and_search_order() throws InterruptedException {
        WebElement elements = driver.findElement(By.xpath("(//img[@role=\"button\"])[2]"));Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[@role=\"button\"])[2]")).click();Thread.sleep(3000);
        // driver.findElement(By.xpath("")).click();Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@role=\"combobox\"]")).click();Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class=\"siebui-icon-dropdown applet-form-combo applet-list-combo\"]")).click();Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your Openreach reference']")).sendKeys("SGEA03406280");Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-display=\"Search\"]")).click();Thread.sleep(2000);

    }
    @When("ninjas meet, they will fight")
    public void ninjas_meet_they_will_fight() {

    }
    @Then("one ninja dies")
    public void one_ninja_dies_but_not_me() {

    }
    @Then("there is one ninja less alive")
    public void there_is_one_ninja_less_alive() {
        System.out.println("Application End");
    }
}
