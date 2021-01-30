package examplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Key_Action {

	public static void main(String[] args)throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application open");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
        //driver.findElement(By.name("Submit")).click();
        Robot r= new Robot();
        
         r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        System.out.println("TAB");
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        System.out.println("Enter"); 
        
        
        
	}

}
