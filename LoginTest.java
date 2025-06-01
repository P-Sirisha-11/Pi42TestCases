package bookcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://bookcart.azurewebsites.net/");
		driver.findElement(By.name("LogOut")).click();
		driver.findElement(By.name("Username"));
		driver.quit();
		
	}
	

}
