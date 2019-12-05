package firsttt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.support.ui.Select;
public class second {
   public static void main(String[] args) throws InterruptedException
   {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver() ;
	  
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 
	 Thread.sleep(10000);
	  // driver.get("http://demo.guru99.com/test/newtours/register.php");
	   driver.navigate().to("http://demo.guru99.com/test/radio.html");
	   
	   WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
	   WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
	  
	   //Radio Button1 is selected
	   radio1.click();
	   System.out.println("Radio Button 1 Selected");
	   
	 //Radio Button2 is selected
	   radio2.click();
	   System.out.println("Radio Button 2 Selected");
	   
	   //selecting Checkbox
	   WebElement option1=driver.findElement(By.id("vfb-6-0"));
	   WebElement option2=driver.findElement(By.id("vfb-6-1"));
	   WebElement option3=driver.findElement(By.id("vfb-6-2"));
	   
	   option1.click();
	   if(option1.isSelected()) {
	       System.out.println("Checkbox 1 Selected");
	   }else {
	   System.out.println("Checkbox 1 Deselected"); }
	   
	   option2.click();
	   if(option2.isSelected()) {
	       System.out.println("Checkbox 2 Selected");
	   }else {
	   System.out.println("Checkbox 2 Deselected"); }
	   
	   option3.click();
	   if(option3.isSelected()) {
	       System.out.println("Checkbox 3 Selected");
	   }else {
	   System.out.println("Checkbox 3 Deselected"); }
	   
	   driver.navigate().refresh();

   }
}
