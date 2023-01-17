package assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLContains {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		if(url.endsWith("login"))
		{
			System.out.println("URL ends with Login");
			
		}
		else
		{
			System.out.println("URL does not ends with login");
		}
		
		if(url.contains("demo"))
		{
			System.out.println("URL contains demo");
		}
		else
		{
			System.out.println("URL does not contain demo");
		}
		
		if(title.contains("HRM"))
		{
			System.out.println("Title contains HRM");
		}
		else
		{
			System.out.println("Title does not contains HRM");
		}
		
		driver.quit();
	}

}
