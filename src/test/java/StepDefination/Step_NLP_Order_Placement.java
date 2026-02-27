package StepDefination;

import Pages.Page_NLP_Order_Placement;
import Pages.AllMethode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_NLP_Order_Placement extends AllMethode {

    Page_NLP_Order_Placement Page = new Page_NLP_Order_Placement();

    @Given("Login to sabor application")
    public void Login_to_sabor_application() throws InterruptedException {

        Page.Openbrowserr();
        Page.SABORPage();
        Page.Orderdetails();
        
    }

    @Then("User need to provide user and pass")
    public void userNeedToProvideUserAndPass() {


        
    }

    @Then("User should check first page")
    public void userShouldCheckFirstPage() {



    }

    @Then("User should check SOGEA avaialability")
    public void userShouldCheckSOGEAAvaialability() {



    }
    
   
}
