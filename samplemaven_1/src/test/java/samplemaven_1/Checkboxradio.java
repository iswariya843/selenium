package samplemaven_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement sunday = driver.findElement(By.id("sunday"));
		//sunday.click();
		//System.out.println(sunday.isSelected());
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));
		for(WebElement check : checkBoxes) {
			
			String id = check.getAttribute("id");
			if (id.contains("tuesday") || id.contains("wednesday")) {					
			//	System.out.println(id);
							
		    check.click();
		
}}}}