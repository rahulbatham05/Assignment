package assignment5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSocialIconURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		List<WebElement>socialIcon=driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		System.out.println(socialIcon.size());
		Map<String,String> Social=new HashMap<String, String>();
		
		//System.out.println(socialIcon);
		for(int i=0;i<4;i++)
		{
			String URL=socialIcon.get(i).getAttribute("href");
			String [] Socialmedia=URL.split("\\.");
			if(URL.contains("twitter"))
			{
				String []social=Socialmedia[0].split("//");
				Social.put(social[1], URL);
			}
			else
			{
				Social.put(Socialmedia[1], URL);
			}
				
			//System.out.println("URL is "+URL);
			
		}
		System.out.println(Social);	
		driver.quit();
	}

}
