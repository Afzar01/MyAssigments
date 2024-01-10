package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		String windowHandle=drive.getWindowHandle();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Contacts")).click();
		drive.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		drive.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set <String> windowHandles=drive.getWindowHandles();
		List<String> first= new ArrayList<String>(windowHandles);
		drive.switchTo().window(first.get(1));
		System.out.println(drive.getTitle());
		
		WebElement firstContact=drive.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    firstContact.click();
	    drive.switchTo().window(windowHandle);
	    drive.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	    Set <String> windowHandles1=drive.getWindowHandles();
		List<String> second= new ArrayList<String>(windowHandles1);
		drive.switchTo().window(second.get(1));
		System.out.println(drive.getTitle());
		WebElement secondContact=drive.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]"));
		secondContact.click();
		drive.switchTo().window(windowHandle);
		drive.findElement(By.className("buttonDangerous")).click();
		Alert msg=drive.switchTo().alert();
		msg.accept();
		String title1=drive.getTitle();
		System.out.println(title1+" : is verified");
		drive.quit();
		
	    
	
	
	
	}

	
		
	}
	


