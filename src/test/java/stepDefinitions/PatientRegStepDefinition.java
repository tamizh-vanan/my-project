package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.PatientRegPage;
import utils.TestContextSetup;

import java.awt.*;

public class PatientRegStepDefinition {


    public WebDriver driver;
    TestContextSetup testContextSetup;
    PatientRegPage patientRegPage;

    public PatientRegStepDefinition(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.patientRegPage =testContextSetup.pageObjectManager.getPatientRegPage();
    }
   // LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();

    @When("user Enterss the username {string}")
    public void userEnterssTheUsername(String username) {
        LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
        landingPage.EnterUsername(username);
    }
    @And("Enterss the {string} which we provided")
    public void enterssTheWhichWeProvided(String password) {
        LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
        landingPage.EnterPassword(password);
    }
    @Then("Clickk on the Submit button")
    public void clickk_on_the_submit_button() {
        LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
        landingPage.ClickSubmitBtn();
    }
    @When("Provider clicks on the Search button")
    public void provider_clicks_on_the_search_button() {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.ClickOnEntryBtn();
    }
    @When("Select the patient Demographics menu")
    public void select_the_patient_demographics_menu() {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.ClickOnPDBtn();
    }
    @Then("Enter the uhid {string}")
    public void enter_the_uhid(String UHID) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterHID(UHID);
    }
    @Then("Select the Title from the Dropdown")
    public void select_the_title_from_the_dropdown() {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterTitle();
        patientRegPage.EnterTitleValue();
    }
    @Then("Enter the Firstname {string}")
    public void enter_the_firstname(String FirstName) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterFirstName(FirstName);
    }
    @Then("Enter the Secondname {string}")
    public void enter_the_secondname(String SecondName) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterLastName(SecondName);
    }
    @Then("Select the Gender from the dropdown")
    public void select_the_gender_from_the_dropdown() {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterGender();
        patientRegPage.EnterGenderValue();
    }
    @Then("select the DOB from the calendar")
    public void select_the_dob_from_the_calendar() {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterDOB();
        patientRegPage.EnterDOBValue();
    }
    @Then("Enter the Mobilenumber {int}")
    public void enter_the_mobilenumber(Integer MobileNumber) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterPhoneNo(MobileNumber);
    }
    @Then("Enter the Address {string}")
    public void enter_the_address(String address) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterAddress(address);
    }
    @Then("Enter the taluk {string}")
    public void enter_the_taluk(String Taluk) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterTaluk(Taluk);
    }
    @Then("Enter the cityname {string}")
    public void enter_the_cityname(String City) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterCity(City);
        patientRegPage.EnterCityValue();
    }
    @Then("Enter the country name {string}")
    public void enter_the_country_name(String Country) throws InterruptedException, AWTException {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterCountry(Country);
        patientRegPage.EnterCountryValue();
    }
    @Then("Click on the save button")
    public void click_on_the_save_button() throws InterruptedException {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.ClickOnSave();
    }


   /* @Then("Enter the <AGE>")
    public void enterTheAGE(Integer AGE) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterAge(AGE);
    }*/
    @Then("Enter the {int}")
    public void enter_the(Integer age) {
        PatientRegPage patientRegPage=testContextSetup.pageObjectManager.getPatientRegPage();
        patientRegPage.EnterAge(age);
    }
}
