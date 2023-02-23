package Add_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Department_add {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200/employee");
		
		WebElement header = driver.findElement(By.tagName("h3"));
		String Text = header.getText();		
		System.out.println(Text);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/nav/ul/li[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-department/app-show-dep/button")).click();
//		//WebElement element = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-dep/div/div/input"));
//		//element.sendKeys("MD");
	
		String Attri = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/app-add-edit-dep/div/div/input")).getAttribute("placeholder");
		System.out.print(Attri);
		driver.close();
		
		
	}

}
