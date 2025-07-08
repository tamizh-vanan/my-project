package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class PatientRegPage {

    public WebDriver driver;

    public PatientRegPage(WebDriver driver)
    {
        this.driver = driver;

    }
    By EntryBtn= By.xpath("//a[normalize-space()='Entry']");

    By PDBtn= By.xpath("(//a[@class='nav-link ms-2 ng-star-inserted'][normalize-space()='Patient Demographics'])[3]");
   By uhid= By.xpath("//input[@id='uhid']");

    By Title= By.xpath("//span[normalize-space()='Select Title']");
    By TitleValue= By.xpath("//li[@aria-label='Mr']");

    By firstname= By.xpath("(//input[@id='patientname'])[1]");
    By Lastname= By.xpath("(//input[@id='patientname'])[2]");
    By Gender= By.xpath("//span[normalize-space()='Select Gender']");

    By Age= By.xpath("//input[@id='age']");
    By GenderValue= By.xpath("//li[@aria-label='Male']");

    By DOB= By.xpath("//input[@placeholder='dd-mm-yyyy']");
    By DOBYear= By.xpath("//button[normalize-space()='2025']");
    By Year= By.xpath("//span[normalize-space()='2021']");
    By DOBMonth= By.xpath("//span[normalize-space()='Mar']");
    By DOBValue= By.xpath("(//span[@class='p-ripple p-element ng-tns-c25-5 ng-star-inserted'][normalize-space()='3'])[1]");

    By Phone= By.xpath("//input[@id='phone_no']");
    By Address= By.xpath("//input[@id='address']");

    By taluk= By.xpath("//input[@id='taluk']");

    By city= By.xpath("//input[@placeholder='Enter City']");
    By CityValue= By.xpath("(//li[@role='option'])[1]");

    By country= By.xpath("//input[@placeholder='Enter Country']");

    By CountryValue= By.xpath("(//li[@role='option'])[1]");

    By SaveBtn= By.xpath("//button[normalize-space()='save']");

    By Username = By.xpath("/html[1]/body[1]/app-root[1]/app-signin[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]");

    By Password = By.xpath("//input[@type='password']");

    By SubmitBTN = By.xpath("//button[normalize-space()='Submit']");

    public void ClickOnEntryBtn(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Entry']")));
        driver.findElement(EntryBtn).click();
    }

    public void ClickOnPDBtn(){
        driver.findElement(PDBtn).click();
    }
public void EnterHID(String UHID){
    driver.findElement(uhid).sendKeys(UHID);
}



    public void EnterTitle(){
        driver.findElement(Title).click();
    }
    public void EnterTitleValue(){
        driver.findElement(TitleValue).click();
    }
    public void EnterFirstName(String FirstName){
        driver.findElement(firstname).sendKeys(FirstName);
    }
    public void EnterLastName(String SecondName){
        driver.findElement(Lastname).sendKeys(SecondName);
    }
    public void EnterGender(){
        driver.findElement(Gender).click();
    }
    public void EnterAge(int age){
        driver.findElement(Age).sendKeys(String.valueOf(age));
    }
    public void EnterGenderValue(){
        driver.findElement(GenderValue).click();
    }
    public void EnterDOB(){
        driver.findElement(DOB).click();
    }
    public void EnterDOBValue(){
driver.findElement(DOBYear).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='2021']")));
        driver.findElement(Year).click();
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Mar']")));
        driver.findElement(DOBMonth).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".p-datepicker")));
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='3'])[1]")));
        try {
            element2.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
            //driver.findElement(By.xpath("(//span[text()='3'])[1]")).click();
        }

    }
    public void EnterPhoneNo(int MobileNumber){
        driver.findElement(Phone).sendKeys(String.valueOf(MobileNumber));
    }
    public void EnterAddress(String address){
        driver.findElement(Address).sendKeys(address);
    }

    public void EnterTaluk(String Taluk){
        driver.findElement(taluk).sendKeys(Taluk);
    }
    public void EnterCity(String City){
        driver.findElement(city).sendKeys(City);
    }
    public void EnterCityValue(){
        driver.findElement(CityValue).click();
    }
    public void EnterCountry(String Country){
        driver.findElement(country).sendKeys(Country);
    }

    public void EnterCountryValue() throws AWTException, InterruptedException {

        driver.findElement(CountryValue).click();

    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
    public void ClickOnSave() throws InterruptedException {
        WebElement sv = driver.findElement(SaveBtn);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement save = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='save']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});",sv);
        Thread.sleep(3000);
        try {
            save.click();
        }catch (ElementClickInterceptedException e){
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sv);
        }

    }

    public void EnterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-signin[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")));
        driver.findElement(Username).sendKeys(username);
    }

    public void EnterPassword(String password)
    {
        driver.findElement(Password).sendKeys(password);
    }

    public void ClickSubmitBtn()
    {
        driver.findElement(SubmitBTN).click();
    }
}
