package StepDefination;

import Utilities.Uti_Online_App;
import io.cucumber.java.en.Given;

public class Step_Online_App_Stepdefination extends Uti_Online_App {
    @Given("Login to application.")
    public void login_to_application() throws InterruptedException {
        Openbrowser();
        ClickonAddorRemoveElements();
    }
    @Given("checking Add Remove Elements section")
    public void checking_add_remove_elements_section() {

    }
}
