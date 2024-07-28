package samplemaven_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstmavanclass {
	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	//WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
	//login.click();
	//WebElement email = driver.findElement(By.xpath("//input[@id='Email' and @name='Email']"));
	//email.sendKeys("ishu@gmail.com");
	//WebElement password = driver.findElement(By.xpath("//input[@class='password' or @name='Password']"));
	//password.sendKeys("1234");
	//WebElement buttonlogin = driver.findElement(By.xpath("//button[contains(@type, 'sub')]"));
	//buttonlogin.click();
	//WebElement forgetpass = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
	//forgetpass.click();
	WebElement searchstore=driver.findElement(By.cssSelector("input#small-searchterms"));
	searchstore.sendKeys("computers");
	WebElement searchbtn = driver.findElement(By.cssSelector("button.button-1[type='submit']"));
	searchbtn.click();
	//WebElement desktop = driver.findElement(By.cssSelector("li.active.last>*"));
	//input[id^='q']
	//button[type^='submit']
	driver.findElement(By.cssSelector("button.button-1.search-button")).click();
	//WebElement element = driver.findElement(By.cssSelector("input[id^='q']"));
	
	//driver.findElement(By.xpath("//div[@class='header-menu']//child::a[text()='Computers ']")).click();
	}

} 

