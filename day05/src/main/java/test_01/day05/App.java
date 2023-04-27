package test_01.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
    	 WebDriverManager.firefoxdriver().setup();
         WebDriver driver=new FirefoxDriver();
         driver.get("https://demoqa.com/droppable/");
         driver.findElement(By.xpath("//*[@id=\\\"draggable\\\"]"));
         driver.findElement(By.xpath("//*[@id=\\\"droppable\\\"]"));
         
         Actions act=new Actions(driver);
         
    }
}
