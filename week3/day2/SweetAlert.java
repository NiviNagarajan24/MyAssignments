package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SweetAlert {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext')]")).sendKeys("MS");
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext')]")).sendKeys("CAPE");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}

}
