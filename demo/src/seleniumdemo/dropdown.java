package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class dropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    driver.get("http://www.leafground.com/pages/Dropdown.html");
	    Actions actions = new Actions(driver);
	    WebElement dropdown =driver.findElement(By.id("dropdown1"));
	    Thread.sleep(5000);
	    actions.moveToElement(dropdown);
	    actions.click().build().perform();
	    
	    Select Option3 =new Select(dropdown);
	    Option3.selectByIndex(3);
	    List<WebElement> listoptions =Option3.getOptions();
	    int size= listoptions.size();
	    System.out.println("Number of options available"+size);
	    WebElement dropdown2 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > select"));
	    Thread.sleep(5000);
	    actions.moveToElement(dropdown2);
	    actions.click().build().perform();
	    Select Option4 =new Select(dropdown2);
	    Option4.selectByVisibleText("Loadrunner");
	    WebElement dropdown3 =driver.findElement(By.id("dropdown3"));
	    Thread.sleep(5000);
	    actions.moveToElement(dropdown3);
	    actions.click().build().perform();
	    System.out.println("Number of options available"+dropdown3.getSize());
	    Select Option5 =new Select(dropdown3);
	    Option5.selectByValue("2");
	    WebElement dropdown4 =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	    dropdown4.sendKeys("Loadrunner");
	    
	   
		WebElement dropdown5 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(16) > select")); 
		 Thread.sleep(5000);
		actions.moveToElement(dropdown5);
		actions.click().build().perform();
		Select Option55 =new Select(dropdown5);
		Option55.selectByIndex(2);
		Option55.selectByIndex(3);
		driver.close();
		 
	    
	    
	    
	    
	}
	
	

}
