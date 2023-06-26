package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("9566776366");
		//
		WebElement birth = driver.findElement(By.id("day"));
		Select birthdate=new Select(birth);
		birthdate.selectByValue("21");
		//
		WebElement birth1 = driver.findElement(By.id("month"));
		Select birthmonth=new Select(birth1);
		birthmonth.selectByVisibleText("Mar");
		//
		WebElement birth2 = driver.findElement(By.id("year"));
		Select birthyear=new Select(birth2);
		birthyear.selectByVisibleText("1991");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		driver.close();

	}

}
