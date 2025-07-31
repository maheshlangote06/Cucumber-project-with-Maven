package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/resources/DemoQa_Website.feature",
glue = "StepDefination",
        plugin = {"pretty", "html:target/cucumber-reports.html",
        "html:target/cucumber-reports.html",
        "junit:target/cucumber-reports.xml",
                "json:target/cucumber-reports.json"},
        monochrome = true


)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
