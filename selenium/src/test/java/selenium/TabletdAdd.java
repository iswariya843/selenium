package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TabletdAdd {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//WebElement data = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[6]/td[2]"));
        //System.out.println(data.getText());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr"));
        
        int rowsize = rows.size();
        
        List<WebElement> columns = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr/th"));
        int colsize = columns.size();
        
        
        for(int i = 0; i<=rowsize; i++) {
        	
        	for(int j=0; j<=colsize; j++) {
        		
        	//	WebElement datatext = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]/td["+j+"]"));
        	//	System.out.print(datatext.getText()+ " ");
        		
            	WebElement datatext1 = driver.findElement(By.xpath("//table[@name = 'BookTable']/tbody/tr/td[4]"));
            	String text1 = datatext1.getText();
            	
            	
            	for(int s=0;s<=6;s++)
            	{
            		System.out.println(text1);
            	}
            		
            		
//            	List<WebElement> datatext2 = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody/tr/td[4]"));
//            	
//            	for(WebElement ele:datatext2)
//            	{
//            		System.out.println(datatext2);
//            	}
            	
        	}System.out.println();

}}}
