package StepDefination;

import Pages.Page_DemoQa;
import Utilities.AllMethode;
import Utilities.ReadConfg;
import Pages.Page_Online_App;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Step_DemoQa extends Page_DemoQa {
    AllMethode methode = new AllMethode();
    Page_Online_App utiOnlineApp = new Page_Online_App();
    ReadConfg readConfg = new ReadConfg();
    String url1 = readConfg.getBaseURL();

    @Given("Login to DemoQA application.")
    public void login_to_demo_qa_application() throws InterruptedException {
      Openbrowser();

    }

    @Given("verifying the Check Box")
    public void verifying_the_check_box() throws InterruptedException {
               CheckBox();
            Thread.sleep(2000);

    }



    @And("verifying the Radio button")
    public void verifyingTheRadioButton() throws InterruptedException {
            RadioButton();
    }

    @And("verifying the WebTable")
    public void verifyingTheWebTable() {

    }
}
