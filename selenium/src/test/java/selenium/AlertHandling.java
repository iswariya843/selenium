	package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement alretbtn = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
		alretbtn.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(2000);
		WebElement confirbtn = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
		confirbtn.click();
		
		Alert confiralrt=driver.switchTo().alert();
		System.out.println(confiralrt.getText());
		confiralrt.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Alert promtalrt=driver.switchTo().alert();
		System.out.println(promtalrt.getText());
		promtalrt.sendKeys("iswariya");
		promtalrt.accept();
		Thread.sleep(2000);

		
		
		
		
		
	}

}
