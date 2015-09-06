package Signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.Home;
import repository.LoginPage;
import repository.Signup;

//Signup Page Test scenarios 

public class SignUpTest {
	
	//Test Case 6: Send Email on Sign up
	@Test 
	public void SendEmailOnSignup()
	
	{
		String regex= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
	
		Home.btn_HomeLogIn(driver).click();
		LoginPage.SignUp(driver).click();
	    String currentURL = driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("https://www.appdirect.com/signup"));
	    Signup.txt_SignUpEmail(driver).sendKeys("tt@iIooo.com");
	    Assert.assertTrue(Signup.txt_SignUpEmail(driver).getAttribute("value").matches(regex));
	    Signup.btn_SignUp(driver).click();
		
		driver.close();
		
	}
//Test Case 7: Click login link to navigate to login page again
	
	@Test 
	public void ClicktoNavigateLoginPage()
	
	{
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.SignUp(driver).click();
	    String currentURL = driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("https://www.appdirect.com/signup"));
	    Signup.lnk_SignUpLogin(driver).click();
	    String nextURL= driver.getCurrentUrl();
	    Assert.assertTrue(nextURL.contains("https://www.appdirect.com/login"));
		
		driver.close();
		
	}
	
	//Test Case 8: Click to navigate on Partners page
	
	@Test 
	public void ClicktoNavigatePartnersPage()
	
	{
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.SignUp(driver).click();
	    String currentURL = driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("https://www.appdirect.com/signup"));
	    Signup.lnk_SignUpPartner(driver).click();
	    String partnerURL= driver.getCurrentUrl();
	    Assert.assertTrue(partnerURL.contains("https://www.appdirect.com/developers/register"));
		
		driver.close();
		
	}
	// Test Case 9 : Click to navigate on Yahoo Sign up Page
	@Test 
	public void ClicktoYahooSignup()
	
	{
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
		
		Home.btn_HomeLogIn(driver).click();
		LoginPage.SignUp(driver).click();
	    String currentURL = driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("https://www.appdirect.com/signup"));
	    Signup.txt_SignUpYahoo(driver).click();
	    String YahooSignupURL= driver.getCurrentUrl();
	    Assert.assertTrue(YahooSignupURL.contains("https://login.yahoo.com/config/login"));
		
		driver.close();
		
	}
}
