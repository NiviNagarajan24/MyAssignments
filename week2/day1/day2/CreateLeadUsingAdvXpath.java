package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadUsingAdvXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='username']/following::input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("micro tech");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='firstName']")).sendKeys("Sis");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='lastName']")).sendKeys("ter");
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options1 = new Select(dropdown1);
		options1.selectByVisibleText("Employee");

		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select options2 = new Select(dropdown2);
		options2.selectByValue("9001");

		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options3 = new Select(dropdown3);
		options3.selectByIndex(5);

		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select options4 = new Select(dropdown4);
		options4.selectByVisibleText("India");

		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();

		String titlepage = driver.getTitle();
		System.out.println("Page title is: "+titlepage);

		driver.close();


	}

}
