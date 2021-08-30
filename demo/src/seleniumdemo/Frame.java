package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {
static String a="jaya";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
System.out.println(driver.getTitle());	
driver.switchTo().frame("iframeResult");
	WebElement button=driver.findElement(By.xpath("/html/body/button"));
	button.click();
	driver.switchTo().alert().sendKeys("tester");
	driver.switchTo().alert().accept();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement readthetext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));
	System.out.println(readthetext.getText());
	String text=readthetext.getText();
	if (text.contains("kokil"))
	{ 
	    System.out.println("Contains your name");
	}else{
	    System.out.println("selenium");
	}

	driver.close();
	}
}
