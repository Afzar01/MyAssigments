package week5.day2;

import java.awt.Desktop.Action;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver drive= new ChromeDriver();
		drive.get("https://www.amazon.in/");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		drive.manage().window().maximize();
		WebElement searchBox=drive.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("oneplus 9 pro");
		searchBox.submit();
		WebElement productPrice =drive.findElement(By.xpath("(//span[text()='34,990'])[1]"));
	    String price= productPrice.getText();
	    System.out.println("Price of the first product = "+ price);
        WebElement ratingElements=drive.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-2-5 aok-align-bottom']/span)[1]"));
	    Actions rating=new Actions(drive);
	    rating.moveToElement(ratingElements).perform();
	    String ratings=ratingElements.getAttribute("innerHTML").trim();
	    System.out.println("Number of customer ratings: " + ratings);
	    drive.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	    Set <String> windowHandle=drive.getWindowHandles();
	    List<String> Cart= new ArrayList<String>(windowHandle);
	    drive.switchTo().window(Cart.get(1));
	    drive.findElement(By.id("add-to-cart-button")).click();
	    Thread.sleep(2000);
	    WebElement getPrice=drive.findElement(By.xpath("(//span[text()='38,990'])[1]"));
	    Actions subTotal= new Actions(drive);
	    subTotal.moveToElement(getPrice).perform();
	    String cartSubTotal=getPrice.getText().trim();
	    if (cartSubTotal.equals(price)) {
	    	System.out.println("Product Price="+price+ "After adding to cart= "+cartSubTotal+ "It is same");
			
		} else {
System.out.println("Product Price="+price+ " After adding to cart= "+cartSubTotal+ " It is not same");
		}
	   
	    drive.quit();
	    
            
	    
	}

}
