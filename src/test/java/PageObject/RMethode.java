package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class RMethode {
    public static WebDriver driver;

    public void FluentWait(By Elements) {

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(300))  // Maximum time to wait
                .pollingEvery(Duration.ofSeconds(3)) // Interval between each poll
                .ignoring(NoSuchElementException.class); // Exceptions to ignore
        wait.until(ExpectedConditions.visibilityOfElementLocated(Elements));

    }
}
