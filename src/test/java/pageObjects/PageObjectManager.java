package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LoginPage loginPage;

	public  PatientRegPage patientRegPage;
	public VisitDetailsPage visitDetailsPage;

	public AddHealthRecordMedication addHealthRecordMedication;
	public DocumentPage document;

	public WebDriver driver;

	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public LoginPage getLoginPage()
	{

		loginPage= new LoginPage(driver);
	 return loginPage;
	}

	public PatientRegPage getPatientRegPage(){

		patientRegPage=new PatientRegPage(driver);
		return patientRegPage;
	}
	public VisitDetailsPage getVisitDetailsPage(){

		visitDetailsPage=new VisitDetailsPage(driver);
		return visitDetailsPage;
	}
	public AddHealthRecordMedication getAddHealthRecordMedication(){

		addHealthRecordMedication=new AddHealthRecordMedication(driver);
		return addHealthRecordMedication;
	}

	public DocumentPage getDocument(){
		document=new DocumentPage(driver);
		return document;
	}
}
