package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.AddHealthRecordMedication;
import pageObjects.LoginPage;
import pageObjects.PatientRegPage;
import utils.TestContextSetup;

public class AddHealthRecordMedicationStepDefinition {


    public WebDriver driver;
    TestContextSetup testContextSetup;
    AddHealthRecordMedication addHealthRecordMedication;
    LoginPage landingPage;

    public AddHealthRecordMedicationStepDefinition(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.addHealthRecordMedication =testContextSetup.pageObjectManager.getAddHealthRecordMedication();
        this.landingPage =testContextSetup.pageObjectManager.getLoginPage();
    }

    @When("user Enters the usernamee {string}")
    public void userEntersTheUsernamee(String username) {
        LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
        landingPage.EnterUsername(username);
    }

    @And("Enters the {string} which we providedd")
    public void entersTheWhichWeProvidedd(String password) {
        LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
        landingPage.EnterPassword(password);
    }

    @Then("Click on the Submitt button")
    public void clickOnTheSubmittButton() {
        LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
        landingPage.ClickSubmitBtn();
    }
    @When("The user Click on the Health summary menu")
    public void theUserClickOnTheHealthSummaryMenu() {
        addHealthRecordMedication.clickHSBtn();
    }

    @Then("Enter the{string} and {string}")
    public void enterTheAnd(String arg0, String arg1) {
    }

    @And("Click on the Medication menu")
    public void clickOnTheMedicationMenu() {
        addHealthRecordMedication.clickMedicationMenu();
    }


    @Then("Enter thee {int}")
    public void enter_thee(Integer Frequency) throws InterruptedException {
addHealthRecordMedication.selectfrequency(Frequency);
    }


    @And("Enter the status")
    public void enterTheStatus() {
        addHealthRecordMedication.SelectStatus();
    }

    @Then("select the DateTaken")
    public void selectTheDateTaken() {
        addHealthRecordMedication.SelectDateTaken();
    }

    @Then("select the StartDate")
    public void selectTheStartDate() throws InterruptedException {
        addHealthRecordMedication.selectStartTaken();
    }

    @And("Select the EndDate")
    public void selectTheEndDate() throws InterruptedException {
addHealthRecordMedication.selectendTaken();
    }


    @Then("Enter the {string} AND {string}")
    public void enterTheAND(String UHID, String MedicationName) {
        addHealthRecordMedication.EnterUHID(UHID);
        addHealthRecordMedication.EntermedicationName(MedicationName);
    }


    @Then("Enter the {int} and {int}")
    public void enter_the_and(Integer HowMany, Integer Dosage) {
        addHealthRecordMedication.EnterHowMany(HowMany);
        addHealthRecordMedication.EnterDosage(Dosage);

    }


    @And("Click on save")
    public void clickOnSave() {
        addHealthRecordMedication.clickSaveBtn();
    }
}
