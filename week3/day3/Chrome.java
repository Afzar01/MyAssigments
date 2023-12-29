package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/main");
		drive.manage().window().maximize();
		
	}

}
