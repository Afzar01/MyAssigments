package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
	public static void main(String[] args) {
		//Launch Chrome
		ChromeDriver drive=new ChromeDriver();
		//load url
		drive.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//input[@id='username']")).sendKeys("DemosalesManager");
		drive.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		drive.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		drive.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		drive.findElement(By.xpath("//a[text()='Create Lead']")).click();
		drive.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("abc");
		drive.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Naruto");
		drive.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Uzumaki");
		drive.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
	}

}
