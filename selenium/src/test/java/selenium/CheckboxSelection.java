package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelection {

	public static void main(String[] args) {
		// TODO Auto-gen'erated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));
		for (WebElement check : checkBoxes) {
			String id = check.getAttribute("id");
			if (id.contains("tuesday") || id.contains("wednesday")) {
			check.click();

			}

		}
	}
}
