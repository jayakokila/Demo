package seleniumdemo;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	  
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("email")).sendKeys("jayakokila");
	    driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("S");
	    driver.findElement(By.name("username")).sendKeys("Selenium");
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");
	    driver.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']")).click();
	    driver.navigate().refresh();
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.quit();
	    }
	    
	    
	}


