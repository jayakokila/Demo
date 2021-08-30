package seleniumdemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Draggable {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	    driver.get("http://www.leafground.com/pages/drag.html");
	    WebElement element1=driver.findElement(By.id("draggable"));
	    
	    Actions act1=new Actions(driver);
	    act1.dragAndDropBy(element1,250,350).build().perform();
	    TakesScreenshot t1= (TakesScreenshot)driver;
	    File source = t1.getScreenshotAs(OutputType.FILE);
	    File destination= new File("C:\\Users\\karth\\OneDrive\\Desktop\\Reports\\screen3.jpg");
	    FileHandler.copy(source, destination);
	    
	    
	    
	    
	    }
}

