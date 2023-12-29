package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCampaign {
	public static void main(String[] args) {
		ChromeDriver drive= new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/main");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemosalesManager");
		drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Marketing")).click();
		drive.findElement(By.linkText("Create Campaign")).click();
		String title=drive.getTitle();
	if (title.contains("Create Campaign")) {
		System.out.println(title+" is verified");
	} else {System.out.println(title+ " is not verified");

	} 
		
	drive.findElement(By.id("createMarketingCampaignForm_campaignName")).sendKeys("Afzar002");
	
	drive.findElement(By.id("createMarketingCampaignForm_fromDate")).sendKeys("12/5/23");
	drive.findElement(By.id("createMarketingCampaignForm_thruDate")).sendKeys("12/13/23");
	drive.findElement(By.id("createMarketingCampaignForm_budgetedCost")).sendKeys("1000000");
	drive.findElement(By.name("estimatedCost")).sendKeys("200000000");
	drive.findElement(By.name("submitButton")).click();
	String title2=drive.getTitle();
	if (title2.contains("View Campaign")) {
		System.out.println(title2+" is verified");
		
	} else {System.out.println(title2+" is not verified");

	}
	}
	

}
