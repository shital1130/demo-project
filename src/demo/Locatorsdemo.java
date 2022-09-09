package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//click on user name ,password and send value
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//click on submit button
		driver.findElement(By.id("btnLogin")).click();
		//action class
		Actions ac=new Actions(driver);
		WebElement a1=driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		ac.click(a1).perform();
		WebElement a2=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		ac.moveToElement(a2).perform();
		WebElement a3=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		ac.click(a3).perform();
		
		
		
		
		
		
		

	}
	
	
	
	

}
