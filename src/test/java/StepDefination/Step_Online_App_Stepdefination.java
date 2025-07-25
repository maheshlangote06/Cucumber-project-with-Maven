package StepDefination;

import Pages.Page_Online_App;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Step_Online_App_Stepdefination extends Page_Online_App {

    @Given("Login to application.")
    public void login_to_application() throws InterruptedException {
        Openbrowser();
    }
    @Given("checking Add Remove Elements section")
    public void checking_add_remove_elements_section() throws InterruptedException {
        ClickonAddorRemoveElements();

    }

    @And("close the application")
    public void closeTheApplication() {
        closeTheApplication();
    }

    @Then("Open Challenging Dom section")
    public void openChallengingDomSection() throws InterruptedException, IOException {

        Challenging_DOM();
    }

    @Then("Open Drag and Drop section")
    public void openDragAndDropSection() throws InterruptedException {
        DragNDrop();
    }

    @Then("Open Dropdown Section")
    public void openDropdownSection() throws InterruptedException {
        Dropdown();
    }

    @Then("Open Entry AD Section")
    public void openEntrADSection() throws InterruptedException {
        EntryAD();
    }

    @Then("Open Upload File Section")
    public void openUploadFileSection() throws IOException, InterruptedException {

        UploadFile();
    }

    @Then("Open Hovers Section")
    public void openHoversSection() throws InterruptedException {
        Hovers();
    }

    @Then("Open Infinite Scroll Section")
    public void openInfiniteScrollSection() throws InterruptedException {
        InfiniteScroll();
    }

    @Then("Open JQuery UI Menus Section")
    public void openJQueryUIMenusSection() throws InterruptedException {
        openJQueryUIMenusSection1();
    }
}
