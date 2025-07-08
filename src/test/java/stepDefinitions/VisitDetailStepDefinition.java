package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.VisitDetailsPage;
import utils.TestContextSetup;

import java.awt.*;

public class VisitDetailStepDefinition {

    public WebDriver driver;
    TestContextSetup testContextSetup;
    VisitDetailsPage visitDetailsPage;

    public VisitDetailStepDefinition(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.visitDetailsPage =testContextSetup.pageObjectManager.getVisitDetailsPage();
    }

    @When("Select the patient Visit details menu")
    public void select_the_patient_visit_details_menu() {
        VisitDetailsPage visitDetailsPage=testContextSetup.pageObjectManager.getVisitDetailsPage();
        visitDetailsPage.clickPVDMenu();
    }
    @Then("Select the Visit Type")
    public void select_the_visit_type() throws InterruptedException {
        VisitDetailsPage visitDetailsPage=testContextSetup.pageObjectManager.getVisitDetailsPage();
        visitDetailsPage.clickVisitType();
        visitDetailsPage.clickVisitTypeValue();
    }
    @Then("Select the Visit Date")
    public void select_the_visit_date() throws InterruptedException {
        VisitDetailsPage visitDetailsPage=testContextSetup.pageObjectManager.getVisitDetailsPage();
        visitDetailsPage.clickDateofAdmission();
        //Thread.sleep(2000);
        visitDetailsPage.clickDateofAdmissionValue();
        Thread.sleep(3000);
        visitDetailsPage.clickDateofDischarge();
        visitDetailsPage.clickDateofDischargeValue();
    }
    @Then("Select the Doctor's name")
    public void select_the_doctor_s_name() {
        VisitDetailsPage visitDetailsPage=testContextSetup.pageObjectManager.getVisitDetailsPage();
        visitDetailsPage.selectDoctor();
        visitDetailsPage.selectDoctorName();
        visitDetailsPage.IpNumber();
    }
    @Then("Click on the save buttonn")
    public void click_on_the_save_buttonn() throws InterruptedException {
        VisitDetailsPage visitDetailsPage=testContextSetup.pageObjectManager.getVisitDetailsPage();
        visitDetailsPage.clickonsave();
    }

    @Then("Enter thee uhid {string}")
    public void enterTheeUhid(String UHID) throws InterruptedException, AWTException {
        VisitDetailsPage visitDetailsPage=testContextSetup.pageObjectManager.getVisitDetailsPage();
        visitDetailsPage.EnterUHID(UHID);

    }

}
