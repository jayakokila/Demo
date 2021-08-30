package seleniumdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				 driver.get("http://www.leafground.com/pages/Window.html");
			    driver.manage().window().maximize();
			   
			    driver.findElement(By.id("home")).click();
			    String mainWindow=driver.getWindowHandle();
			    Set<String> set =driver.getWindowHandles();
			    Iterator<String> it1= set.iterator();
			   
			    String w1=it1.next();
			    System.out.println(w1);
			    String w2= it1.next();
			    System.out.println(w2);
			    String w3= it1.next();
			    System.out.println(w3);
			    
			    
			    driver.switchTo().window(w2);
			    System.out.println(driver.getTitle());
			    while(it1.hasNext()){
			    String childWindow=it1.next();
			      
			    if(!mainWindow.equals(childWindow)){
			    driver.switchTo().window(childWindow);
			    System.out.println(driver.switchTo().window(childWindow).getTitle());
			    driver.close();
			    
			    }
			    }
			    
			   
			    driver.switchTo().window(mainWindow);
			    
			  
			    
			    } 
}


