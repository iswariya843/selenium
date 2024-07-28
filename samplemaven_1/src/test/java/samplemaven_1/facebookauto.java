package samplemaven_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookauto {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement creatnewac = driver.findElement(By.xpath("//a[text()='Create new account']"));
		creatnewac.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("iswariiya");
	WebElement lastname = driver.findElement(By.xpath("//div[@class=\'clearfix _58mh\']/child::div[2]//input"));
	lastname.sendKeys("prabakaran");
    //span[@data-name='gender_wrapper']//following::input[2]
	//span[@data-name='gender_wrapper']//following-sibling::input[@id='u_c_6_R6']
	//span[@data-name='gender_wrapper']//parent::div
	WebElement gender= driver.findElement(By.xpath("span[@data-name='gender_wrapper']//following::input[2]"));
	gender.isEnabled();
	driver.findElement(by.x)
	}

}
