package Week2.Day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement drop1=driver.findElement(By.id("dropdown1"));
		Select dropDwn1= new Select(drop1);
		dropDwn1.selectByIndex(1);
		
		WebElement drop2=driver.findElement(By.name("dropdown2"));
		Select dropDwn2= new Select(drop2);
		dropDwn2.selectByVisibleText("Selenium");
		
		WebElement drop3=driver.findElement(By.id("dropdown3"));
		Select dropDwn3= new Select(drop3);
		dropDwn3.selectByValue("1");
		
		int size_of_dropdown = dropDwn3.getOptions().size();
		System.out.println(size_of_dropdown);
		
	}

}
