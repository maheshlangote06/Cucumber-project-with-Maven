package StepDefination;

import Pages.Practice_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Practice_stepD extends Pages.Practice_Page {
    @Given("Open practice application")
    public void open_practice_application() throws InterruptedException {
        Login();
    }

    @When("fill data practice application")
    public void fillDataPracticeApplication() throws InterruptedException {
        fill_data();
    }
}
