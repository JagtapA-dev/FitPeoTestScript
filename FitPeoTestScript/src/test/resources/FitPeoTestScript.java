import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action.*;


	public class FitPeo_TestScript {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			WebDriverManager.chromiumdriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.get("https://fitpeo.com");
			driver.manage().window().maximize();
			driver.get("https://fitpeo.com/revenue-calculator");
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,700);");
			 
			 WebElement ele=driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']"));
			 JavascriptExecutor exe=(JavascriptExecutor)driver;
			 exe.executeScript("arguments[0].click();",ele);
			 
			 WebElement slider = driver.findElement(By.xpath("//input[@data-index='0']"));
		
			 for (int i = 1; i <=620 ; i++) {
		            slider.sendKeys(Keys.ARROW_RIGHT);
			 }
			 Thread.sleep(2000);
			 
			
			WebElement txt = driver.findElement(By.id(":R57alklff9da:"));
			String value1="5560";
			txt.sendKeys("value",value1);
			
			String num = slider.getAttribute("value");
			System.out.println(num);
			
			WebElement e1=driver.findElement(By.xpath("(//div[@class='MuiBox-root css-1pr1g5o']/div/p)[4]"));
			String v1 = e1.getText();
			System.out.println(v1);
			if(num.equalsIgnoreCase(v1))
			{
				System.out.println("Slider value is correct as per text fiels");
			}
			else
			{
				System.out.println("Slider value is not correct as per text fiels");
			}
			
			//====================================================
			
		
			 jse.executeScript("window.scrollBy(0,850);");
			 
			 driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
			 driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")).click();
			 driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")).click();
			 driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]")).click();
			 
			 WebElement e2=driver.findElement(By.xpath("(//div[@class='MuiBox-root css-1pr1g5o']/div/p)[6]"));

			System.out.println("Total_Recurring_Reimbursement :"+e2.getText());
			
			 txt.sendKeys("value","8820");

			if((e2.getText()).equalsIgnoreCase("$110700"))
			{
				System.out.println("Total_Recurring_Reimbursement by total individual patient 820 :"+e2.getText());
			}
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
