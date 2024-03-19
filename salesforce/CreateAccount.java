package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.className("slds-truncate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		driver.executeScript("arguments[0].click();", findElement);
		driver.findElement(By.xpath("(//div[text()='New'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Mohamed Afzar");
		Thread.sleep(30);
		driver.findElement(By.xpath("(//button[@role='combobox'])[4]")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		System.out.println(" Account created successfully");
		driver.quit();
		
	}

}
