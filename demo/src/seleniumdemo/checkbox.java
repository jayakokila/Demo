package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.get("http://www.leafground.com/pages/checkbox.html");
	    WebElement checkbox =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(3) > div:nth-child(4) > input[type=checkbox]"));
	    checkbox.click();
	    WebElement checkbox1 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(3) > div:nth-child(5) > input[type=checkbox]"));
	    checkbox1.click();
	    WebElement checkbox2 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(3) > div:nth-child(7) > input[type=checkbox]"));
	    checkbox2.click();
	    WebElement checkbox3 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(9) > div:nth-child(5) > input[type=checkbox]"));
	    System.out.println("checkbox checked or not? "+checkbox3.isSelected());
	    WebElement checkbox4 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(12) > div:nth-child(4) > input[type=checkbox]"));
	    checkbox4.click();
	    WebElement checkbox5 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(12) > div:nth-child(5) > input[type=checkbox]"));
	    checkbox5.click();
	    WebElement checkbox6 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(12) > div:nth-child(6) > input[type=checkbox]"));
	    checkbox6.click();
	    WebElement checkbox7 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(12) > div:nth-child(7) > input[type=checkbox]"));
	    checkbox7.click();
	    WebElement checkbox8 =driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(12) > div:nth-child(8) > input[type=checkbox]"));
	    checkbox8.click();
	   driver.close();
	    }
	

}
