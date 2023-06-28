package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadsUsingAdvXpath {

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
		driver.findElement(By.xpath("//a[text()='Create Lead']/following::a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nivi");
		
		//driver.findElement(By.xpath("//label[text()='First name:']/following::input[@class=' x-form-text x-form-field ']")).sendKeys("Nivi");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("(///table[@class='x-grid3-row-table']//a")).click();
		driver.findElement(By.xpath("(///table[@class='x-grid3-row-table']//a[1]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("(span[@class='requiredField']/following::input[@id='updateLeadForm_firstName']")).clear();
		driver.findElement(By.xpath("(span[@class='requiredField']/following::input[@id='updateLeadForm_firstName']")).sendKeys("NiviNagarajan");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='updateLeadForm_companyName']")).sendKeys("testleafupdated");
		driver.findElement(By.xpath("(//tr//input[@name='submitButton'])[1]")).click();
		String updated_company_name = driver.findElement(By.xpath("//tr//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(updated_company_name);
	
		driver.close();
		
	}

}
