package demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectlistitemDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[text()='Cras justo odio']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//li[text()='Morbi leo risus']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//li[text()='Porta ac consectetur ac']")).click();
	       Thread.sleep(2000);
			List<WebElement> items =driver.findElements(By.xpath("//ul[@id='verticalListContainer']"));
	        for( WebElement product : items){
				
				System.out.println(product.getText());
				//Select sel = new Select(product);
				//List<WebElement> selectedOptions = sel.getAllSelectedOptions();
			
	}
      
       
        
      
}
}
