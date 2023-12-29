package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/main");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Contacts")).click();
		drive.findElement(By.linkText("Create Contact")).click();
		String title=drive.getTitle();
		if (title.contains("Create Contact")) {
			System.out.println("Title of the page is : "+title);
			
		}
		drive.findElement(By.id("firstNameField")).sendKeys("Mohamed");
		drive.findElement(By.id("lastNameField")).sendKeys("Afzar");
		drive.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Z");
		drive.findElement(By.name("submitButton")).click();
		
		
		
	}

}
