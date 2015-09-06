package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Forgot Password repository

public class ForgotPassword {
	

    private static WebElement element = null;
    
    public static WebElement btn_SendEmail(WebDriver driver)
    {

     element = driver.findElement(By.xpath("//*[@id='id27']"));

     return element;


   }
    
    public static WebElement txt_EmailForgotPassword(WebDriver driver)
    {

     element = driver.findElement(By.xpath("//*[@id='id26']/div[3]/span/input"));

     return element;


   }
    
    public static WebElement txt_InfoFeedback(WebDriver driver)
    {

     element = driver.findElement(By.xpath("//*[@id='id26']/div[2]/ul/li"));

     return element;


   }
}