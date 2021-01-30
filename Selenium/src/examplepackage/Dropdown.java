package examplepackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	
		public static void main (String args[]) throws Exception{
			System.setProperty("webdriver.chrome.driver", "/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			System.out.println("Application open");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login sucessfull!!");
			driver.findElement(By.linkText("Admin")).click();
			driver.findElement(By.id("menu_admin_UserManagement")).click();
			//dropdown
			driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("Aatmaram");
			Select st =new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		    st.selectByVisibleText("ESS");
		    System.out.println("Select Dropdown list!");
		    driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Aatmaram");
		    Select st1=new Select(driver.findElement(By.name("searchSystemUser[status]")));
		    st1.selectByVisibleText("Enabled");
		    driver.findElement(By.id("searchBtn")).click();
		    driver.findElement(By.name("chkSelectRow[]")).click();
		    System.out.println("Check-box click");
		    driver.findElement(By.id("btnDelete")).click();
	
		    
		    
			
		
			

		
	}

	}
