package week4.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContacts {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Contacts")).click();
		drive.findElement(By.linkText("Create Contact")).click();
		drive.findElement(By.id("firstNameField")).sendKeys("Mohamed");
		drive.findElement(By.id("lastNameField")).sendKeys("Afzar");
		drive.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Naruto");
		drive.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Uzumaki");
		drive.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		drive.findElement(By.id("createContactForm_description")).sendKeys("Hello");
		drive.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mohamedafzar18102001@gmail.com");
		WebElement state=drive.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj=new Select(state);
		obj.selectByVisibleText("New York");
		drive.findElement(By.name("submitButton")).click();
		drive.findElement(By.linkText("Edit")).click();
		drive.findElement(By.id("updateContactForm_description")).clear();
		drive.findElement(By.id("updateContactForm_importantNote")).sendKeys("check state");
		drive.findElement(By.name("submitButton")).click();
		String title=drive.getTitle();
		if (title.contains("View Contact")) {
			System.out.println(title+" is verified");
			
		} else {System.out.println(title+" is not verified");

		}
	}

}
