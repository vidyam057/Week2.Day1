package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads_test {
	public static void main(String[] args)
	{
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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Fastenal");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya_M");
		
		//Drop down table 1
		WebElement drop1 = driver.findElement(By.name("dataSourceId"));
		Select dropDwn1=new Select(drop1);
		dropDwn1.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("abcd");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("IT QA Engineer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("00000000000");
		WebElement drop2 = driver.findElement(By.name("industryEnumId"));
		Select dropDwn2=new Select(drop2);
		dropDwn2.selectByValue("IND_SOFTWARE");
		
		WebElement drop3 = driver.findElement(By.name("ownershipEnumId"));
		Select dropDwn3=new Select(drop3);
		dropDwn3.selectByValue("OWN_PROPRIETOR");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automating the test case");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
		
		// Clearing the existing field and adding the value
		WebElement cntry = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		cntry.clear();
		cntry.sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("080");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidya_marigoudar@yahoo.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Panathur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Banglore");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("01");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Marigoudar");
		
		WebElement drop4 = driver.findElement(By.name("marketingCampaignId"));
		Select dropDwn4=new Select(drop4);
		dropDwn4.selectByValue("9002");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ABC");
		driver.findElement(By.name("birthDate")).sendKeys("23/07/1987");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		
		WebElement drop5 = driver.findElement(By.name("createLeadForm_currencyUomId"));
		Select dropDwn5=new Select(drop5);
		dropDwn5.selectByValue("ALL");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$$");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567891");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("anybody");
		
		WebElement drop6 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropDwn6=new Select(drop6);
		dropDwn6.selectByVisibleText("Alabama");
		
		WebElement drop7 = driver.findElement(By.name("generalCountryGeoId"));
		Select dropDwn7=new Select(drop7);
		dropDwn7.selectByValue("IND");
		
	}

}