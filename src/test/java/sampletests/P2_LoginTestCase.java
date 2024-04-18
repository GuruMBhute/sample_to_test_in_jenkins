package sampletests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_LoginTestCase {

	public static void main(String[] args) throws InterruptedException {

		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//open url on browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //orange hrm
		
		//maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//enter username password
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//get title and compare title
		String act_tiltle=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(act_tiltle.equals(exp_title)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test got failed");
		}
		
		
		//close browser
		driver.close();    //or driver.quit();
	}

}
