package Docker_Firefox;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazon_Firefox {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//docker pull selenium/standalone-firefox:latest
		//docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-firefox:latest
		FirefoxOptions options = new FirefoxOptions();
		URL url = new URL("http://localhost:4444/wd/hub");
	    RemoteWebDriver driver = new RemoteWebDriver(url, options);
	    
			driver.get("https://www.amazon.in/ref=nav_logo");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			WebElement SearchInput=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			Thread.sleep(2000);
			SearchInput.sendKeys("T-Shirts");
			Thread.sleep(2000);
			SearchInput.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			driver.quit();
	}
	}


