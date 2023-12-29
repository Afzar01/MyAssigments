package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CreateAccounts {
public static void main(String[] args) {
	ChromeDriver drive= new ChromeDriver();
	drive.get("http://leaftaps.com/opentaps/control/main");
	drive.manage().window().maximize();
	drive.findElement(By.id("username")).sendKeys("DemosalesManager");
	drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	drive.findElement(By.className("decorativeSubmit")).click();
	drive.findElement(By.linkText("CRM/SFA")).click();
	drive.findElement(By.linkText("Accounts")).click();
	String title=drive.getTitle();
	if (title.contains("Accounts")) {
		System.out.println("title of the page "+title+" is verified successfully");
	}else {System.out.println("title of the page "+title+" is not verified");}
	drive.findElement(By.linkText("Create Account")).click();
	drive.findElement(By.id("accountName")).sendKeys("Afzar001");
	WebElement industry=drive.findElement(By.name("industryEnumId"));
	Select obj=new Select(industry);
	obj.selectByIndex(3);
	WebElement Ownership=drive.findElement(By.name("ownershipEnumId"));
	Select obj2=new Select(Ownership);
	obj2.selectByValue("OWN_PARTNERSHIP");
	WebElement source=drive.findElement(By.id("dataSourceId"));
	Select obj3=new Select(source);
	obj3.selectByVisibleText("Partner");
	drive.findElement(By.className("smallSubmit")).click();
	
	String title1=drive.getTitle();
	if (title1.contains("Account Details")) {
		System.out.println(title1+" is verified successfully");
		
	} else {System.out.println(title1+" is not verified");

	}
	
	
	
	
	
	
	
	
	
	
}
}
