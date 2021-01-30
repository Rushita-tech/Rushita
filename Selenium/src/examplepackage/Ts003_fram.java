package examplepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Ts003_fram {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login done");
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
		
		driver.findElement(By.linkText("Admin")).click();
	
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Rushita");
		
		
		
		
	}

}
