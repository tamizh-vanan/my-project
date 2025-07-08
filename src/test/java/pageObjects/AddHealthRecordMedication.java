package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddHealthRecordMedication {

    public WebDriver driver;

    public AddHealthRecordMedication(WebDriver driver)
    {
        this.driver = driver;

    }
    By  HS=By.xpath("//a[text()=' Health Summary ']");

    By  medicationMenu=By.xpath("(//a[@class='nav-link ms-2 ng-star-inserted'][normalize-space()='Medications'])[7]");
    By  Uhid=By.xpath("//input[@placeholder='Enter UHID']");
    By  medicationName=By.xpath("//input[@placeholder='Enter Medication Name']");

    By  How_Many=By.xpath("//input[@placeholder='Enter']");
    By  dosage=By.xpath("//input[@placeholder='Enter Dosage']");
    By  frequency=By.xpath("//span[text()='Select Frequency']");
    By  frequencyValue=By.xpath("//span[text()='2 times per day']");
    By  Status=By.xpath("//span[text()='Select Status']");
    By  StatusValue=By.xpath("//span[text()='I took this in the past']");
    By  DateTaken=By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]");
    By  DateTakenValue=By.xpath("//span[normalize-space()='2']");

    By  StartTaken=By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]");
    By  startDateValue=By.xpath("(//span[normalize-space()='3'])[1]");
    By  endTaken=By.xpath("(//input[@placeholder='dd-mm-yyyy'])[3]");
    By  endDateValue=By.xpath("//span[normalize-space()='6']");

    By saveBtn= By.xpath("//button[normalize-space()='save']");

    public void clickHSBtn(){
        driver.findElement(HS).click();
    }
    public void clickMedicationMenu(){
        driver.findElement(medicationMenu).click();
    }
    public void EnterUHID(String UHID){
        driver.findElement(Uhid).sendKeys(UHID);
    }

    public void EntermedicationName(String MedicationName){
        driver.findElement(medicationName).sendKeys(MedicationName);
    }
    public void EnterHowMany(int HowMany){
        driver.findElement(How_Many).sendKeys(String.valueOf(HowMany));
    }
    public void EnterDosage(int Dosage){
        driver.findElement(dosage).sendKeys(String.valueOf(Dosage));
    }

public void selectfrequency(int Frequency) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(frequency).click();
        driver.findElement(frequencyValue).click();
}

public void SelectStatus(){
        driver.findElement(Status).click();
        driver.findElement(StatusValue).click();
}

public void SelectDateTaken(){
        driver.findElement(DateTaken).click();
        driver.findElement(DateTakenValue).click();
}
public void selectStartTaken() throws InterruptedException {
        driver.findElement(StartTaken).click();
        Thread.sleep(3000);
        driver.findElement(startDateValue).click();
}

public void selectendTaken() throws InterruptedException {
        driver.findElement(endTaken).click();
    Thread.sleep(3000);
        driver.findElement(endDateValue).click();
}
public void clickSaveBtn(){
        driver.findElement(saveBtn).click();
}
}
