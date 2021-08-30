package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement element1 = driver.findElement(By.id("email"));

		element1.sendKeys("jayakokila");

		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		int xOffset1 = element1.getLocation().getX();
		int yOffset1 = element1.getLocation().getY();
		System.out.println("xOffset1--->" + xOffset1 + " yOffset1--->" + yOffset1);
		// Secondly, get x and y offset for to object
		int xOffset = element2.getLocation().getX();
		int yOffset = element2.getLocation().getY();
		System.out.println("xOffset--->" + xOffset + " yOffset--->" + yOffset);
		xOffset = (xOffset - xOffset1) + 10;
		yOffset = (yOffset - yOffset1) + 20;

	
	    
		 Actions act = new Actions(driver);
		 act.dragAndDrop(element1, element2).doubleClick(element1).dragAndDropBy(element2,xOffset,yOffset).release(element2).perform();
		 
			/*
			 * clickAndHold(element1).pause(2000).moveToElement(element2,xOffset,yOffset).
			 * release ().perform();
			 */
		 

	}
}