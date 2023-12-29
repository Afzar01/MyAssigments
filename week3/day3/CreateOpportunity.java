package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOpportunity {
	public static void main(String[] args) {
		ChromeDriver drive= new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/main");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemosalesManager");
		drive.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Opportunities")).click();
		drive.findElement(By.linkText("Create Opportunity")).click();
		String title=drive.getTitle();
		if (title.contains("Create Opportunity")) {
			System.out.println(title+" is verified");
			
		} else {System.out.println(title+" is not verified");

		}
		drive.findElement(By.id("createOpportunityForm_opportunityName")).sendKeys("Learn_Selenium");
		drive.findElement(By.id("createOpportunityForm_accountPartyId")).sendKeys("10057");
		WebElement Stage=drive.findElement(By.id("createOpportunityForm_opportunityStageId"));
		Select obj=new Select(Stage);
		obj.selectByValue("SOSTG_QUOTED");
		drive.findElement(By.id("createOpportunityForm_estimatedCloseDate")).sendKeys("12/13/23");
		drive.findElement(By.name("submitButton")).click();
		String title2=drive.getTitle();
		if (title2.contains("View Opportunity")) {
			System.out.println(title2+" is verified");
			
		} else { System.out.println(title2+" is not verified");

		}
		
		
	}

}
