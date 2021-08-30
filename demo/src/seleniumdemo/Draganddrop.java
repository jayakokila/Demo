package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	    driver.get("http://www.leafground.com/pages/drop.html");
	    WebElement element1=driver.findElement(By.id("draggable"));
	    WebElement element2=driver.findElement(By.id("droppable"));
	    Actions act1=new Actions(driver);
	    act1.dragAndDrop(element1,element2).build().perform();
	    }
}
