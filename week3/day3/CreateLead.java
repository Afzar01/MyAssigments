package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/main");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Create Lead")).click();
		drive.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohamed");
		drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Afzar");
		drive.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000");
	WebElement	kal=drive.findElement(By.id("createLeadForm_industryEnumId"));
	Select select=new Select(kal);
	select.selectByVisibleText("Computer Software");
		drive.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/18/2001");
		drive.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		drive.findElement(By.className("smallSubmit")).click();
		
	}

}
