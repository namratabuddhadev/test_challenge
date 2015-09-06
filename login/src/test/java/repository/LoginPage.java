package repository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//LoginPage Repository

public class LoginPage {
	

	
    private static WebElement element = null;
    
    public static WebElement txtbx_Email(WebDriver driver){

     element = driver.findElement(By.xpath("//*[@id='username']"));

     return element;

     }

 public static WebElement txtbx_Password(WebDriver driver){

     element = driver.findElement(By.xpath("//*[@id='password']"));

     return element;

     }

 public static WebElement btn_LogIn(WebDriver driver){

     element = driver.findElement(By.xpath("//*[@name='signin']"));

     return element;

     }

 public static WebElement MissingValue(WebDriver driver){

     element = driver.findElement(By.xpath("//*[@*[starts-with(., 'missing')]]"));

     return element;

     }
 
 public static WebElement ForgotPasswordLink(WebDriver driver){

     element = driver.findElement(By.xpath("//*[@id='password-w-lbl']/a"));

     return element;

     }
 public static WebElement SignUp(WebDriver driver){

	 element = driver.findElement(By.cssSelector("a[href*='/signup']"));

     return element;

     }
 
 public static WebElement LoginYahoo(WebDriver driver){

	 element = driver.findElement(By.xpath(".//*[@id='yahooLoginButton']"));

     return element;

     }



}
