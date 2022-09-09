package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
WebDriver driver= new  ChromeDriver();
driver.get("https://www.guru99.com/live-selenium-project.html");
//driver.getTitle();
System.out.println("Page title is : " + driver.getTitle());
driver.close();

		
}

}
