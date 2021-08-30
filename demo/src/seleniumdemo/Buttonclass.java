package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.Value;

public class Buttonclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.get("http://www.leafground.com/pages/Button.html");
	    
	    WebElement getpositionbutton =driver.findElement(By.id("position"));
	    Point xypoint = getpositionbutton.getLocation();
	    
	    int xvalue=xypoint.getX();
	    int yvalue=xypoint.getY();
	    System.out.println("X value is :" + xvalue +"Y value is :"+ yvalue);
	    Thread.sleep(5000);
	    WebElement colorbutton= driver.findElement(By.id("color"));
	    String color= colorbutton.getCssValue("background-color");
	    System.out.println("Button colour is :"+color);
	    
	    WebElement sizebutton= driver.findElement(By.id("size"));
	   int height =sizebutton.getSize().getHeight();
	   int width= sizebutton.getSize().getWidth();
	    System.out.println("Height is :"+ height + "Width is : "+ width);

	    WebElement homebutton= driver.findElement(By.id("home"));
	    homebutton.click();
	    driver.close();
	    
	}

}
