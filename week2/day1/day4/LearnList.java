package week2.day4;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		List<WebElement> findElementsoflinks = driver.findElements(By.tagName("a"));
		int linksize=findElementsoflinks.size();
		System.out.println("Size of links:"+linksize);
		for (int i = 0; i < linksize; i++) {
			String text= findElementsoflinks.get(i).getText();
			System.out.println(text);
		}
		
	}
}
