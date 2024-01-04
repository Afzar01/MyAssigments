package week4.day2assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://en-gb.facebook.com/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drive.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		drive.findElement(By.name("firstname")).sendKeys("Mohamed");
		drive.findElement(By.name("lastname")).sendKeys("Afzar");
		drive.findElement(By.name("reg_email__")).sendKeys("1234567890");
		drive.findElement(By.name("reg_passwd__")).sendKeys("mugiwara");
		WebElement day=drive.findElement(By.id("day"));
		Select obj=new Select(day);
		obj.selectByVisibleText("18");
		WebElement month=drive.findElement(By.id("month"));
		Select Obj1=new Select(month);
		Obj1.selectByVisibleText("Oct");
		WebElement year=drive.findElement(By.id("year"));
		Select obj3=new Select(year);
		obj3.selectByVisibleText("2001");
		drive.findElement(By.xpath("//label[@class='_58mt']")).click();
		
	}

}
