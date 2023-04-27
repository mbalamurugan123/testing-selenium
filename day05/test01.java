import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class test01 {
	@Test(priority=2)
	public void TC_001() {
//	 WebDriverManager.firefoxdriver().setup();
//     WebDriver driver=new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions(); 
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

     driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
     String title=driver.getTitle();
     System.out.println(title)
     Assert.assertEquals(title,title);

  }
}