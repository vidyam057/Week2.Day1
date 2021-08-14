package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		driver.findElementByName("UserFirstName").sendKeys("vidya");
		driver.findElementByName("UserEmail").sendKeys("Vidyam057@yahoo.com");
		driver.findElementByName("CompanyName").sendKeys("Fastenal");
		driver.findElementByName("UserPhone").sendKeys("1234567891");
		driver.findElementByName("UserLastName").sendKeys("M");
		
		WebElement drop1 = driver.findElementById("UserTitle-GM91");	
		Select dropDown1=new Select(drop1);
		dropDown1.selectByValue("Sales_Manager_AP");
		
		WebElement drop2 = driver.findElementByName("CompanyEmployees");	
		Select dropDown2=new Select(drop2);
		dropDown2.selectByValue("9");
		
		WebElement drop3 = driver.findElementByName("CompanyCountry");	
		Select dropDown3=new Select(drop3);
		dropDown3.selectByValue("India");
			
	}
	
}
