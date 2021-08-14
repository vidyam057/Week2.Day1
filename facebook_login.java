package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_login {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vidya");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcd_57");
		
		
		WebElement drop1 = driver.findElement(By.name("birthday_day"));
		Select dropDwn1=new Select(drop1);
		dropDwn1.selectByValue("1");
		
		
		WebElement drop2 = driver.findElement(By.name("birthday_month"));
		Select dropDwn2=new Select(drop2);
		dropDwn2.selectByValue("1");
		
		
		WebElement drop3 = driver.findElement(By.name("birthday_year"));
		Select dropDwn3=new Select(drop3);
		dropDwn3.selectByValue("2021");	
}
}
