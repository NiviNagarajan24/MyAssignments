package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[contains(@id,'Lo')]")).click();
		driver.close();
		
	}
}
