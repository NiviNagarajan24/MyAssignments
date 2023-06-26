package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaftaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
//		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nivi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nagarajan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nivicovai@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9566776366");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.close();
	}




}
