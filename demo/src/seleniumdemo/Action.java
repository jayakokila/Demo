package seleniumdemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	    driver.get("http://www.leafground.com/pages/Edit.html");
	    WebElement element1=driver.findElement(By.id("email"));
	    Actions act1=new Actions(driver);
	    act1.sendKeys(element1,"jayakokila").doubleClick().contextClick().build().perform();
	    Robot r1= new Robot();
	    Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
	    Rectangle rect1= new Rectangle(sc_size);
	    BufferedImage source= r1.createScreenCapture(rect1);
	    File destination =new File("C:\\Users\\karth\\OneDrive\\Desktop\\Reports\\screen4.jpg");
	    ImageIO.write(source, "jpg", destination);
	    
	    
	    
	    }
	    
	    
	  
}
