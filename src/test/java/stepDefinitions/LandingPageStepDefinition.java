package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
public WebDriver driver;
public String landingPageProductName;
public String offerPageProductName;
TestContextSetup testContextSetup;
LoginPage landingPage;
//Spring framework, EJB, 
//SRP
//
public LandingPageStepDefinition(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	this.landingPage =testContextSetup.pageObjectManager.getLoginPage();
}
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
		landingPage.getTitle();
	}
	@When("user Enters the username {string}")
	public void userEntersTheUsername(String username) {
		LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
		landingPage.EnterUsername(username);
	}
	@And("Enters the {string} which we provided")
	public void entersTheWhichWeProvided(String password) {
		LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
		landingPage.EnterPassword(password);
	}
	@Then("Click on the Submit button")
	public void click_on_the_submit_button() {
		LoginPage landingPage  =testContextSetup.pageObjectManager.getLoginPage();
		landingPage.ClickSubmitBtn();
	}



}
