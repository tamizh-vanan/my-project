package pageObjects;



import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class VisitDetailsPage {

    public WebDriver driver;

    public VisitDetailsPage(WebDriver driver)
    {
        this.driver = driver;

    }
    By PVDMenu=By.xpath("(//a[text()='Patient Visit Details'])[3]");
    By VisitType=By.xpath("//span[text()='Select Visit Type']");
    By VisitTypeValue=By.xpath("//span[text()='IP']");

    By DateofAdmission=By.xpath("//input[@class='ng-tns-c25-20 p-inputtext p-component ng-star-inserted']");

    By DateofAdmissionValue=By.xpath("//span[normalize-space()='10']");

    By DateofDischarge=By.xpath("//input[@class='ng-tns-c25-21 p-inputtext p-component ng-star-inserted']");
    By DateofDischargeValue=By.xpath("//span[normalize-space()='11']");

    By IPNumber=By.xpath("//input[@id='ip_number']");

    By DoctorName=By.xpath("//span[normalize-space()='Select Doctor']");
    By DoctorNameValue=By.xpath("(//li[@aria-label='Dr. Ravi'])[1]");

    By VisitDate=By.xpath("(//input[@placeholder='dd-mm-yyyy'])[1]");
    By VisitDateValue=By.xpath("(//span[text()='3'])[1]");
    By Doctor=By.xpath("//span[text()='Select Doctor']");
    //By DoctorName=By.xpath("//span[text()='Dr. Ram']");

    By save=By.xpath("//button[text()='save']");
    By uhid=By.xpath("//input[@id='uhiId']");

    public void EnterUHID(String UHID) throws InterruptedException, AWTException {
        driver.findElement(uhid).sendKeys(UHID);
        Thread.sleep(3000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
public void clickPVDMenu(){
    driver.findElement(PVDMenu).click();
}
public void clickVisitType() throws InterruptedException {

    //driver.findElement(VisitType).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Visit Type']/following-sibling::div[@role='button']")));
    save.click();
    Thread.sleep(2000);
}

public void clickVisitTypeValue() throws InterruptedException {
   /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement vt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='OP']")));

    vt.click();
    Thread.sleep(2000);*/
    System.out.println("done visit date");
    WebElement element = driver.findElement(By.xpath("//li[@aria-label='IP']"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    Thread.sleep(2000);
    System.out.println("done visit date");
}
public void clickDateofAdmission() throws InterruptedException {
    //Thread.sleep(2000);
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        System.out.println("visited");
        WebElement vt1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='ng-tns-c25-20 p-inputtext p-component ng-star-inserted']")));
        vt1.click();
    }catch (Exception e){
        System.out.println(e);
    }

    //driver.findElement(VisitDate).click();


}
public void clickDateofAdmissionValue() throws InterruptedException {
    /*WebElement element1 = driver.findElement(By.xpath("(//span[@class='p-ripple p-element ng-tns-c25-5 p-highlight ng-star-inserted'])[1]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
    Thread.sleep(2000);*/

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".p-datepicker")));
    WebElement vt2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='10']")));

    try {
        vt2.click();
    } catch (Exception e) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", vt2);
        //driver.findElement(By.xpath("(//span[text()='3'])[1]")).click();
    }
}
public void selectDoctor(){
    driver.findElement(Doctor).click();
}
public void selectDoctorName(){
    driver.findElement(DoctorNameValue).click();

}
public void clickonsave() throws InterruptedException {
    //driver.findElement(save).click();

    /*WebElement sv = driver.findElement(save);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement save = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='save']")));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView({block: 'center'});",sv);
    Thread.sleep(3000);
*/
    WebElement saveBtn = driver.findElement(By.xpath("//button[text()='save']"));
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", saveBtn);
    Thread.sleep(5000); // short wait to ensure animation/scroll completes
    //saveBtn.click();

    try {
        saveBtn.click();
    }catch (ElementClickInterceptedException e){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
        saveBtn.click();
    }
}
    public void clickDateofDischarge() throws InterruptedException {
        //Thread.sleep(2000);
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
            System.out.println("Discharged");
            WebElement vt1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='ng-tns-c25-21 p-inputtext p-component ng-star-inserted']")));
            vt1.click();
        }catch (Exception e){
            System.out.println(e);
        }}
        public void clickDateofDischargeValue() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
            WebElement vt2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='11']")));

            try {
                vt2.click();
            } catch (Exception e) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", vt2);
            }
        }
        public void IpNumber(){
        driver.findElement(IPNumber).sendKeys("1234");
        }
}
