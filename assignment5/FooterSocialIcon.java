package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSocialIcon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		List<WebElement>socialIcon=driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		System.out.println(socialIcon.size());
		//System.out.println(socialIcon);
		for(int i=0;i<4;i++)
		{
			String URL=socialIcon.get(i).getAttribute("href");
			System.out.println(URL);
		}
		driver.quit();
	}

}
