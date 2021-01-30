package examplepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Ts002 {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application open");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
