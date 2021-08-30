package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myhcl {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.myhcl.com/bprhome/Home/Index");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("jayakokila.g@hcl.com");
	    driver.findElement(By.id("idSIButton9")).click();
	    driver.findElement(By.cssSelector("#i0118")).sendKeys("Mohila@221");
	    driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
	    WebElement element1=driver.findElement(By.id("txtSearch"));
	    element1.click();
	    element1.sendKeys("itime");
	    driver.findElement(By.xpath("/html/body/ul/li/table/tbody/tr/td[1]/a")).click();
	    WebElement element2=driver.findElement(By.xpath("/html/body/main/div/div[2]/section/div[4]/div[1]/div/div/div/div[2]/div/div[1]/span[1]/div[2]/div/div/div[3]/div/div/div[4]/div/div/div/div/input"));
	    element2.sendKeys("9");
	    element2.click();
	    driver.findElement(By.xpath("/html/body/main/div/div[2]/section/span/button[1]")).click();
	    driver.close();
    
}
}