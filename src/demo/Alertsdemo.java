package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\workplace\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");			
	        driver.findElement(By.name("cusid")).sendKeys("53929");					
	        driver.findElement(By.name("submit")).submit();			
	        		
	        // Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();		
		
	   
	   
	  
	   
	   
		
	}

}
