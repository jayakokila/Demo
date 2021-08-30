package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    driver.get("http://www.leafground.com/pages/frame.html");
		  //frame1
		  driver.switchTo().frame(0);
		  Thread.sleep(5000);
		  driver.findElement(By.id("Click")).click();
		  driver.switchTo().defaultContent();
		  //frame2
		  driver.switchTo().frame(1);
		  driver.switchTo().frame(0);
		  Thread.sleep(5000);
		  driver.findElement(By.id("Click1")).click();
		  
	}
}
