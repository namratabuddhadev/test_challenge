package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Signup Page Repository

public class Signup {

	 private static WebElement element = null;
	    
	    public static WebElement btn_SignUp(WebDriver driver)
	    {
	
	     element = driver.findElement(By.className("userSignupButton"));
	
	     return element;
	
	
	   }
	    
	    public static WebElement txt_SignUpEmail(WebDriver driver)
	    {
	
	     element = driver.findElement(By.xpath("//*[@id='emailInput']/div[1]/input"));
	
	     return element;
	
	
	   }
	    
	    public static WebElement txt_SignUpYahoo(WebDriver driver)
	    {
	
	     element = driver.findElement(By.xpath("//*[@id='yahooRegisterButton']/span[2]"));
	
	     return element;
	
	   }
	    
	    public static WebElement lnk_SignUpLogin(WebDriver driver)
	    {
	
	     element = driver.findElement(By.xpath("//*[@id='signupLoginLink']/a"));
	
	     return element;
	
	   }
	    
	    public static WebElement txt_InfoFeedbackinfo(WebDriver driver)
	    {
	
	     element = driver.findElement(By.xpath("//*span[contains(., 'have') or contains(.,'Please')]"));
	
	     return element;
	  
	
	   }
	    
	    public static WebElement lnk_SignUpPartner(WebDriver driver)
	    {
	
	    	  element = driver.findElement(By.xpath("//*[@id='partnerRegisterLink']/a"));
	
	     return element;
	
	   }
	    
	   
	

}
