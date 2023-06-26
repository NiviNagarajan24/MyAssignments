package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account11");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("enterlocalname");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("enetersitename");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("500000");
		WebElement selectindustry = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(selectindustry);
		industry.selectByValue("IND_SOFTWARE");
		WebElement selectownersip = driver.findElement(By.name("ownershipEnumId"));
		Select ownership=new Select(selectownersip);
		ownership.selectByVisibleText("S-Corporation");
		WebElement selectsource = driver.findElement(By.id("dataSourceId"));
		Select source=new Select(selectsource);
		source.selectByValue("LEAD_EMPLOYEE");
		WebElement selectMarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaign=new Select(selectMarketingCampaign);
		marketingCampaign.selectByIndex(7);
		WebElement selectstateorprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateorprovince=new Select(selectstateorprovince);
		stateorprovince.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		driver.close();
		

	}

}
