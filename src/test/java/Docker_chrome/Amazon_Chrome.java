package Docker_chrome;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazon_Chrome {
public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
	//docker pull selenium/standalone-chrome:latest
	//docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome:latest
	ChromeOptions options=new ChromeOptions();
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