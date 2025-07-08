package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}

	By Username = By.xpath("/html[1]/body[1]/app-root[1]/app-signin[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]");

	By Password = By.xpath("//input[@type='password']");

	By SubmitBTN = By.xpath("//button[normalize-space()='Submit']");


	//5-6
	public void getTitle(){
		System.out.println(driver.getTitle());

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
