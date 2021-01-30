package examplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ruchirrushita/Documents/Drivers/chromedriver 11.16.56 PM");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application open");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login sucessfull!!");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
		driver.findElement(By.linkText("Admin")).click();
		//count-->Row count
		int row=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println(row);
		//col count
		int col=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td")).size();
		System.out.println(col);
		//row& col count 
		int row_col=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td")).size();
		System.out.println(row_col);
		//data from cell
		String cell=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td[2]")).getText();
	System.out.println(cell);
	//data from table:
	for(int i=1;i<=row;i++) {
		String data=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]")).getText();
		System.out.println(data);
	}
	}

}
