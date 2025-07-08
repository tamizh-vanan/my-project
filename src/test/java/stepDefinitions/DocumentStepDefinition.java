package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.DocumentPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

import java.awt.*;

public class DocumentStepDefinition {

    public WebDriver driver;
    TestContextSetup testContextSetup;

    DocumentPage documentPage;


    public DocumentStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.documentPage=testContextSetup.pageObjectManager.getDocument();

    }

    @When("User enter the {string}")
    public void user_enter_the(String UHID) {
        documentPage.ClickHSMenu();
        documentPage.clickDocumentMenu();
        documentPage.EnterUHID(UHID);
        documentPage.SelectUHIDValue();
    }
    @Then("select the IP number")
    public void select_the_ip_number() {
documentPage.EnterIPNO();
documentPage.EnterIPNOValue();
    }
    @Then("Select the dategiven")
    public void select_the_dategiven() {
documentPage.SelectDateGiven();
documentPage.SelectDateValue();
    }
    @Then("select the fileType")
    public void select_the_file_type(){
documentPage.SelectFileType();
documentPage.SelectMedicationValue();
    }
    @Then("upload the file")
    public void upload_the_file() throws InterruptedException, AWTException {
documentPage.SelectChooseFile();
//documentPage.selectFile();
    }

}
