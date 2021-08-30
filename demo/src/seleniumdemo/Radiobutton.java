package seleniumdemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.get("http://www.leafground.com/pages/radio.html");
	    WebElement radio =driver.findElement(By.id("no"));
	    radio.click();
	    WebElement radio2 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > label:nth-child(7) > input[type=radio]"));
	    radio2.click();
	    WebElement radio3 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(7) > div > div > input:nth-child(7)"));
	    radio3.click();
	    WebElement radio4 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > label:nth-child(6) > input[type=radio]"));

	   System.out.println("radiobutton checked or not? "+radio4.isSelected());
	   driver.close();
	    
	    
	   
	    
	    
	}

}
