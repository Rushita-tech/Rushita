package examplepackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_Add {
	public static void main (String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application open");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login sucessfull!!");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();;
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rushita");
		driver.findElement(By.name("middleName")).sendKeys("Ruchir");
		driver.findElement(By.name("lastName")).sendKeys("Soni");
		driver.findElement(By.id("btnSave")).click();
				//driver.findElement(By.linkText("Logout")).click();
		//System.out.println("Logout!!!!");
		
	
		//driver.close();
		
		
		
	}

}
