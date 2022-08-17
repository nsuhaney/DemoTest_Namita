package autoapp.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import autoapp.automation.utility.BrowserDriver;

public class AuthenticationPage extends BasePage {
	
	public static String createAccountError_xpath =  "//div[@id='create_account_error']//ol";

	public AuthenticationPage(BrowserDriver driver) {
		super(driver);
	}
	
  public static void openApplicaiton() {
  driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  driver.manage().window().maximize();
}
  
  public static String captureError() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createAccountError_xpath)));
	    return driver.findElement(By.xpath(createAccountError_xpath)).getText();
	    }
}
