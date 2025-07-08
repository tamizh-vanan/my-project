package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DocumentPage {

    public WebDriver driver;

    public DocumentPage(WebDriver driver){
        this.driver=driver;
    }

    By  HS=By.xpath("//a[normalize-space()='Health Summary']");
By docymentMenu= By.xpath("(//a[text()='Documents'])[1]");
By uhid= By.xpath("//input[@placeholder='Enter UHID']");

By uhidValue=By.xpath("(//li[@role='option'])[1]");
By ipNo= By.xpath("//span[normalize-space()='Select IP Number']");

By ipNoValue=By.xpath("(//li[@id='p-highlighted-option'])[1]");

By dateGiven=By.xpath("//input[@placeholder='dd-mm-yyyy']");

By dateGivenValue=By.xpath("(//span[normalize-space()='9'])[1]");

By fileType=By.xpath("//span[contains(text(),'Select File Type')]");

By medication=By.xpath("//span[normalize-space()='Medications']");

By ChooseFile=By.xpath("(//input[@type='file'])[1]");

public void clickDocumentMenu(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement docu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='nav-link ms-2 ng-star-inserted'][normalize-space()='Documents'])[7]")));
    docu.click();
}
public void ClickHSMenu(){
    driver.findElement(HS).click();
}

public void EnterUHID(String UHID){
    driver.findElement(uhid).sendKeys(UHID);
}

public void SelectUHIDValue(){
    driver.findElement(uhidValue).click();
}
public void EnterIPNO(){
    driver.findElement(ipNo).click();
}

public void EnterIPNOValue(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement va = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='ng-star-inserted'][normalize-space()='IP10229'])[1]")));
    va.click();
}
public void SelectDateGiven(){
    driver.findElement(dateGiven).click();
}
public void SelectDateValue(){
    driver.findElement(dateGivenValue).click();
}
public void SelectFileType(){
    driver.findElement(fileType).click();
}
public void SelectMedicationValue(){
    driver.findElement(medication).click();
}
public void SelectChooseFile(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement s = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='file'])[1]")));
    s.sendKeys("C:\\Users\\dtamilvanan\\IdeaProjects\\CucumberFramework\\CucumberFramework\\src\\main\\java\\Labreport.pdf");
    //driver.findElement(ChooseFile).click();
}

public void selectFile() throws AWTException, InterruptedException {
    String file="C:\\Users\\dtamilvanan\\IdeaProjects\\CucumberFramework\\CucumberFramework\\src\\main\\java\\Labreport.pdf";
    StringSelection selection=new StringSelection(file);
    Thread.sleep(3000);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);


}
}
