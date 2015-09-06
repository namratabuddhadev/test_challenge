package ForgotPassword;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.Home;
import repository.LoginPage;
import repository.ForgotPassword;

public class ForgotPasswordTest {
	//Test Case 10: Validate email is send on Forgot Password
	@Test 
	public void SendEmailOnForgotPassword()
	
	{
		String regex= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://appdirect.com");
	
		Home.btn_HomeLogIn(driver).click();
		LoginPage.ForgotPasswordLink(driver).click();
	    String currentURL = driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("https://www.appdirect.com/forgotPassword"));
	    ForgotPassword.txt_EmailForgotPassword(driver).sendKeys("nam@nam.com");
	    Assert.assertTrue(ForgotPassword.txt_EmailForgotPassword(driver).getAttribute("value").matches(regex));
	    ForgotPassword.btn_SendEmail(driver).click();
	    Assert.assertEquals(ForgotPassword.txt_InfoFeedback(driver).getText(), "An email has been sent to you with a link to reset your password.");
	    
		driver.close();
		
	}

}
