package calendarcontrols;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddCourse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.name("password1")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']"))).perform();
		driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
		//act.click(driver.findElement(By.xpath("//span[text()='Manage Courses']")));
		
		act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Sign out']"))).perform();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Course']")).click();
		driver.findElement(By.xpath("//input[@name='thumbnail']")).sendKeys("C:\\Users\\a\\Pictures\\1238889Copy.png");
		driver.findElement(By.id("name")).sendKeys("Automation");
		driver.findElement(By.id("description")).sendKeys("Selenium Automation using JAVA");
		driver.findElement(By.name("instructorName")).sendKeys("Rahul Batham");
		driver.findElement(By.id("price")).sendKeys("100");
		driver.findElement(By.name("startDate")).click();
		driver.findElement(By.xpath("(//div[@class='react-datepicker__week']//following::div)[5]")).click();
		System.out.println("Selected start date is "+driver.findElement(By.name("startDate")).getAttribute("value"));
		driver.findElement(By.name("endDate")).click();
		driver.findElement(By.xpath("(//div[@class='react-datepicker__week']//following::div)[13]")).click();
		System.out.println("Selected end date is "+driver.findElement(By.name("endDate")).getAttribute("value"));
		driver.findElement(By.xpath("//div[normalize-space()='Select Category']")).click();
		driver.findElement(By.xpath("//button[text()='Testing']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//Boolean Coursestatus=driver.findElement(By.xpath("//table[contains(@class,'courses-table')]//td[text()='Rahul Batham']")).isDisplayed();
		Boolean Coursestatus=driver.findElement(By.xpath("//td[text()='Rahul Batham']")).isDisplayed();
		System.out.println("Course is displayed "+Coursestatus);
		if(Coursestatus.booleanValue())
		{
					
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[text()='Rahul Batham']//preceding::*[input]")).click();
			driver.findElement(By.xpath("//td[text()='Rahul Batham']//following::button[text()='Delete']")).click();
			System.out.println("Course deleted");
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("Course not found");
			
		}
		((JavascriptExecutor) driver).executeScript("window.scrollTo(1, document.body.scrollHeight)");
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
	}

}
