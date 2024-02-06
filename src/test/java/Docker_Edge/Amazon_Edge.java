package Docker_Edge;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazon_Edge {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//docker pull selenium/standalone-edge
		//docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-edge:latest
		 EdgeOptions options=new EdgeOptions();
	    URL url = new URL("http://localhost:4444/wd/hub");
	    RemoteWebDriver driver = new RemoteWebDriver(url, options);
	    
			
			driver.get("https://www.amazon.in/ref=nav_logo");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println(driver.getTitle());
			
			WebElement SearchInput=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			SearchInput.sendKeys("T-Shirts");
			SearchInput.sendKeys(Keys.ENTER);
			
			System.out.println(driver.getTitle());
			driver.quit();
	}

}
