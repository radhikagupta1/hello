package TestngPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Parallel {
	@Test
	public void executeSessionOne()
	{
		//First session of Web Driver
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  System.out.println("Google");
		  driver.get("http://google.com");
		  driver.quit();
	}
	@Test
	public void executeSessionTwo()
	{
		//Second session of Web Driver
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  System.out.println("facebook");
		  driver.get("http://facebook.com");
		  driver.quit();
	}
}
