package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExplictWait {
`
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/waits");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement simplealrtbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("accept")));
		simplealrtbtn.click();
		
		
		
	}

}
