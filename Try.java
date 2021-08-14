package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Try {
	public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	
	String title=driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.close();
	
	WebElement webUser = driver.findElement(By.id("username"));
    webUser.sendKeys("demosalesmanager");

	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	
	//String title=driver.getTitle();
	String HomeTitle=driver.getTitle();
	System.out.println(HomeTitle);
	
	if(HomeTitle.equals(HomeTitle))
	System.out.println("In home page");
	else 
	System.out.println("Not in home page");

}
}




