package examplepackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;



public class Login {
	public static void main (String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application open");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		//------->Alert<-------
		//Alert a=driver.switchTo().alert();
		//Thread.sleep(1000);
		//a.accept();
		
		//------>Robert<-----
		
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login sucessfull!!");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout!!!!");
		
	
		//driver.close();
		
		
		
	}

}
