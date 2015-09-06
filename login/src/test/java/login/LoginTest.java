package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.Home;
import repository.LoginPage;


public class LoginTest {
	
// Test Case 1: Validate that on entering correct user name and password successful login happens 
   @Test 
	public void validateSuccessfulLogin()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.txtbx_Email(driver).sendKeys("namratabuddhadev@gmail.com");
		LoginPage.txtbx_Password(driver).sendKeys("helloworld1");
		LoginPage.btn_LogIn(driver).click();
		driver.getCurrentUrl().equals("https://www.appdirect.com/home");
		
	}
	
   //Test Case 2: Validate that unsuccessful Login on Blank email
	@Test 
	public void validateUnSuccessfulLoginBlankemail()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.txtbx_Email(driver).sendKeys("");
		LoginPage.txtbx_Password(driver).sendKeys("helloworld1");
		LoginPage.btn_LogIn(driver).click();
		String emailaddress= LoginPage.txtbx_Email(driver).getAttribute("value");
		Assert.assertTrue(emailaddress.equals(""));
		driver.close();
		
	}
	
	// Test Case 3: Validate that unsuccessful login on blank password
	@Test 
	public void validateUnSuccessfulLoginBlankPassword()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.txtbx_Email(driver).sendKeys("nam@nam.com");
		LoginPage.txtbx_Password(driver).sendKeys("");
		LoginPage.btn_LogIn(driver).click();
		String emailaddress= LoginPage.txtbx_Password(driver).getAttribute("value");
		Assert.assertTrue(emailaddress.equals(""));
		driver.close();
		
	}
	
	//Test case 4: Successful naviagtion to ForgotPassword page
	@Test 
	public void NavigateToForwardPassword()
	
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.ForgotPasswordLink(driver).click();
	    String currentURL = driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("https://www.appdirect.com/forgotPassword"));
		
		driver.close();
		
	}
	
	// Test Case 5: Clicking on Yahoologin link takes to Yahoo login page
	@Test 
	public void NavigateToYahooLogin()
	
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.LoginYahoo(driver).click();
	    String YahooURL = driver.getCurrentUrl();
	    Assert.assertTrue(YahooURL.contains("https://login.yahoo.com/config/login"));
		
		driver.close();
		
	}
	
	
}
