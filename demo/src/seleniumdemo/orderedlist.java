package seleniumdemo;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class orderedlist {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    List<WebElement> element1= driver.findElements(By.cssSelector("#Serialize > ul>li"));
	  
	    
		 int length = element1.size();
		 System.out.println(length);
		 Thread.sleep(10000);
		 
		 
		 Actions act1 = new Actions(driver);
		 act1.keyDown(Keys.CONTROL)
		 .click(element1.get(0))
		 .click(element1.get(2))
		 .click(element1.get(4)).build().perform();
		 }
		 
		    
		 
		 
		 
		
		 
		 
		 

		 
		 
		 

}
