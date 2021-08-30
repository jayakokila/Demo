package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    WebElement emaillink=driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(1) > a"));
	
    emaillink.click();
    WebElement createaccount=driver.findElement(By.cssSelector("body > div > header > div > div > div > div > a > span.laptop-desktop-only"));
   
      createaccount.click();
   
      WebElement firstname=driver.findElement(By.id("firstName"));
      firstname.sendKeys("Mohila");
      WebElement lastName=driver.findElement(By.id("lastName"));
      lastName.sendKeys("hila");
      WebElement username=driver.findElement(By.id("username"));
      username.sendKeys("mohila212hila");
      WebElement password=driver.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
      password.sendKeys("mohila@123");
      WebElement confirm=driver.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
      confirm.sendKeys("mohila@123");
      WebElement next=driver.findElement(By.cssSelector("#accountDetailsNext > div > button > span"));
      next.click();
      Thread.sleep(5000);
      WebElement phonenumber=driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]"));
      phonenumber.sendKeys("9488059787");
      
      WebElement next1=driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3 > div > div.qhFLie > div > div > button > span"));
      next1.click();
      driver.close();
	    
      
	}

}
