package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegisterPage extends BasePage {

	public static String signIn_xpath = "//a[@title='Log in to your customer account']";
	public static String email_id = "email_create";
	public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";
	public static String dresses_linkText = "DRESSES";
	public static String summerDresses_xpath = "//div[@id='block_top_menu']/ul/li[2]/ul/li[3]//a[@title='Summer Dresses']";
	public static String productListingHeading_xpath = "(//span[@class='cat-name'])[1]";

	public RegisterPage(BrowserDriver driver) {
		super(driver);
	}

	public static void openApplicaiton() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	public static void clickSignIn() {
		driver.findElement(By.xpath(signIn_xpath)).click();
	}

	public static void createAccount(String emailid) {
		emailid = emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
		driver.findElement(By.id(email_id)).sendKeys(emailid);
		driver.findElement(By.xpath(createAccount_xpath)).click();
	}

	// Perform mouse hover on main menu and click on submenu
	public static void navigateToMenu() {
		Actions actions = new Actions(driver);
		WebElement dressesTab = driver.findElement(By.linkText(dresses_linkText));
		WebElement summerDresses = driver.findElement(By.xpath(summerDresses_xpath));
		actions.moveToElement(dressesTab).moveToElement(summerDresses).click().perform();
	}

	public static String getProductListTitle() {
		String productTitle = driver.findElement(By.xpath(productListingHeading_xpath)).getText();
		return productTitle.trim();
	}

}
