package repository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Home Page Repository

public class Home {
	

    private static WebElement element = null;
    
    public static WebElement btn_HomeLogIn(WebDriver driver){

     element = driver.findElement(By.xpath("//*[@id='newnav']/header/div/menu/ul/li[4]/a"));

     return element;

     }

}
