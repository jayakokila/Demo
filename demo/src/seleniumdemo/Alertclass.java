package seleniumdemo;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co"); 
		 		  driver.manage().window().maximize(); 
		 		  Thread.sleep(5000); 
		  driver.get("http://www.leafground.com/pages/Alert.html");
		  
		  //Alert
		  WebElement alertbox =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(1) > div > div > button"));
		   alertbox.click();
		   Thread.sleep(1000); 
		   driver.switchTo().alert().accept();
		   
		   //confirm
		   WebElement confirmbox =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > button"));
		   confirmbox.click();
		   Thread.sleep(1000); 
		   driver.switchTo().alert().dismiss();
		   
		   //prompt
		   WebElement promptbox =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(7) > div > div > button"));
		   promptbox.click();
		   Thread.sleep(1000); 
		   Alert copytext =driver.switchTo().alert();
		   copytext.sendKeys("ddrf");
		   Thread.sleep(1000);
		   copytext.accept();
		   
		   //linebreaks
		   WebElement linebreaks =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(10) > div > div > button"));
		   linebreaks.click();
		   driver.switchTo().alert().accept();
		   
		   //Sweetalert
		   WebElement sweetalert =driver.findElement(By.cssSelector("#btn"));
		   sweetalert.click();
		   Thread.sleep(5000);
		   WebElement okbtn= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/button"));
		   Thread.sleep(5000);
		   okbtn.click();
		   driver.close();
		    
		  
		 
	}

}
