package pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
public class pro2 {
	WebDriver driver;
  @Test
  public void test1() throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  String url="https://www.godaddy.com/en-in";
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(7000);
	  String gtitle = driver.getTitle();
	  System.out.println(gtitle);
	  String gurl=driver.getCurrentUrl();
	  String title="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(gtitle, title);
	  Assert.assertEquals(gurl, url);
	  Thread.sleep(7000);
	  driver.quit();
	  
  }
}