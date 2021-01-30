package examplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_uploading {
	
	public static void main (String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application open");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login sucessfull!!");
		Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	WebElement fileInput=driver.findElement(By.name("photofile"));
	fileInput.sendKeys("/Users/ruchirrushita/Documents/Ruchir/DePaul Transcript.pdf");
	
	
		
	}
	}
