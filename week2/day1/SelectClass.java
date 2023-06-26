package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//select dropdown for
		WebElement op = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options=new Select(op);
		options.selectByIndex(4);
		
		//select dropdown for marketing campaign
		WebElement op1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select options1=new Select(op1);
		options1.selectByValue("CATRQ_CARNDRIVER");
		
		//select dropdown for industry
		WebElement op2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select options2=new Select(op2);
		options2.selectByVisibleText("Computer Software");
		
		//select dropdown for ownership
		WebElement op3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options3=new Select(op3);
		options3.selectByValue("OWN_LLC_LLP");
		
		//select dropdown for preferred currency
		WebElement op4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select options4=new Select(op4);
		options4.selectByVisibleText("BRL - Brazilian Real");
		
		driver.close();
		
	}
}
