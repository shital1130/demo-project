package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\workplace\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://demoqa.com/sortable");
		
		WebElement source=driver.findElement(By.xpath("(//div[text()='One'])[1]"));
		WebElement target=driver.findElement(By.xpath("(//div[text()='Three'])[1]"));
		
		
		Actions act= new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		WebElement source1=driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']"));
		WebElement target2= driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Six']"));
		
		act.clickAndHold(source1).moveToElement(target2).release().build().perform();
		


	}

}
