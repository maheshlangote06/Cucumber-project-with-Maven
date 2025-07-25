package Utilities;

import PageObject.Object_Online_App;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AllMethode extends Object_Online_App {


    public static EdgeDriver driver;



public void FluentWait(By Elements){
           FluentWait<EdgeDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))  // Maximum time to wait
            .pollingEvery(Duration.ofMillis(3)) // Interval between each poll
            .ignoring(NoSuchElementException.class); // Exceptions to ignore
  wait.until(ExpectedConditions.visibilityOfElementLocated(Elements));

}

}