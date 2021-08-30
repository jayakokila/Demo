package seleniumdemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	    driver.get("http://demo.automationtesting.in/Datepicker.html");
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("document.getElementById('datepicker1').value='11/02/2021'");
	    jse.executeScript("document.getElementById('datepicker2').value='07/02/2021'");
	 
	    
	    
}
}
