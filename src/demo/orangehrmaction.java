
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class orangehrmaction {

	public static void main(String[] args) throws InterruptedException {
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
		//Action class
		Actions ac =new Actions(driver);
		WebElement a1 = driver.findElement(By.xpath("//b[normalize-space()='PIM']"));
		ac.click(a1).perform();
		Thread.sleep(200);
		WebElement a2 = driver.findElement(By.xpath("//a[@id='menu_pim_Configuration']"));
		ac.moveToElement(a2).build().perform();
		Thread.sleep(200);
		WebElement a3 =driver.findElement(By.xpath("//a[@id='menu_pim_listCustomFields']"));
		ac.click(a3).perform();
		//selecting all checkbox
		WebElement cbox= driver.findElement(By.xpath("//th[@class='check']"));
		cbox.click();
		Thread.sleep(500);
		//click on add button
		driver.findElement(By.id("buttonAdd")).click();
		//fill the form and click on save button
		driver.findElement(By.xpath("//input[@id='customField_name']")).sendKeys("Test");
		Select drpscreen=new Select(driver.findElement(By.id("customField_screen")));
		drpscreen.selectByVisibleText("Personal Details");
		Select drptype=new Select(driver.findElement(By.id("customField_type")));
		drptype.selectByVisibleText("Text or Number");
		//click on save button
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		//click on leave
		/*WebElement a4=driver.findElement(By.xpath("//b[normalize-space()='Leave']"));
		ac.click(a4).perform();
		WebElement selectTime=driver.findElement(By.id("//input[@id='calFromDate']")); 	
		selectTime.click();
		Thread.sleep(200);*/
		//click on dashboard
		/*WebElement a5=driver.findElement(By.xpath("//b[normalize-space()='Dashboard']"));
		ac.click(a5).perform();
		Thread.sleep(200);
		WebElement a6=driver.findElement(By.xpath("//a[normalize-space()='']//img"));
		ac.click(a6).perform();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
