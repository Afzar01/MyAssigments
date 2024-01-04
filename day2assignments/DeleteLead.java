package week4.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Leads")).click();
		drive.findElement(By.linkText("Find Leads")).click();
        drive.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		drive.findElement(By.name("phoneNumber")).sendKeys("99");
		drive.findElement(By.xpath("//button[@class=\"x-btn-text\"]")).click();
		WebElement id = drive.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text = id.getText();
		id.click();
		System.out.println(text);
		drive.findElement(By.linkText("Delete")).click();
		drive.findElement(By.linkText("Find Leads")).click();
//drive.findElement(By.xpath("//span[text()='Name and ID']")).click();
drive.findElement(By.name("id")).sendKeys(text);
drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(600);
WebElement c=drive.findElement(By.className("x-paging-info"));
String a =c.getText();
if (a.contains("No records")) {
	System.out.println(a+" is verified");
	
} else {System.out.println(a+" is not verified");

}
		
		
	}

}
