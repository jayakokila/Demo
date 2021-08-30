package seleniumdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderlist {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	    
	    driver.findElement(By.id("searchbox")).sendKeys("In");
	    Thread.sleep(4000);
	   List<WebElement> ele1 =  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	    int len= ele1.size();
	    System.out.println(len);
	    
	    for(WebElement list_values:ele1) {
	    if(list_values.getText().equalsIgnoreCase("India")) {
	    	list_values.click();
	    	break;
	    }
}
	    driver.close();
	    }
	    

}
