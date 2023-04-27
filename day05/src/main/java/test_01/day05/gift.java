package test_01.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gift {
	public static void main(String args[]) throws InterruptedException
	{

	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Bala");
	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727721euai011@skcet.ac.in");
	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("murugan");
	driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("balamanickam115@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("hi");
	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/label")).click();
	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}

}
