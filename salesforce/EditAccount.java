package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditAccount {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.className("slds-truncate")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		driver.executeScript("arguments[0].click();", findElement);
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Mohamed Afzar");
		
		driver.findElement(By.xpath("//a[@title='Mohamed Afzar']")).click();
		driver.findElement(By.xpath("(//button[@part='button button-icon'])[9]")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		WebElement condition =driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[3]"));
		Actions ac = new Actions(driver);
		ac.scrollToElement(condition).perform();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[3]")).sendKeys("Successfully edited");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		System.out.println("Account was saved successfully");
		driver.quit();
		
		
	}

}
