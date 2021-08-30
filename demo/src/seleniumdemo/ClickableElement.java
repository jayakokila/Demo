package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickableElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    driver.get("http://omayo.blogspot.com/");
		    WebDriverWait var1=new WebDriverWait(driver,20);
		    Thread.sleep(5000);
		    var1.until(ExpectedConditions.elementToBeClickable(By.id("radio2")));
		    String value1=driver.findElement(By.id("radio2")).getText();
		    System.out.println(value1);
	}
}
