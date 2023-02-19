
//https://ineuron-courses.vercel.app/loginimport java.time.Duration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("name"))));
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("email")).sendKeys("rahul@gmail.com");
		driver.findElement(By.id("password")).sendKeys("rahul123");

		driver.findElement(By.xpath("//label[text()='DevOps']")).click();
		Thread.sleep(4000);
		Boolean genderstatus = driver.findElement(By.xpath("//input[@id='gender'][1]")).isSelected();
		WebElement gender = driver.findElement(By.xpath("//input[@id='gender'][1]"));
		System.out.println("Radio button is status " + genderstatus);
		WebElement Sign_up = driver.findElement(By.xpath("//button[text()='Sign up']"));
		// je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		je.executeScript("arguments[0].scrollIntoView(false);", gender);
		System.out.println("Page scrolled");
		Boolean signupstatus = Sign_up.isEnabled();
		System.out.println("Sign up button status before filling all values " + signupstatus);
		je.executeScript("arguments[0].click()", gender);
		Select sl = new Select(driver.findElement(By.id("state")));
		sl.selectByValue("Madhya Pradesh");
		signupstatus = Sign_up.isEnabled();
		System.out.println("Sign up button status after filling all values " + signupstatus);
		je.executeScript("arguments[0].click()", Sign_up);
		Thread.sleep(2000);
		if (driver.getCurrentUrl().contains("login")) {
			System.out.println("Account created successfully");
			driver.findElement(By.id("email1")).sendKeys("rahul@gmail.com");
			driver.findElement(By.name("password1")).sendKeys("rahul123");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			boolean loginstaus = driver.findElement(By.xpath("//button[text()='Sign out']")).isDisplayed();
			if (loginstaus) {
				System.out.println("User is logged in");
				driver.findElement(By.xpath("//button[text()='Sign out']")).click();
			}

		} else {
			String registered = driver.findElement(By.xpath("//h2[text()='Email already registered!']")).getText();
			if (registered.contains("registered")) {
				System.out.println("User is already registered");

			}

		}

		driver.quit();
	}	

}
